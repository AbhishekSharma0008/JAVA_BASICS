// package ARRAY;

// public class reversal1 {
//     public static void main(String[] args) {
//         int arr[]={1,2,33,4,55,6};
//         int n=arr.length;

//         for(int i=0;i<n/2;i++){
//             int temp=arr[i];
//               arr[i]=arr[n-i-1];
//               arr[n-i-1]=temp;
//         }
//               System.out.println("reverse number is ");
//         for(int i=0;i<n;i++){
//                     System.out.print(+arr[i]+" ");

//         }
//         System.out.println();
//         }
//     }
    
package ARRAY;
public class reversal1 {

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,6};
        int n=arr.length;

        for(int i=0;i<n/2;i++){
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;

        }
        System.out.print("reverse number is ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");

        }
    }
}