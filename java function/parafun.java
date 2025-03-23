
import java.util.Scanner;

public class parafun {

    public static int newfun(int num1, int num2) {//parameters or formal parameters 
        int sum = num1 + num2;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = newfun(a, b);//arguments or actual parameter 
        System.out.println("sum is " + sum);

    }
}
