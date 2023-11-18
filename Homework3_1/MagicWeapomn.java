package Homework3_1;

public class MagicWeapomn extends Weapon implements Equipment{
    public MagicWeapomn(String name, int ATK, int DEF) {
        super(name, ATK, DEF);
    }

    @Override
    public String use() {
       return "穿戴装备：" + getName();
    }

    @Override
    public String unuse()  {
        return "脱下装备: " + getName();
    }
}
