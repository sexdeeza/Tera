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
public enum Beginner {
    FOLLOW_THE_LEADER(8),
    BLESSING_OF_THE_FAIRY(12),
    EMPRESS_BLESSING(73),
    EMPRESS_MIGHT1(74),
    EMPRESS_MIGHT2(80),
    ARCHANGELIC_BLESSING(86),
    DARK_ANGELIC_BLESSING(88),
    WHITE_ANGELIC_BLESSING(91),
    HIDDEN_POTENTIAL_EXPLORER(93),
    FREEZING_AXE(97),
    ICE_SMASH(99),
    MAP_CHAIR(100),
    THREE_SNAILS(1001),
    RECOVERY(1001),
    NIMBLE_FEET(1002),
    LEGENDARY_SPIRIT(1003),
    MONSTER_RIDER(1004),
    ECHO_OF_HERO(1005),
    BAMBOO_RAIN(1009),
    INVINCIBLE_BARRIER(1010),
    POWER_EXPLOSION(1011),
    SPACESHIP1(1013),
    SPACE_DASH1(1014),
    SPACE_BEAM1(1015),
    YETI_MOUNT1(1017),
    YETI_MOUNT2(1018),
    WITCH_BROOMSTICK(1019),
    RAGE_PHARAOH(1020),
    WOODEN_PONY(1025),
    SOARING(1026),
    CROCO(1027),
    BLACK_SCOOTER(1028),
    PINK_SCOOTER(1029),
    NIMBUS_CLOUD(1030),
    BALROG_MOUNT(1031),
    ZD_TIGER(1034),
    MIST_BALROG(1035),
    LION(1036),
    UNICORN(1037),
    LOW_RIDER(1038),
    RED_TRUCK(1039),
    GARGOYLE(1040),
    SHINJO(1042),
    ORANGE_MUSHROOM(1044),
    HELICOPTER(1045),
    SPACESHIP2(1046),
    SPACE_DASH2(1047),
    SPACE_BEAM2(1048),
    NIGHTMARE(1049),
    YETI(1050),
    OSTRICH(1051),
    PINK_BEAR(1052),
    TRANSFOR_ROBOT(1053),
    CHICKEN(1054),
    OS4_SHUTTLE(1065),
    VISITOR_MELEE(1066),
    VISITOR_RANGED(1067),
    OWL(1069),
    MOTHERSHIP(1070),
    OS3A_MACHINE(1071),
    GIANT_BUNNY(1096),
    TINY_BUNNY(1101),
    BUNNY_RICKSHAW(1102),
    DECENT_HASTE(8000),
    DECENT_MYSTIC_DOOR(8001),
    DECENT_SHARP_EYES(8002),
    DECENT_HYPER_BODY(8003),
    PIG_WEAKNESS(9000),
    STUMP_WEAKNESS(9001),
    SLIME_WEAKNESS(9002);

    private final int skillId;

    Beginner(int skillId) {
        this.skillId = skillId;
    }

    public int getSkillId() {
        return skillId;
    }
}
