// time complexity is O(n)
// space complexity is O(1)

package ARRAY;
public class reversearray{
    public static void main(String[] args) {
        
        int arr[]={
            1,2,34,45,6,67,7
        };
        int temp;
        int n=arr.length;

        for(int i=0;i<n/2;i++){
        temp=arr[i];
        arr[i]=arr[n-i-1];
        arr[n-i-1]=temp;

        }
        System.out.print("reverse number that is ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
}