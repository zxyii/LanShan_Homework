package Homework3_1;

public class Warrior extends InitialCharacter implements Fight{

    public Warrior(String name,int level, int HP, int MP, int SP, int ATK, int DEF) {
        super(name,level,HP, MP, SP, ATK, DEF);

    }


    @Override
    public void attack(Enemy enemy) {
        System.out.println(this.getName() + "对敌人造成了" );
    }



}
