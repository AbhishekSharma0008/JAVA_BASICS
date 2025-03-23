package function;
import java.util.Scanner;

public class divide {
    public static void main(String[] args){
        int ans=divide();
        System.out.println(" ans " + ans);

    }

    
    static int divide (){
    Scanner input =new Scanner(System.in);
    System.out.println("Enter the first number ");
    int a=input.nextInt();
    System.out.println("Enter the second number ");
    int b=input.nextInt();
    int divide =a/b;
    return divide;
}
}
