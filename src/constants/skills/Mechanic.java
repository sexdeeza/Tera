package constants.skills;

public enum Mechanic {
    // First Job
    FLAME_LAUNCHER(35001001),
    MECH_PROTOTYPE(35001002),
    ME07_DRILLHANDS(35001003),
    GATLING_GUNS(35001004),
    // Second Job
    MECHANIC_MASTERY(35100000),
    HEAVY_WEAPON(35100008),
    PHYSICAL_TRAINING(35100011),
    ATOMIC_HAMMER(35101003),
    ROCKET_BOOSTER(35101004),
    GX9(35101005),
    MECHANIC_RAGE(35101006),
    PERFECT_ARMOR(35101007),
    ENHANCED_FLAME(35101009),
    ENHANCED_GATLING(35101010),
    // Third Job
    METAL_FIST_MASTERY(35110014),
    SATELLITE(35111001),
    ROCK_SHOCK(35111002),
    SIEGE_MODE(35111004),
    BOT_EX7(35111005),
    SATELLITE2(35111009),
    SATELLITE3(35111010),
    ROBOT_HLX(35111011),
    ROLL_OF_THE_DICE(35111013),
    PUNCH_LAUNCHER(35111015),
    // Fourth Job
    EXTREME_MECH(35120000),
    ROBOT_MASTERY(35120001),
    SG88(35121003),
    MISSILE_TANK(35121005),
    SATELLITE_SAFETY(35121006),
    MAPLE_WARRIOR(35121007),
    HEROS_WILL(35121008),
    BOTS_TOTS(35121009),
    ROBOT_AF11(35121010),
    LASER_BLAST(35121012),
    MECH_SIEGE(35121013);

    private final int skillId;

    Mechanic(int skillId) {
        this.skillId = skillId;
    }

    public int getSkillId() {
        return skillId;
    }
}

