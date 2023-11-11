package Homework2;

abstract class Pet  {
    String name;
    String sex;

    public Pet (String name, String sex){
        this.name = name;
        this.sex = sex;

    }
    public abstract  void talk() ;
    public abstract  void eat() ;



}
