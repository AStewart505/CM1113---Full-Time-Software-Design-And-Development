public class Hunter extends Profession {

    private Specialities specialty;

    enum Specialities{
        Assassin,
        Scout,
        Marksman
    }

    public Hunter(String professionName, String startingSkills, int strengthGrowth, int speedGrowth,
            int intelligenceGrowth, int manaGrowth, int staminaGrowth, int healthGrowth, int defenceGrowth,
            Specialities specialty) {
        super(professionName, startingSkills, strengthGrowth, speedGrowth, intelligenceGrowth, manaGrowth,
                staminaGrowth, healthGrowth, defenceGrowth);
        this.specialty = specialty;
    }

    public Specialities getSpecialty() {
        return specialty;
    }

    public void setSpecialty(Specialities specialty) {
        this.specialty = specialty;
    }

    @Override
    public String toString() {
        return "Hunter " + super.toString() + "specialty=" + specialty + "]";
    }
    
}
