package Homework3_1;

public class Mage extends InitialCharacter implements Fight{

    public Mage(String name,int level, int HP, int MP, int SP, int ATK, int DEF) {
        super(name,level, HP, MP, SP, ATK, DEF);
    }

    @Override
    public void attack(Enemy enemy) {
        System.out.println("对敌人造成伤害");
    }
}
