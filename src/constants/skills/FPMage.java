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
public enum FPMage {
    BURNING_MAGIC (2110000),
    ELEMENT_AMPLIFICATION (2110001),
    ARCANE_OVERDRIVE  (2110009),
    EXPLOSION  (2111002),
    POISON_MIST  (2111003),
    SEAL  (2111004),
    SPELL_BOOSTER  (2111005),
    FIRE_DEMON  (2111006),
    TELEPORT_MASTERY (2111007),
    ELEMENTAL_DECREASE (2111008);

    private final int skillId;

    FPMage(int skillId) {
        this.skillId = skillId;
    }

    public int getSkillId() {
        return skillId;
    }

}