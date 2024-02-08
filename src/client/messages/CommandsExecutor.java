package client.messages;

import client.MapleClient;
import database.DatabaseConnection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.HashMap;
import tools.FileoutputUtil;
import tools.Pair;
import client.messages.commands.player.*;
import client.messages.commands.intern.*;
import client.messages.commands.gm.*;
import client.messages.commands.headgm.*;
import client.messages.commands.developer.*;
import client.messages.commands.admin.*;

public class CommandsExecutor {

    public static enum GMLevel {

        PLAYER('@', 0),
        INTERN('!', 1),
        GAMEMASTER('!', 2),
        HEAD_GAMEMASTER('!', 3),
        DEVELOPER('!', 4),
        ADMINISTRATOR('!', 5);
        private char commandPrefix;
        private int level;

        GMLevel(char ch, int level) {
            commandPrefix = ch;
            this.level = level;
        }

        public char getCommandPrefix() {
            return commandPrefix;
        }

        public int getLevel() {
            return level;
        }
    }

    public static CommandsExecutor instance = new CommandsExecutor();

    public static CommandsExecutor getInstance() {
        return instance;
    }

    private static final char USER_HEADING = '@';
    private static final char GM_HEADING = '!';

    public static boolean isCommand(MapleClient client, String content) {
        char heading = content.charAt(0);
        if (client.getPlayer().isIntern()) {
            return heading == USER_HEADING || heading == GM_HEADING;
        }
        return heading == USER_HEADING;
    }

    private HashMap<String, Command> registeredCommands = new HashMap<>();
    private Pair<List<String>, List<String>> levelCommandsCursor;
    private List<Pair<List<String>, List<String>>> commandsNameDesc = new ArrayList<>();

    private CommandsExecutor() {
        registerLv0Commands();//Player
        registerLv1Commands();//Intern
        registerLv2Commands();//GM
        registerLv3Commands();//Head GM
        registerLv4Commands();//Developer
        registerLv5Commands();//Admin
    }

    public List<Pair<List<String>, List<String>>> getGmCommands() {
        return commandsNameDesc;
    }

    public void handle(MapleClient client, String message) {
        try {
            handleInternal(client, message);
        } catch (Exception e) {
            client.getPlayer().blueMessage("Something went wrong trying to execute your command. Please notify the administrator.");
            e.printStackTrace();
        }
    }

    private void handleInternal(MapleClient client, String message) {
        if (client.getPlayer().getMapId() == 300000012) {
            client.getPlayer().blueMessage("You do not have permission to use commands while in jail.");
            return;
        }
        final String splitRegex = "[ ]";
        String[] splitedMessage = message.substring(1).split(splitRegex, 2);
        if (splitedMessage.length < 2) {
            splitedMessage = new String[]{splitedMessage[0], ""};
        }

        client.getPlayer().setLastCommandMessage(splitedMessage[1]);    // thanks Tochi & Nulliphite for noticing string messages being marshalled lowercase
        final String commandName = splitedMessage[0].toLowerCase();
        final String[] lowercaseParams = splitedMessage[1].toLowerCase().split(splitRegex);

        final Command command = registeredCommands.get(commandName);

        if (command == null) {
            client.getPlayer().blueMessage("Command '" + commandName + "' is not available.");
            return;
        }

        if (client.getPlayer().getGMLevel() < command.getRank()) {
            client.getPlayer().blueMessage("You do not have permission to use this command.");
            return;
        }
        String[] params;
        if (lowercaseParams.length > 0 && !lowercaseParams[0].isEmpty()) {
            params = Arrays.copyOfRange(lowercaseParams, 0, lowercaseParams.length);
        } else {
            params = new String[]{};
        }

        command.execute(client, params);
        writeLog(client, message);
    }

    private void writeLog(MapleClient client, String command) {
        PreparedStatement ps = null;
        try {
            ps = DatabaseConnection.getConnection().prepareStatement("INSERT INTO " + "gmlog" + " (cid, command, mapid) VALUES (?, ?, ?)");
            ps.setInt(1, client.getPlayer().getId());
            ps.setString(2, command);
            ps.setInt(3, client.getPlayer().getMap().getId());
            ps.executeUpdate();
        } catch (SQLException ex) {
            FileoutputUtil.outputFileError(FileoutputUtil.PacketEx_Log, ex);
            ex.printStackTrace();
        } finally {
            try {
                ps.close();
            } catch (SQLException e) {/*Err.. Fuck?*/

            }
        }
    }

