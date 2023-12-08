package constants.skills;

public enum WildHunter {
    // First Job
    TRIPLE_SHOT(33001000),
    JAGUAR_RIDER(33001001),
    JAG_JUMP(33001002),
    CROSSBOW_BOOSTER(33001003),
    // Second Job
    CROSSBOW_MASTERY(33100000),
    FINAL_ATTACK(33100009),
    PHYSICAL_TRAINING(33100010),
    RICOCHET(33101001),
    JAGUAR_RAWR(33101002),
    SOUL_ARROW(33101003),
    RAINING_MINES(33101004),
    JAGUAROSHI1(33101005),
    JAGUAROSHI2(33101006),
    JAGUAROSHI3(33101007),
    RAINING_MINES_EXPLODE(33101008),
    // Third Job
    JAGUAR_BOOST(33110000),
    ENDURING_FIRE(33111001),
    DASH_SLASH(33111002),
    WILD_TRAP(33111003),
    BLIND(33111004),
    SILVER_HAWK(33111005),
    SWIPE(33111006),
    FELINE_BERSERK(33111007),
    // Fourth Job
    CROSSBOW_EXPERT(33120000),
    WILD_INSTINCT(33120010),
    ADVANCED_FINAL_ATTACK(33120011),
    EXPLODING_ARROWS(33121001),
    SONIC_ROAR(33121002),
    SHARP_EYES(33121004),
    STINK_BOMB(33121005),
    MAPLE_WARRIOR(33121007),
    HEROS_WILL(33121008),
    WILD_ARROW_BLAST(33121009);

    private final int skillId;

    WildHunter(int skillId) {
        this.skillId = skillId;
    }

    public int getSkillId() {
        return skillId;
    }
}

