abstract class Entity{
    int id;
    abstract void setStringType(String Element1);
    abstract String getStringType();
}

abstract class Organisms extends Entity{
    abstract void setOrganismAttributes(int strength,int intelligence,int speed);
    abstract void ModifyOrganismAttributes(int strength,int intelligence,int speed);
    abstract int getStrength();
    abstract int getIntelligence();
    abstract int getSpeed();
}

abstract class DetrimentalThings extends Entity{
    abstract void setAttributes(int damage,int howLongItLasts);
    abstract int getDamage();
    abstract int getHowLongItLasts();
}

class Block extends Entity{  //choose what type of blocks the ground will be
    private String blockType;  

    void setStringType(String blockType) {
        this.blockType=blockType;
    }

    String getStringType() {
        return blockType;
    }

}

class Weather extends Entity{  //set a specific type of weather
    private String weatherType;  

    void setStringType(String weatherType) {
        this.weatherType=weatherType;
    }

    String getStringType() {
        return weatherType;
    }

}

class Hill extends Entity{  //create hills/mountains
    private int width,height;
    private String Type; 

    public void setWidthHeight(int width,int height){
        this.width=width;
        this.height=height;
    }

    public int getWidth(){
        return width;
    }

    public int getHeight(){
        return height;
    }

    void setStringType(String Type) {
        this.Type=Type;
    }

    String getStringType() {
        return Type;
    }

}

class World extends Hill{  //create the actual world/map
    private int lengthOfDay;

    public void setLengthOfDay(int lengthOfDay){
        this.lengthOfDay=lengthOfDay;
    }

    public int getLengthOfDay(){
        return lengthOfDay;
    }

}

class Plant extends Entity{  //add plants
    private int plantLife;
    private String plantType;

    void setStringType(String plantType){
        this.plantType=plantType;
    }

    public void setPlantLife(int plantLife){
        this.plantLife=plantLife;
    }

    public void modifyplantLife(int plantLife){
        this.plantLife=this.plantLife+plantLife;
    }

    public int getplantLife(){
        return plantLife;
    }

    String getStringType(){
        return plantType;
    }

}

class Person extends Organisms{  //create people
    private int strength,intelligence,speed;
    private String organismType;  //european,african,asian,etc

    void setOrganismAttributes(int strength, int intelligence, int speed) {
        this.strength=strength;
        this.intelligence=intelligence;
        this.speed=speed;
    }

    void ModifyOrganismAttributes(int strength, int intelligence, int speed) {
        this.strength=this.strength+strength;
        this.intelligence=this.intelligence+intelligence;
        this.speed=this.speed+speed;
    }

    void setStringType(String organismType) {
        this.organismType=organismType;  
    }

    String getStringType() {
        return organismType;
    }

    int getStrength(){
        return strength;
    }

    int getIntelligence(){
        return intelligence;
    }

    int getSpeed(){
        return speed;
    }

}

class Animal extends Person{  //create animals
    private String nutrition;  //herbivore,carnivore,omnivore

    public void setNutrition(String nutrition){
        this.nutrition=nutrition;
    }

    public String getNutrition(){
        return nutrition;
    }
}

class Calamity extends DetrimentalThings{  //create calamities:tornados, tsunami's,etc
    private int damage,howLongItLasts;
    private String calamityType;

    void setAttributes(int damage, int howLongItLasts) {
        this.damage=damage;
        this.howLongItLasts=howLongItLasts;
    }

    void setStringType(String calamityType) {
        this.calamityType=calamityType;
    }

    String getStringType() {
        return calamityType;
    }

    int getDamage(){
        return damage;
    }

    int getHowLongItLasts(){
        return howLongItLasts;
    }
    
}

class Weapon extends DetrimentalThings{  //create weapons
    private int damage,howLongItLasts,usageSpeed;
    private String weaponType;

    void setAttributes(int damage, int howLongItLasts) {
        this.damage=damage;
        this.howLongItLasts=howLongItLasts;
    }

    void setUsageSpeed(int usageSpeed){
        this.usageSpeed=usageSpeed;
    }

    void setStringType(String weaponType) {
        this.weaponType=weaponType;
    }

    String getStringType() {
        return weaponType;
    }

    int getDamage(){
        return damage;
    }

    int getHowLongItLasts(){
        return howLongItLasts;
    }

    int getUsageSpeed(){
        return usageSpeed;
    }
    
}

class Building extends Hill{
    private int durability,rooms;

    public void setAttributes(int durability,int rooms){
        this.durability=durability;
        this.rooms=rooms;
    }

    public void changeDurability(int durability){
        this.durability=this.durability+durability;
    }

    public int getDurability(){
        return durability;
    }

    public int getRooms(){
        return rooms;
    }
}

public class EarthSimulation2
{
    public static void main(String[] args){
        Person p1 = new Person();
        p1.setOrganismAttributes(100, 150, 90);
        p1.ModifyOrganismAttributes(-30, 0, 0);
        System.out.print("p1 strength = ");
        System.out.println(p1.getStrength());
    }
}