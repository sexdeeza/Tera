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
public enum WindArcher {
    // 1st job
    CRITICAL_SHOT(13000000),
    EYE_OF_AMAZON(13000001),
    FOCUS(13001002),
    DOUBLE_SHOT(13001003),
    STORM(13001004),
    // 2nd job
    BOW_MASTERY(13100000),
    BOW_BOOSTER(13101001),
    FINAL_ATTACK(13101002),
    SOUL_ARROW(13101003),
    THRUST(13100004),
    STORM_BREAK(13101005),
    WIND_WALK(13101006),
    // 3rd job
    ARROW_RAIN(13111000),
    HURRICANE(13111002),
    BOW_EXPERT(13110003),
    PUPPET(13111004),
    EAGLE_EYE(13111005),
    WIND_PIERCING(13111006),
    WIND_SHOT(13111007),
    STRAFE(13111001);

    private final int skillId;

    WindArcher(int skillId) {
        this.skillId = skillId;
    }

    public int getSkillId() {
        return skillId;
    }
}
