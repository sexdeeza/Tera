/*
	This file is part of the OdinMS Maple Story Server
    Copyright (C) 2008 Patrick Huy <patrick.huy@frz.cc>
		       Matthias Butz <matze@odinms.de>
		       Jan Christian Meyer <vimes@odinms.de>

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU Affero General Public License as
    published by the Free Software Foundation version 3 as published by
    the Free Software Foundation. You may not use, modify or distribute
    this program under any other version of the GNU Affero General Public
    License.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Affero General Public License for more details.

    You should have received a copy of the GNU Affero General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/
package constants.skills;

/**
 * @author BubblesDev
 */
public enum NightWalker {
    // 1st job
    NIMBLE_BODY(14000000),
    KEEN_EYES(14000001),
    DISORDER(14000002),
    DARK_SIGHT(14001003),
    LUCKY_SEVEN(14001004),
    DARKNESS(14001005),
    // 2nd job
    CLAW_MASTERY(14100000),
    CRITICAL_THROW(14100001),
    CLAW_BOOSTER(14101002),
    HASTE(14101003),
    FLASH_JUMP(14101004),
    VANISH(14100005),
    VAMPIRE(14101006),
    // 3rd job
    SHADOW_PARTNER(14111000),
    SHADOW_WEB(14111001),
    AVENGER(14111002),
    ALCHEMIST(14110003),
    VENOM(14110004),
    TRIPLE_THROW(14110005),
    POISON_BOMB(14111006);

    private final int skillId;

    NightWalker(int skillId) {
        this.skillId = skillId;
    }

    public int getSkillId() {
        return skillId;
    }
}

