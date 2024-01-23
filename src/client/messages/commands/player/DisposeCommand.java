package client.messages.commands.player;

import client.messages.Command;
import client.MapleClient;
import scripting.NPCScriptManager;
import tools.packet.CWvsContext;

public class DisposeCommand extends Command{

    {
        setDescription("Fix client problems.");
    }

    @Override
    public void execute(MapleClient c, String[] params){       
        c.removeClickedNPC();
        c.getPlayer().setConversation(0);
        NPCScriptManager.getInstance().dispose(c);
        c.getSession().write(CWvsContext.enableActions());
    }
}