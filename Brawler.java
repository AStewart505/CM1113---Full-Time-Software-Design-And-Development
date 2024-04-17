package Coursework.test;

public class Brawler extends Profession {

    private String role;

    public Brawler(String professionName, String startingSkills, int strengthGrowth, int speedGrowth,
            int intelligenceGrowth, int manaGrowth, int staminaGrowth, int healthGrowth, int defenceGrowth,
            String role) {
        super(professionName, startingSkills, strengthGrowth, speedGrowth, intelligenceGrowth, manaGrowth,
                staminaGrowth, healthGrowth, defenceGrowth);
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Brawler " + super.toString() + "role=" + role + "]";
    }

}
