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
public enum Noblesse {
    BLESSING_OF_THE_FAIRY(10000012),
    MAP_CHAIR(10000100),
    THREE_SNAILS(10001000),
    RECOVERY(10001001),
    NIMBLE_FEET(10001002),
    MONSTER_RIDER(10001004),
    ECHO_OF_HERO(10001005),
    MAKER(10001007),
    BAMBOO_RAIN(10001009),
    INVINCIBLE_BARRIER(10001010),
    POWER_EXPLOSION(10001011),
    SPACESHIP(1001014),
    SPACE_DASH(1001015),
    YETI_MOUNT1(10001019),
    YETI_MOUNT2(10001022),
    WITCH_BROOMSTICK(10001023),
    BALROG_MOUNT(10001031);

    private final int skillId;

    Noblesse(int skillId) {
        this.skillId = skillId;
    }

    public int getSkillId() {
        return skillId;
    }
}
