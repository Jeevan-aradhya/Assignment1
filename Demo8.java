class Grandfather{
   public void  gwork(){
       System.out.println("My Grand Father was Agriculturist");
   }
}
class Father extends Grandfather{
    public void fwork(){
        System.out.println("My father was Teacher");
    }
}
class Son extends Father{
    public void swork(){
        System.out.println("I am Engineer");
    }
}

public class Demo8 {
    public static void main(String[] args) {
        Son obj=new Son();
        obj.gwork();
        obj.fwork();
        obj.swork();
    }
}
