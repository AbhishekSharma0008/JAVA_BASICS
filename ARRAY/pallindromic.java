// time complexity is O(n)
// space complexity is O(1)

package ARRAY;

public class pallindromic{
    public static void main(String[] args) {
        int arr[]={1,2,3,2,1};
        int n=arr.length;
        int flag=0;
        for(int i=0;i<n/2;i++){
            if(arr[i]!=arr[n-i-1]){
                flag=1;

                System.out.print("NOT A PALLINDROMIC NUMBERS");
                break;
            }
        }
        if(flag==0)
        {
            System.out.print("IT IS A PALLINDROMIC NUMBERS ");
        }
        
    }
}
