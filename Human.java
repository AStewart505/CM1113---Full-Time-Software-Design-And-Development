public class Human extends Species{

        private Factions faction;
    
    
            
        enum Factions{
            Adventurers,
            Hunters,
            Mages,
            Crafters,
            Bandits
        }
    
    //----------Constructor----------//
        public Human(int strength, int speed, int intelligence, int mana, int stamina, int health, int defence,
                String speciesName, String spawnpoint, String speciesSkill, Factions aFaction) {
            super(strength, speed, intelligence, mana, stamina, health, defence, speciesName, spawnpoint,
                    speciesSkill);
            faction = aFaction;
        }
    
    
    //----------Getters Methods----------//
        public Factions getFaction() {
            return faction;
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
    
    
        public void setFaction(Factions aFaction) {
            faction = aFaction;
        }
    
        public void setSpawnpoint(String aSpawnPoint) {
            super.setSpawnpoint(aSpawnPoint);
        }
    
    
     
        public void setSpeciesName(String aSpeciesName) {
            super.setSpeciesName(aSpeciesName);
        }
    
    
        
        public void setSpeciesSkill(String aSpeciesSkill)  {
            super.setSpeciesSkill(aSpeciesSkill);
        }
    
    
    
        public void setDefence(int aDefence) {
            super.setDefence(aDefence);
        }
    
    
    
        public void setHealth(int aHealth) {
            super.setHealth(aHealth);
        }
    
    
        public void setIntelligence(int aIntelligence) {
            super.setIntelligence(aIntelligence);
        }
    
    
        public void setMana(int aMana) {
            super.setMana(aMana);
        }
    
    
        public void setSpeed(int aSpeed) {
            super.setSpeed(aSpeed);
        }
    
    
        
        public void setStamina(int aStamina) {
            super.setStamina(aStamina);
        }
    
    
        public void setStrength(int aStrength) {
            super.setStrength(aStrength);
        }
    
    
        //----------To String Method----------//
        @Override
        public String toString(){
            return super.toString() + "Faction: " + getFaction();
    
        }
    
    }
    

