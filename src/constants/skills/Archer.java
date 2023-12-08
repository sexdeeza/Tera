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
public enum Archer {
    BLESSING_OF_AMAZON(3000000),
    EYE_OF_AMAZON(3000002),
    CRITICAL_SHOT(3000001),
    FOCUS(3001003),
    DOUBLE_SHOT(3001005),
    ARROW_BLOW(3001004);

    private final int skillId;

    Archer(int skillId) {
        this.skillId = skillId;
    }

    public int getSkillId() {
        return skillId;
    }
}