/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package constants.skills;

/**
 * @author Tyler
 */
public enum Warrior {
    ENDURE(1000002),
    IRON_BODY(1000003),
    POWER_STRIKE(1000004),
    SLASH_BLAST(1000005),
    HP_BOOST(1000006);

    private final int skillId;

    Warrior(int skillId) {
        this.skillId = skillId;
    }

    public int getSkillId() {
        return skillId;
    }
}

