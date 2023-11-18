package Homework3_1;

public class PhysicalWeapon extends Weapon implements Equipment{
    public PhysicalWeapon(String name, int ATK, int DEF) {
        super(name, ATK, DEF);
    }

    public String use(){
        return "穿戴装备: " + getName();
    }
    public String unuse(){
        return "脱下装备: " + getName();
    }

}
