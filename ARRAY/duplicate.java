// time complexity is O(n^2)
// space complexity is O(n^2)
package ARRAY;

public class duplicate {
    public static void main(String[] args) {
        int arr[]={1,2,4,4,5,5,6,7};
        int n=arr.length;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if (arr[i]==arr[j]){
                    System.out.println("duplicate number is found "+arr[i]);
                }
            }
        }
    }
    
}
