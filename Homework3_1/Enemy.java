package Homework3_1;

public class Enemy implements Fight{
    private String name;
    private int Hp;
    private int MP;
    private int ATK;
    private int DEF;

    public Enemy() {
    }

    public Enemy(String name, int Hp, int MP, int ATK, int DEF) {
        this.name = name;
        this.Hp = Hp;
        this.MP = MP;
        this.ATK = ATK;
        this.DEF = DEF;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return Hp;
    }

    public void setHp(int hp) {
        Hp = hp;
    }

    public int getMP() {
        return MP;
    }

    public void setMP(int MP) {
        this.MP = MP;
    }

    public int getATK() {
        return ATK;
    }

    public void setATK(int ATK) {
        this.ATK = ATK;
    }

    public int getDEF() {
        return DEF;
    }

    public void setDEF(int DEF) {
        this.DEF = DEF;
    }


    @Override
    public void attack(Enemy enemy) {
        System.out.println("对敌人造成了伤害");
    }
}
