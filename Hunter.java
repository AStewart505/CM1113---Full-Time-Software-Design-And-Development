package Coursework.test;

public class Hunter extends Profession {

    private String specialty;

    public Hunter(String professionName, String startingSkills, int strengthGrowth, int speedGrowth,
            int intelligenceGrowth, int manaGrowth, int staminaGrowth, int healthGrowth, int defenceGrowth,
            String specialty) {
        super(professionName, startingSkills, strengthGrowth, speedGrowth, intelligenceGrowth, manaGrowth,
                staminaGrowth, healthGrowth, defenceGrowth);
        this.specialty = specialty;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    public String toString() {
        return "Hunter " + super.toString() + "specialty=" + specialty + "]";
    }
    
}
