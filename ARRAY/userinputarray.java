package ARRAY;
import java.util.Scanner;

public class userinputarray {
public static void main(String[] args) {
  // 2-d array
    
    Scanner scan =new Scanner(System.in);
    System.out.print("enter the classes ");
      int classes=scan.nextInt();
    System.out.print("enter the student ");
   int student=scan.nextInt();
   int [][]ar=new int [classes ][student];
   for(int i=0;i<ar.length;i++){
    for(int j=0;j<ar[i].length;j++){
        System.out.println("enter the marks ");
        ar[i][j]=scan.nextInt();
     }
     }
     System.out.print("the marks is  ");
     for(int i=0;i<ar.length;i++){
        for(int j=0;j<ar[i].length;j++){
            System.out.print (ar[i][j]+ " ");
        }
        System.out.println();
     }





}
    
}
