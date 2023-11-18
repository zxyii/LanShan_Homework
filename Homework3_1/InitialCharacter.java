package Homework3_1;

public abstract class InitialCharacter {
    private  String name;
    private int level;
    private int HP;
    private int MP;
    private int SP;  //速度
    private int ATK; //攻击
    private int DEF; //防御



    public InitialCharacter(String name,int level, int HP, int MP, int SP, int ATK, int DEF) {
        this.name = name;
        this.level = level;
        this.HP = HP;
        this.MP = MP;
        this.SP = SP;
        this.ATK = ATK;
        this.DEF = DEF;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getMP() {
        return MP;
    }

    public void setMP(int MP) {
        this.MP = MP;
    }

    public int getSP() {
        return SP;
    }

    public void setSP(int SP) {
        this.SP = SP;
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
}
