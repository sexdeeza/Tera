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
public enum BlazeWizard {
    // 1st job
    INCREASING_MAX_MP(12000000),
    MAGIC_GUARD(12001001),
    MAGIC_ARMOR(12001002),
    MAGIC_CLAW(12001003),
    FLAME(12001004),

    // 2nd job
    MEDITATION(12101000),
    SLOW(12101001),
    FIRE_ARROW(12101002),
    TELEPORT(12101003),
    SPELL_BOOSTER(12101004),
    ELEMENTAL_RESET(12101005),
    FIRE_PILLAR(12101006),

    // 3rd job
    ELEMENTAL_RESISTANCE(12110000),
    ELEMENT_AMPLIFICATION(12110001),
    SEAL(12111002),
    METEOR_SHOWER(12111003),
    IFRIT(12111004),
    FLAME_GEAR(12111005),
    FIRE_STRIKE(12111006);

    private final int skillId;

    BlazeWizard(int skillId) {
        this.skillId = skillId;
    }

    public int getSkillId() {
        return skillId;
    }
}
