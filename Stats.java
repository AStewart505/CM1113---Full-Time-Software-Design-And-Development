package Coursework;

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

public void setStrength(int strength) {
    this.strength = strength;
}

public void setSpeed(int speed) {
    this.speed = speed;
}

public void setIntelligence(int intelligence) {
    this.intelligence = intelligence;
}

public void setMana(int mana) {
    this.mana = mana;
}

public void setStamina(int stamina) {
    this.stamina = stamina;
}

public void setHealth(int health) {
    this.health = health;
}

public void setDefence(int defence) {
    this.defence = defence;
}
    


    
}
