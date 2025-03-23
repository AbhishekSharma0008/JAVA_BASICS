package ARRAY;

public class pallindromic2 {
    public static void main(String[] args) {
        
        int arr[]={1,2,4};
        int n=arr.length;
        int sum_missing_elem =((n+1)*(n+2))/2;
        int sum=0;

        for(int i=0;i<n;i++){
            
            sum+=arr[i];
         
        }
        int missing=0;

        int missing_elem=sum_missing_elem-sum;

        System.out.print("missing_elem "+" " );
            }

        }
    
