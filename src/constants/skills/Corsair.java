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
public enum Corsair {
    MAPLE_WARRIOR(5221000),
    ELEMENTAL_BOOST(5220001),
    WRATH_OF_THE_OCTOPI(5220002),
    AERIAL_STRIKE(5221003),
    RAPID_FIRE(5221004),
    BATTLE_SHIP(5221006),
    BATTLESHIP_CANNON(5221007),
    BATTLESHIP_TORPEDO(5221008),
    HYPNOTIZE(5221009),
    SPEED_INFUSION(5221010),
    BULLSEYE(5220011);

    private final int skillId;

    Corsair(int skillId) {
        this.skillId = skillId;
    }

    public int getSkillId() {
        return skillId;
    }
}
