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
public enum Aran {
    // 1st job
    COMBO_ABILITY(21000000),
    DOUBLE_SWING(21000002),
    COMBAT_STEP(21001001),
    POLEARM_BOOSTER(21001003),
    // 2nd job
    POLEARM_MASTERY(21100000),
    TRIPLE_SWING(21100001),
    FINAL_CHARGE(21100002),
    COMBO_DRAIN(21100005),
    COMBO_SMASH(21100004),
    BODY_PRESSURE(21101003),
    // 3rd job
    FULL_SWING(21110002),
    COMBO_CRITICAL(21110000),
    FINAL_TOSS(21110003),
    COMBO_FENRIR(21110004),
    SNOW_CHARGE(21111005),
    SMART_KNOCKBACK(21111001),
    ROLLING_SPIN(21110006),
    HIDDEN_FULL_DOUBLE(21110007),
    HIDDEN_FULL_TRIPLE(21110008),
    // 4th job
    MAPLE_WARRIOR(21121000),
    HIGH_MASTERY(21120001),
    OVER_SWING(21120002),
    HIGH_DEFENSE(21120004),
    FINAL_BLOW(21120005),
    COMBO_TEMPEST(21120006),
    COMBO_BARRIER(21120007),
    FREEZE_STANDING(21121003),
    HEROS_WILL(21121008),
    HIDDEN_OVER_DOUBLE(21120009),
    HIDDEN_OVER_TRIPLE(21120010);

    private final int skillId;

    Aran(int skillId) {
        this.skillId = skillId;
    }

    public int getSkillId() {
        return skillId;
    }
}
