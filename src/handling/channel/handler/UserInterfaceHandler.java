/*
This file is part of the OdinMS Maple Story Server
Copyright (C) 2008 ~ 2010 Patrick Huy <patrick.huy@frz.cc> 
Matthias Butz <matze@odinms.de>
Jan Christian Meyer <vimes@odinms.de>

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU Affero General Public License version 3
as published by the Free Software Foundation. You may not use, modify
or distribute this program under any other version of the
GNU Affero General Public License.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU Affero General Public License for more details.

You should have received a copy of the GNU Affero General Public License
along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package handling.channel.handler;

import client.MapleClient;
import scripting.NPCScriptManager;
import tools.data.LittleEndianAccessor;

public class UserInterfaceHandler {

    public static final void CygnusSummon_NPCRequest(final MapleClient c) {
        if (c.getPlayer().getJob() == 2000) {
            NPCScriptManager.getInstance().start(c, 1202000);
        } else if (c.getPlayer().getJob() == 1000) {
            NPCScriptManager.getInstance().start(c, 1101008);
        }
    }

    public static final void InGame_Poll(final LittleEndianAccessor slea, final MapleClient c) {

        /*
        if (ServerConstants.PollEnabled) {
            c.getPlayer().updateTick(slea.readInt());
            final int selection = slea.readInt();

            if (selection >= 0 && selection <= ServerConstants.Poll_Answers.length) {
                if (MapleCharacterUtil.SetPoll(c.getAccID(), selection)) {
                    c.getSession().write(CField.getPollReply("Thank you."));
                    //idk what goes here lol
                }
            }
        }
        */
    }

    public static final void ShipObjectRequest(final int mapid, final MapleClient c) {
    /*        
        // BB 00 6C 24 05 06 00 - Ellinia
        // BB 00 6E 1C 4E 0E 00 - Leafre
        
        EventManager em;

        switch (mapid) {
            case 101000300, 200000111 -> // Ellinia Station >> Orbis
            {
                // Orbis Station >> Ellinia
                em = c.getChannelServer().getEventSM().getEventManager("Boats");
                if (em != null && em.getProperty("docked").equals("true")) {
                    broadcastMessage(CField.boatStatePacket(true));
                }
            }
            case 200000121, 220000110 -> {
                // Ludi Station >> Orbis
                em = c.getChannelServer().getEventSM().getEventManager("Trains");
                if (em != null && em.getProperty("docked").equals("true")) {
                    broadcastMessage(CField.boatStatePacket(true));
                }
            }
            case 200000151, 260000100 -> // Orbis Station >> Ludi
            {
                // Ariant Station >> Orbis
                em = c.getChannelServer().getEventSM().getEventManager("Genie");
                if (em != null && em.getProperty("docked").equals("true")) {
                    broadcastMessage(CField.boatStatePacket(true));
                }
            }
            case 240000110, 200000131 -> {
                // Orbis Station >> Leafre
                em = c.getChannelServer().getEventSM().getEventManager("Cabin");
                if (em != null && em.getProperty("docked").equals("true")) {
                    broadcastMessage(CField.boatStatePacket(true));
                }
            }
            case 200090010, 200090000 -> // Orbis Station >> Ariant
            {
                // During the ride to Ellinia
                em = c.getChannelServer().getEventSM().getEventManager("Boats");
                if (em != null && em.getProperty("haveBalrog").equals("true")) {
                    broadcastMessage(CField.boatStatePacket(true));
                } else {
                    break; // shyt, fixme!
                }
            }
            default -> System.out.println("Unhandled ship object, MapID : " + mapid);
        }
        // Ellinia Station >> Orbis
        // Orbis Station >> Ludi
        // Orbis Station >> Ariant
        // Leafre Station >> Orbis
        // During the ride to Orbis
*/
    }
}
