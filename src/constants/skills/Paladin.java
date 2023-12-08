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
public enum Paladin {
    ACHILLES(1220005),
    GUARDIAN(1220006),
    ADVANCED_CHARGE(1220010),
    DIVINE_SHIELD(1220013),
    MAPLE_WARRIOR(1221000),
    MONSTER_MAGNET(1221001),
    STANCE(1221002),
    HOLY_CHARGE(1221004),
    RUSH(1221007),
    BLAST(1221009),
    HEAVENS_HAMMER(1221011),
    HEROS_WILL(1221012);

    private final int skillId;

    Paladin(int skillId) {
        this.skillId = skillId;
    }

    public int getSkillId() {
        return skillId;
    }
}
