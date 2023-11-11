package Homework2;

public class Cat extends Pet {

    double weight;

    public Cat(String name,String sex,double weight){
        super(name,sex);
        this.weight = weight;
    }


    public void jump() {
        System.out.println(name + "在上蹿下跳");

    }

    public void talk() {
        System.out.println(name + "在向你问好");
    }

    public void eat() {
        System.out.println(name + "在补充能量");
    }
}
