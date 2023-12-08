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
public enum ThunderBreaker {
    // 1st job
    QUICK_MOTION(15000000),
    FIRST_STRIKE(15001001),
    SOMERSAULT_KICK(15001002),
    DASH(15001003),
    LIGHTNING(15001004),
    // 2nd job
    IMPROVE_MAX_HP(15100000),
    KNUCKLER_MASTERY(15100001),
    KNUCKLER_BOOSTER(15101002),
    CORKSCREW_BLOW(15101003),
    ENERGY_CHARGE(15100004),
    ENERGY_BLAST(15101005),
    LIGHTNING_CHARGE(15101006),
    // 3rd job
    CRITICAL_PUNCH(15110000),
    TRANSFORMATION(15111002),
    BARRAGE(15111004),
    SPEED_INFUSION(15111005),
    SHOCK_WAVE(15111003),
    ENERGY_DRAIN(15111001),
    SPARK(15111006),
    SHARK_WAVE(15111007);

    private final int skillId;

    ThunderBreaker(int skillId) {
        this.skillId = skillId;
    }

    public int getSkillId() {
        return skillId;
    }
}

