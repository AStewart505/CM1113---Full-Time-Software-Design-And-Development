public class Mage extends Profession {

    private Elements element;

    enum Elements{
        Lightning,
        Fire,
        Ice,
        Space,
        Earth
    }

    public Mage(String professionName, String startingSkills, int strengthGrowth, int speedGrowth,
            int intelligenceGrowth, int manaGrowth, int staminaGrowth, int healthGrowth, int defenceGrowth,
            Elements element) {
        super(professionName, startingSkills, strengthGrowth, speedGrowth, intelligenceGrowth, manaGrowth,
                staminaGrowth, healthGrowth, defenceGrowth);
        this.element = element;
    }

    public Elements getElement() {
        return element;
    }

    public void setElement(Elements element) {
        this.element = element;
    }

    @Override
    public String toString() {
        return "Mage " + super.toString() + " element=" + element + "]";
    }
     
}
