import java.util.Scanner;

class Car{
    public Car(){
        System.out.println("1. Car brand is BMW");
    }
    public Car(String brand){
        System.out.println("2. Car brand is "+brand);
    }
}

public class Demo6 {
    public static void main(String[] args) {
        Car obj=new Car();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the car brand name : ");
        String brand=sc.next();
        new Car(brand);
    }
}
