public abstract class Profession{

    private String professionName;
    private String startingSkills;
    private int strengthGrowth;
    private int speedGrowth;
    private int intelligenceGrowth;
    private int manaGrowth;
    private int staminaGrowth;
    private int healthGrowth;
    private int defenceGrowth;
    
    public Profession(String professionName, String startingSkills, int strengthGrowth, int speedGrowth,
            int intelligenceGrowth, int manaGrowth, int staminaGrowth, int healthGrowth, int defenceGrowth) {
        this.professionName = professionName;
        this.startingSkills = startingSkills;
        this.strengthGrowth = 0;
        this.speedGrowth = 0;
        this.intelligenceGrowth = 0;
        this.manaGrowth = 0;
        this.staminaGrowth = 0;
        this.healthGrowth = 0;
        this.defenceGrowth = 0;
    }

    public String getProfessionName() {
        return professionName;
    }

    public String getStartingSkills() {
        return startingSkills;
    }

    public int getStrengthGrowth() {
        return strengthGrowth;
    }

    public int getSpeedGrowth() {
        return speedGrowth;
    }

    public int getIntelligenceGrowth() {
        return intelligenceGrowth;
    }

    public int getManaGrowth() {
        return manaGrowth;
    }

    public int getStaminaGrowth() {
        return staminaGrowth;
    }

    public int getHealthGrowth() {
        return healthGrowth;
    }

    public int getDefenceGrowth() {
        return defenceGrowth;
    }

    protected void setProfessionName(String professionName) {
        this.professionName = professionName;
    }

    protected void setStartingSkills(String startingSkills) {
        this.startingSkills = startingSkills;
    }

    protected void setStrengthGrowth(int strengthGrowth) {
        this.strengthGrowth = strengthGrowth;
    }

    protected void setSpeedGrowth(int speedGrowth) {
        this.speedGrowth = speedGrowth;
    }

    protected void setIntelligenceGrowth(int intelligenceGrowth) {
        this.intelligenceGrowth = intelligenceGrowth;
    }

    protected void setManaGrowth(int manaGrowth) {
        this.manaGrowth = manaGrowth;
    }

    protected void setStaminaGrowth(int staminaGrowth) {
        this.staminaGrowth = staminaGrowth;
    }

    protected void setHealthGrowth(int healthGrowth) {
        this.healthGrowth = healthGrowth;
    }

    protected void setDefenceGrowth(int defenceGrowth) {
        this.defenceGrowth = defenceGrowth;
    }

    @Override
    public String toString() {
        return "Profession [professionName=" + professionName + ", startingSkills=" + startingSkills
                + ", strengthGrowth= +" + strengthGrowth + ", speedGrowth= +" + speedGrowth + ", intelligenceGrowth= +"
                + intelligenceGrowth + ", manaGrowth= +" + manaGrowth + ", staminaGrowth= +" + staminaGrowth
                + ", healthGrowth=" + healthGrowth + ", defenceGrowth= +" + defenceGrowth + "]";
    }

    

}
