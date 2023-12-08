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
public enum DarkKnight {
    ACHILLES(1320005),
    BERSERK(1320006),
    BEHOLDER(1321007),
    AURA_OF_BEHOLDER(1320008),
    HEX_OF_BEHOLDER(1320009),
    REVENGE_BEHOLDER(1320011),
    MAPLE_WARRIOR(1321000),
    MONSTER_MAGNET(1321001),
    STANCE(1321002),
    RUSH(1321003),
    HEROS_WILL(1321010),
    DARK_IMPALE(1321012);

    private final int skillId;

    DarkKnight(int skillId) {
        this.skillId = skillId;
    }

    public int getSkillId() {
        return skillId;
    }
}

