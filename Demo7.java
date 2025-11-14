class Animal{
    public void eat(){
        System.out.println("Animals are eating food ");
    }
}
class Dog extends Animal{
    public void bark(){
        System.out.println("Dog is barking ");
    }
}

public class Demo7 {
    public static void main(String[] args) {
        Dog obj=new Dog();
        obj.eat();
        obj.bark();
    }
}