    private void addCommandInfo(String name, Class<? extends Command> commandClass) {
        try {
            levelCommandsCursor.getRight().add(commandClass.newInstance().getDescription());
            levelCommandsCursor.getLeft().add(name);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void addCommand(String[] syntaxs, Class<? extends Command> commandClass) {
        for (String syntax : syntaxs) {
            addCommand(syntax, 0, commandClass);
        }
    }

    private void addCommand(String syntax, Class<? extends Command> commandClass) {
        //for (String syntax : syntaxs){
        addCommand(syntax, 0, commandClass);
        //}
    }

    private void addCommand(String[] surtaxes, int rank, Class<? extends Command> commandClass) {
        for (String syntax : surtaxes) {
            addCommand(syntax, rank, commandClass);
        }
    }

    private void addCommand(String syntax, int rank, Class<? extends Command> commandClass) {
        if (registeredCommands.containsKey(syntax.toLowerCase())) {
            System.out.println("Error on register command with name: " + syntax + ". Already exists.");
            return;
        }

        String commandName = syntax.toLowerCase();
        addCommandInfo(commandName, commandClass);

        try {
            Command commandInstance = commandClass.newInstance();     // thanks Halcyon for noticing commands getting reinstanced every call
            commandInstance.setRank(rank);

            registeredCommands.put(commandName, commandInstance);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    private void registerLv0Commands() {
        levelCommandsCursor = new Pair<>((List<String>) new ArrayList<String>(), (List<String>) new ArrayList<String>());
        addCommand("dispose", 0, DisposeCommand.class);
        addCommand("checkdrops", 0, CheckDropsCommand.class);
        addCommand("dex", 0, StatDexCommand.class);
        addCommand("int", 0, StatIntCommand.class);
        addCommand("luk", 0, StatLukCommand.class);
        addCommand("str", 0, StatStrCommand.class);
        //addCommand("enablepic", 0, EnablePicCommand.class);
        addCommand("mob", 0, MobCommand.class);
        addCommand("clearslot", 0, ClearSlotCommand.class);
        addCommand("check", 0, CheckCommand.class);
        addCommand("help", 0, HelpCommand.class);
        addCommand("ranking", 0, RankingCommand.class);
        addCommand("togglesmega", 0, ToggleSmegaCommand.class);
        addCommand("uptime", 0, UpTimeCommand.class);
        addCommand("whodrops", 0, WhoDropsCommand.class);
        addCommand("joinevent", 0, JoinEventCommand.class);

        //addCommand("", 0, Command.class);
        commandsNameDesc.add(levelCommandsCursor);
    }

    private void registerLv1Commands() {
        levelCommandsCursor = new Pair<>((List<String>) new ArrayList<String>(), (List<String>) new ArrayList<String>());
        addCommand("job", 1, JobCommand.class);
        addCommand("warp", 1, WarpCommand.class);
        addCommand("goto", 1, GoToCommand.class);
        addCommand("heal", 1, HealCommand.class);
        addCommand("hide", 1, HideCommand.class);
        addCommand("itemcheck", 1, ItemCheckCommand.class);
        addCommand("mapname", 1, MapNameCommand.class);
        addCommand("onlinechannel", 1, OnlineChannelCommand.class);
        addCommand("online", 1, OnlineCommand.class);
        addCommand("reports", 1, ReportsCommand.class);
        addCommand("song", 1, SongCommand.class);
        addCommand("jail", 1, JailCommand.class);
        addCommand("say", 1, SayCommand.class);
        addCommand("search", 1, SearchCommand.class);
        addCommand("tempban", 1, TempBanCommand.class);
        addCommand("warpto", 1, WarpToCommand.class);
        //addCommand("", 1, Command.class);
        //addCommand(new String[]{"song", "music"}, 1, .class);
        commandsNameDesc.add(levelCommandsCursor);
    }

    private void registerLv2Commands() {
        levelCommandsCursor = new Pair<>((List<String>) new ArrayList<String>(), (List<String>) new ArrayList<String>());
        addCommand("cleardrops", 2, ClearDropsCommand.class);
        addCommand("healmap", 2, HealMapCommand.class);
        addCommand("kill", 2, KillCommand.class);
        addCommand("dc", 2, DcCommand.class);
        addCommand("killall", 2, KillAllCommand.class);
        addCommand("listallsquads", 2, ListAllSquadsCommand.class);
        addCommand("warphere", 2, WarpHereCommand.class);
        addCommand("monitor", 2, MonitorCommand.class);
        addCommand("ban", 2, BanCommand.class);
        addCommand("shop", 2, ShopCommand.class);
        addCommand("gmshop", 2, GMShopCommand.class);
        addCommand("level", 2, LevelCommand.class);
        addCommand("startevent", 2, StartEventCommand.class);
        addCommand("scheduleevent", 2, ScheduleEventCommand.class);
        addCommand("endevent", 2, EndEventCommand.class);
        addCommand("askox", 2, AskOXCommand.class);
        addCommand("buffmap", 2, BuffMapCommand.class);
        //addCommand("", 2, Command.class);
        commandsNameDesc.add(levelCommandsCursor);
    }

    private void registerLv3Commands() {
        levelCommandsCursor = new Pair<>((List<String>) new ArrayList<String>(), (List<String>) new ArrayList<String>());
        addCommand("spawn", 3, SpawnCommand.class);
        addCommand("clearreports", 3, ClearReportsCommand.class);
        addCommand("fame", 3, FameCommand.class);
        addCommand("unban", 3, UnbanCommand.class);
        //addCommand("", 3, Command.class);               
        commandsNameDesc.add(levelCommandsCursor);
    }

    private void registerLv4Commands() {
        levelCommandsCursor = new Pair<>((List<String>) new ArrayList<String>(), (List<String>) new ArrayList<String>());
        addCommand("killalldrops", 4, KillAllDropsCommand.class);
        addCommand("monsterdebug", 4, MonsterDebugCommand.class);
        addCommand("looknpc", 4, LookNpcCommand.class);
        addCommand("lookportal", 4, LookPortalCommand.class);
        addCommand("lookreactor", 4, LookReactorCommand.class);
        addCommand("mynpcpos", 4, MyNpcPosCommand.class);
        addCommand("spawndebug", 4, SpawnDebugCommand.class);
        addCommand("jobperson", 4, JobPersonCommand.class);
        addCommand("drop", 4, DropCommand.class);
        addCommand("multidrop", 4, MultiDropCommand.class);
        addCommand("reloaddrops", 4, ReloadDropsCommand.class);
        addCommand("reloadevents", 4, ReloadEventsCommand.class);
        addCommand("reloadmap", 4, ReloadMapCommand.class);
        addCommand("reloadops", 4, ReloadOpsCommand.class);
        addCommand("reloadportal", 4, ReloadPortalCommand.class);
        addCommand("reloadshops", 4, ReloadShopsCommand.class);
        addCommand("npc", 4, NpcCommand.class);
        addCommand("setsubcategory", 4, SetSubCategoryCommand.class);
        addCommand("ap", 4, ApCommand.class);
        //addCommand("", 4, Command.class);
        commandsNameDesc.add(levelCommandsCursor);
    }

    private void registerLv5Commands() {
        levelCommandsCursor = new Pair<>((List<String>) new ArrayList<String>(), (List<String>) new ArrayList<String>());
        addCommand("servermessage", 5, ServerMessageCommand.class);
        addCommand("playernpc", 5, PlayerNpcCommand.class);
        //addCommand("offlineplayernpc", 5, OfflinePlayerNpcCommand.class);
        addCommand("toggleoffence", 5, ToggleOffenceCommand.class);
        addCommand("mesorate", 5, MesoRateCommand.class);
        addCommand("droprate", 5, DropRateCommand.class);
        addCommand("exprate", 5, ExpRateCommand.class);
        addCommand("setgmlevel", 5, SetGMLevelCommand.class);
        addCommand("travelrate", 5, TravelRateCommand.class);
        addCommand("shutdowntime", 5, ShutdownTimeCommand.class);
        //addCommand("", 5, Command.class);             
        commandsNameDesc.add(levelCommandsCursor);
    }

    public HashMap<String, Command> getRegisteredCommands() {
        return registeredCommands;
    }
}
