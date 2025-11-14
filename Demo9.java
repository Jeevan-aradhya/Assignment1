class Parent{
    public void message(){
        System.out.println("Hello ! Its Sunday");
    }
}
class Child extends Parent{
    public void message(){
        System.out.println("It's Saturday");
    }
}

public class Demo9 {
    public static void main(String[] args) {
        Child obj=new Child();
        obj.message();
    }
}
