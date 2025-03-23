import java.util.Scanner;
public class userinput {
 public static void main(String []args){
    Scanner scan=new Scanner(System.in);
    System.out.println("enter the age ");
    int age =scan.nextInt ();
    System.out.println("age is "+age );
    System.out.println("enter the average ");
    double avg=scan.nextDouble();
    System.out.println("avg is"+avg);
    System.out.println("enter the name ");
    String str=scan.next();
    System.out.println("str is"+str);

 }   
}
