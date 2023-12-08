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
public enum Buccaneer {
    MAPLE_WARRIOR(5121000),
    ENERGY_ORB(5121002),
    SUPER_TRANSFORMATION(5121003),
    DEMOLITION(5121004),
    SNATCH(5121005),
    BARRAGE(5121007),
    PIRATES_RAGE(5121008),
    SPEED_INFUSION(5121009),
    TIME_LEAP(5121010),
    DRAGON_STRIKE(5121001);

    private final int skillId;

    Buccaneer(int skillId) {
        this.skillId = skillId;
    }

    public int getSkillId() {
        return skillId;
    }
}
