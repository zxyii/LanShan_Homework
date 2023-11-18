package Homework3_1;

public abstract class  Weapon {
    private String name;
    private int ATK;
    private int DEF;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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


    public Weapon(String name, int ATK, int DEF) {
        this.name = name;
        this.ATK = ATK;
        this.DEF = DEF;
    }


}
