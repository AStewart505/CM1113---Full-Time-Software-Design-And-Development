
public class Profession
{
    
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
        this.strengthGrowth = strengthGrowth;
        this.speedGrowth = speedGrowth;
        this.intelligenceGrowth = intelligenceGrowth;
        this.manaGrowth = manaGrowth;
        this.staminaGrowth = staminaGrowth;
        this.healthGrowth = healthGrowth;
        this.defenceGrowth = defenceGrowth;
    }




public String getProfessionName() {
    return professionName;
}




public void setProfessionName(String professionName) {
    this.professionName = professionName;
}




public String getStartingSkills() {
    return startingSkills;
}




public void setStartingSkills(String startingSkills) {
    this.startingSkills = startingSkills;
}




public int getStrengthGrowth() {
    return strengthGrowth;
}




public void setStrengthGrowth(int strengthGrowth) {
    this.strengthGrowth = strengthGrowth;
}




public int getSpeedGrowth() {
    return speedGrowth;
}




public void setSpeedGrowth(int speedGrowth) {
    this.speedGrowth = speedGrowth;
}




public int getIntelligenceGrowth() {
    return intelligenceGrowth;
}




public void setIntelligenceGrowth(int intelligenceGrowth) {
    this.intelligenceGrowth = intelligenceGrowth;
}




public int getManaGrowth() {
    return manaGrowth;
}




public void setManaGrowth(int manaGrowth) {
    this.manaGrowth = manaGrowth;
}




public int getStaminaGrowth() {
    return staminaGrowth;
}




public void setStaminaGrowth(int staminaGrowth) {
    this.staminaGrowth = staminaGrowth;
}




public int getHealthGrowth() {
    return healthGrowth;
}




public void setHealthGrowth(int healthGrowth) {
    this.healthGrowth = healthGrowth;
}




public int getDefenceGrowth() {
    return defenceGrowth;
}




public void setDefenceGrowth(int defenceGrowth) {
    this.defenceGrowth = defenceGrowth;
}
    

public String toString() {
    return "Stats [strength Growth=" + strengthGrowth + ", speed Growth=" + speedGrowth + ", intelligence Growth=" + intelligenceGrowth + ", mana growth =" + manaGrowth
            + ", stamina Growth=" + staminaGrowth + ", health Growth=" + healthGrowth + ", defence Growth=" + defenceGrowth + "]";
}

    
}
