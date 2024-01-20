
package client.messages.commands.player;

import client.messages.Command;
import client.MapleClient;
import client.MapleCharacter;
import client.MapleStat;

public class StatStrCommand extends Command{
    {
        setDescription("Use an amount of AP to STR.");
    }
    @Override
    public void execute(MapleClient c, String[] params){
        MapleCharacter player = c.getPlayer();
        int remainingAp = player.getRemainingAp();

        int amount;
        if(params.length > 0){
            try{
                if (Integer.parseInt(params[0]) > remainingAp){
                    player.blueMessage("You don't have enough AP.");
                    return;
                }
                amount = Math.min(Integer.parseInt(params[0]), remainingAp); //  Sanity check... so you really can't allocate more than your remaining AP.              
            }catch (NumberFormatException e){
                player.blueMessage("That is not a valid number!");
                return;
            }
        }else{
            player.blueMessage("You must specify the amount of AP you want to allocate.");
            return;
        }

        int total = player.getStat().getStr() + amount;

        if (total < player.getStat().getStr()) {
            player.blueMessage("You cannot decrease your stats.");
            return;
        }
        
        if((player.getStat().getStr() + amount) > 32000){
            player.blueMessage("You can't go over 32000 base stat.");
            return;
        }
        

        player.getStat().setStr((short) total, player);
        player.updateSingleStat(MapleStat.STR, player.getStat().getStr());
        c.getPlayer().setRemainingAp((short) (c.getPlayer().getRemainingAp() - amount));
        c.getPlayer().updateSingleStat(MapleStat.AVAILABLEAP, c.getPlayer().getRemainingAp());
        c.getPlayer().dropMessage(5, "STR has been raised by " + amount + ".");
    }
}