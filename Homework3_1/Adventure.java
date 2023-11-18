package Homework3_1;

import java.util.Scanner;

public class Adventure {
    public void ChooseCharacter(){
        Scanner sc = new Scanner(System.in);
        System.out.println("————角色选择界面————");
        System.out.println("目前只有两个角色TuT");
        Warrior warrior = new Warrior("战士",0,150,30,2,15,5);
        System.out.println("1、" + warrior.getName() + "等级：" + warrior.getLevel() + "血量："  + warrior.getHP()
                                     + "蓝量：" + warrior.getMP() + "攻击：" + warrior.getATK() +
                                       "防御：" + warrior.getDEF() + "闪避：" + warrior.getSP() );
        PhysicalWeapon physicalWeapon = new PhysicalWeapon("木剑",3,0);
        System.out.println(physicalWeapon.use());

        System.out.println("——————————————————————————————————————————");

        Mage mage = new Mage("法师",0,100,50,2,7,3);
        System.out.println("2、" + mage.getName() + "等级：" + mage.getLevel() + "血量：" + mage.getHP() +
                                        "蓝量：" + mage.getMP() + "攻击：" + mage.getATK() +
                                        "防御：" + mage.getDEF() + "闪避：" + mage.getSP());
        MagicWeapomn magicWeapomn = new MagicWeapomn("木法杖",3,0);
        System.out.println(magicWeapomn.use());

        System.out.println("现在请做出你的选择： ");
        int choose = sc.nextInt();
        switch (choose){
            case 1:
                Travel1();
                break;
            case 2:
                Travel2();
                break;
            default:
                break;
        }
    }
    public void Travel1() {
        System.out.println("————游历功能————");
        System.out.println("关卡1");
        Enemy enemy = new Enemy("饥饿的野狗",75,10,10,3);
        Warrior warrior = new Warrior("战士",0,150,30,2,15,5);
        System.out.println( "你在外闲逛时意外碰到了" + enemy.getName() +
                "," + enemy.getName() + "向你冲过来");
        System.out.println("战斗开始—————");
        while(warrior.getHP() > 0 && enemy.getHp() > 0) {
            int damage1 = warrior.getATK() - enemy.getDEF();
            int damage2 = enemy.getATK() - warrior.getDEF();
            System.out.println("你向" + enemy.getName()+ "发起攻击，并对其造成" + damage1
            + "点伤害值");
            enemy.setHp(enemy.getHp() - damage1);
            if (enemy.getHp() <=0){
                System.out.println("你击败了" + enemy.getName());
            }else  {
                System.out.println(enemy.getName() + "向你反击，并造成了" + damage2
                + "点伤害");
                warrior.setHP(warrior.getHP() - damage2);
                if (warrior.getHP() <= 0){
                    System.out.println("你被击败了，请多试试吧~");
                }
            }
        }

    }
    public void Travel2() {
        Enemy enemy = new Enemy("饥饿的野狗",75,10,10,3);
        Mage mage = new Mage("法师",0,100,50,2,7,3);
        System.out.println( "你在外闲逛时意外碰到了" + enemy.getName() +
                "," + enemy.getName() + "向你冲过来");
        System.out.println("战斗开始—————");
        while(mage.getHP() > 0 && enemy.getHp() > 0) {
            int damage1 = mage .getATK() - enemy.getDEF();
            int damage2 = enemy.getATK() - mage.getDEF();
            System.out.println("你向" + enemy.getName()+ "发起攻击，并对其造成" + damage1
                    + "点伤害值");
            enemy.setHp(enemy.getHp() - damage1);
            if (enemy.getHp() <=0){
                System.out.println("你击败了" + enemy.getName());
            }else  {
                System.out.println(enemy.getName() + "向你反击，并造成了" + damage2
                        + "点伤害");
                mage.setHP(mage.getHP() - damage2);
                if (mage.getHP() <= 0){
                    System.out.println("你被击败了，请多试试吧~");
                }
            }
        }
    }


}
