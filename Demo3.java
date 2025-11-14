class Instance{
    int a;
    public Instance(int num){
        this.a=num;
        System.out.println("Instance variable here is "+a);
    }
}

public class Demo3 {
    public static void main(String[] args) {
        Instance obj=new Instance(15);
        //local variable
        int a=20;
        System.out.println("Value of local variable is : "+a);
    }
}
