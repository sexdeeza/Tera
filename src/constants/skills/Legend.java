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
 * @author kevintjuh93
 */
public enum Legend {
    THREE_SNAILS(20001000),
    RECOVERY(20001001),
    AGILE_BODY(20001002),
    LEGENDARY_SPIRIT(20001003),
    MONSTER_RIDER(20001004),
    ECHO_OF_HERO(20001005),
    JUMP_DOWN(20001006),
    MAKER(20001007),
    BAMBOO_THRUST(20001009),
    INVICIBLE_BARRIER(20001010),
    POWER_EXPLOSION(20001011),
    METEO_SHOWER(20001011), // Duplicate entry; please verify the correct skill ID
    BLESSING_OF_THE_FAIRY(20000012),
    TUTORIAL_SKILL1(20000014),
    TUTORIAL_SKILL2(20000015),
    TUTORIAL_SKILL3(20000016),
    TUTORIAL_SKILL4(20000017), //combo
    TUTORIAL_SKILL5(20000018), //critical
    MAP_CHAIR(20000100),
    YETI_MOUNT1(20001019),
    YETI_MOUNT2(20001022),
    WITCH_BROOMSTICK(20001023),
    BALROG_MOUNT(20001031);

    private final int skillId;

    Legend(int skillId) {
        this.skillId = skillId;
    }

    public int getSkillId() {
        return skillId;
    }
}
