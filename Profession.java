
public class Stats {
    
    private int strength;
    private int speed;
    private int intelligence;
    private int mana;
    private int stamina;
    private int health;
    private int defence;
    
public Stats(int strength, int speed, int intelligence, int mana, int stamina, int health, int defence) {
    this.strength = strength;
    this.speed = speed;
    this.intelligence = intelligence;
    this.mana = mana;
    this.stamina = stamina;
    this.health = health;
    this.defence = defence;
}

public int getStrength() {
    return strength;
}

public int getSpeed() {
    return speed;
}

public int getIntelligence() {
    return intelligence;
}

public int getMana() {
    return mana;
}

public int getStamina() {
    return stamina;
}

public int getHealth() {
    return health;
}

public int getDefence() {
    return defence;
}

protected void setStrength(int strength) {
    this.strength = strength;
}

protected void setSpeed(int speed) {
    this.speed = speed;
}

protected void setIntelligence(int intelligence) {
    this.intelligence = intelligence;
}

protected void setMana(int mana) {
    this.mana = mana;
}

protected void setStamina(int stamina) {
    this.stamina = stamina;
}

protected void setHealth(int health) {
    this.health = health;
}

protected void setDefence(int defence) {
    this.defence = defence;
}


public String toString() {
    return "Stats [strength=" + strength + ", speed=" + speed + ", intelligence=" + intelligence + ", mana=" + mana
            + ", stamina=" + stamina + ", health=" + health + ", defence=" + defence + "]";
}
    



    
}
