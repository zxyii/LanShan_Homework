package Homework2;

public class Dog extends Pet {
    String color;

    public Dog(String name,String sex,String color){
        super(name,sex);
        this.color = color;
    }
    public void talk() {
        System.out.println(name + "在向你问好");
    }
    public void eat() {
        System.out.println(name + "在补充能量");
    }

    public void sleep() {
        System.out.println(name + "在休息哦");

    }
}
