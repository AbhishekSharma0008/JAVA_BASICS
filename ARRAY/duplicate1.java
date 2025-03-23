package ARRAY;

public class duplicate1 {
    public static void main(String[] args) {
        int arr[]={1,23,44,5,66,7,78,9,9};
        int n=arr.length;

        for (int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if (arr[i]==arr[j]){
                    System.out.println("duplicate number are found is "+arr[i]);
                }

            }
        }
    }
}
