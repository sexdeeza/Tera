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
public enum DawnWarrior {
    // 1st job
    MAX_HP_INCREASE(11000000),
    IRON_BODY(11001001),
    POWER_STRIKE(11001002),
    SLASH_BLAST(11001003),
    SOUL(11001004),

    // 2nd job
    SWORD_MASTERY(11100000),
    SWORD_BOOSTER(11101001),
    FINAL_ATTACK(11101002),
    RAGE(11101003),
    SOUL_BLADE(11101004),
    SOUL_RUSH(11101005),

    // 3rd job
    INCREASED_MP_RECOVERY(11110000),
    COMBO(11111001),
    PANIC(11111002),
    COMA(11111003),
    BRANDISH(11111004),
    ADVANCED_COMBO(11110005),
    SOUL_DRIVER(11111006),
    SOUL_CHARGE(11111007);

    private final int skillId;

    DawnWarrior(int skillId) {
        this.skillId = skillId;
    }

    public int getSkillId() {
        return skillId;
    }
}
