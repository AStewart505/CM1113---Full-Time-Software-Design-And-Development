public class Brawler extends Profession {

    private Roles role;

    enum Roles{
        Tanker,
        Pugilist,
        Striker
    }

    public Brawler(String professionName, String startingSkills, int strengthGrowth, int speedGrowth,
            int intelligenceGrowth, int manaGrowth, int staminaGrowth, int healthGrowth, int defenceGrowth,
            Roles role) {
        super(professionName, startingSkills, strengthGrowth, speedGrowth, intelligenceGrowth, manaGrowth,
                staminaGrowth, healthGrowth, defenceGrowth);
        this.role = role;
    }

    public Roles getRole() {
        return role;
    }

    public void setRole(Roles role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Brawler " + super.toString() + "role=" + role + "]";
    }

}
