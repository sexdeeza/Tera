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
public enum ILMage {
    PARTIAL_RESISTANCE(2210000),
    ELEMENT_AMPLIFICATION(2210001),
    ICE_STRIKE(2211002),
    THUNDER_SPEAR(2211003),
    SEAL(2211004),
    SPELL_BOOSTER(2211005),
    ELEMENT_COMPOSITION(2211006);

    private final int skillId;

    ILMage(int skillId) {
        this.skillId = skillId;
    }

    public int getSkillId() {
        return skillId;
    }
}
