public class Elf extends Species{
    
    private String variant;


    enum Variants{
        HIGH,
        LOW,
        WOOD,
        DARK,
        LIGHT
    }

//----------Constructor----------//

    public Elf(int strength, int speed, int intelligence, int mana, int stamina, int health, int defence,
            String speciesName, String spawnpoint, String speciesSkill, String aVariant) {
        super(strength, speed, intelligence, mana, stamina, health, defence, speciesName, spawnpoint,
                speciesSkill);
        variant = aVariant;
    }


//----------Getters Methods----------//
    public String getVariant() {
        return variant;
    }



    public String getSpeciesName(){
        return super.getSpeciesName();
    }

    public String getSpawnpoint(){
        return super.getSpawnPoint();
    }


    public String getSpeciesSkills(){
        return super.getSpeciesSkill();
    }



//----------Setter Methods----------//


    public void setVariant(String variant) {
        this.variant = variant;
    }

@Override
    public void setSpawnpoint(String aSpawnPoint) {
        super.setSpawnpoint("Great Forest");
    }


    @Override
    public void setSpeciesName(String aSpeciesName) {
        super.setSpeciesName("Elf");
    }


    @Override
    public void setSpeciesSkill(String aSpeciesSkill) {
        super.setSpeciesSkill("Mana Spring");
    }


    @Override
    public void setDefence(int defence) {
        super.setDefence(4);
    }


    @Override
    public void setHealth(int health) {
        super.setHealth(6);
    }


    @Override
    public void setIntelligence(int intelligence) {
        super.setIntelligence(8);
    }


    @Override
    public void setMana(int mana) {
        super.setMana(9);
    }


    @Override
    public void setSpeed(int speed) {
        super.setSpeed(8);
    }


    @Override
    public void setStamina(int stamina) {
        super.setStamina(7);
    }


    @Override
    public void setStrength(int strength) {
        super.setStrength(5);
    }


    //----------To String Method----------//
    @Override
    public String toString(){
        return super.toString() + "Variant: " + getVariant();
    }






}
