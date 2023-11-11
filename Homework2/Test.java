package Homework2;

public class Test {
    public static void main(String[] args) {
        Dog dog1 = new Dog("旺财","man","黄色");
        dog1.eat();
        dog1.talk();
        dog1.sleep();

        System.out.println("------------------------------------");

        Cat cat = new Cat("肥波","woman",5.6);
        cat.eat();
        cat.talk();
        cat.jump();
    }


}

