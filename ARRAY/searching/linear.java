package ARRAY.searching;
import java.util.Scanner;


public class linear {
    public static void main(String[] args) {
        Scanner scan=new Scanner(Sysem.in);
        System.out.println("enter the number of the element");
        int n=scan.nextInt();
        System.out.println("enter the elements ");
        int arr[]=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();

        }
        System.out.println("enter the target elment which are found of the element ");
        int x=scan.nextInt();
        int index=-1;
        for (int i=0;i<n;i++){
            if( arr[i]==x){
              int   index=i;
                 break;

            }
         }
         if(int index==-1){
            System.out.println("target element are not found");
         }
         else{
            System.out.println("target element are found ");
         }
        
    }
}
