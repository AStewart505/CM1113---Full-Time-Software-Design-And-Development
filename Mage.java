package Coursework.test;

public class Mage extends Profession {

    private String element;

    public Mage(String professionName, String startingSkills, int strengthGrowth, int speedGrowth,
            int intelligenceGrowth, int manaGrowth, int staminaGrowth, int healthGrowth, int defenceGrowth,
            String element) {
        super(professionName, startingSkills, strengthGrowth, speedGrowth, intelligenceGrowth, manaGrowth,
                staminaGrowth, healthGrowth, defenceGrowth);
        this.element = element;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    @Override
    public String toString() {
        return "Mage " + super.toString() + " element=" + element + "]";
    }
     
}
