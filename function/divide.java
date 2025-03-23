import java.util.Scanner;
public class divide {
    public static void main(String[] args) {
        divide();
        

    }static void divide(){
    Scanner in=new Scanner (System.in);
    int a,b,divide;
    System.out.println("enter the first number ");
    a=in.nextInt();
    System.out.println("enter the second number ");
    b=in.nextInt();
    divide =a/b;
    System.out.println("divide is ="+ divide );


    }

    
}
