class SumDemo{
    int sum=0;
    public void sumnumbers(int a,int b){
        sum=a+b;
        System.out.println("Sum of two numbers are: "+sum);
    }
    public void sumnumbers(int a,int b,int c){
        sum=a+b+c;
        System.out.println("Sum of three numbers are: "+sum);
    }
}

public class Demo10 {
    public static void main(String[] args) {
        SumDemo obj=new SumDemo();
        obj.sumnumbers(10,20);
        obj.sumnumbers(5,15,25);
    }
}
