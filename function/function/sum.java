package function;
import java.util.Scanner;
public class sum {
    public static void main(String []args){
       int ans= sum();
        System.out.println(ans);

    }
    static int  sum(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the firt number ");
        int num1=input.nextInt();
        System.out.println("Enter the second number ");
        int num2= input.nextInt();
      int sum=num1+num2;
      return sum;
      


    }
    
}
