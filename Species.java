public abstract class Species extends Stats {
    private String speciesName;
    private String spawnpoint;
    private String speciesSkill;


    
    public Species(int strength, int speed, int intelligence, int mana, int stamina, int health, int defence,
            String speciesName, String spawnpoint, String speciesSkill) {
        super(strength, speed, intelligence, mana, stamina, health, defence);
        this.speciesName = "Blank";
        this.spawnpoint = "Blank";
        this.speciesSkill = "Blank";
    }


//----------Getter Methods----------//

    public String getSpeciesName(){
        return speciesName;
    }

    public String getSpawnPoint(){
        return spawnpoint;
    }



    public String getSpeciesSkill(){
        return speciesSkill;
    }

//----------Setter Methods----------//

    public void setSpeciesName(String aSpeciesName){
        speciesName= aSpeciesName;
    }

    public void setSpawnpoint(String aSpawnPoint){
        spawnpoint =  aSpawnPoint;
    }


    public void setSpeciesSkill(String aSpeciesSkill){
        speciesSkill = aSpeciesSkill;
    }





//----------Other Methods----------//

    public String toString(){
        String str = "Species Name: " + getSpeciesName() + "\n";
        str += "Spawnpoint: " + getSpawnPoint() + "\n";
        str += "Species Skill: " + getSpeciesSkill() + "\n";

        str+= super.toString();


        return str;
    }


}
