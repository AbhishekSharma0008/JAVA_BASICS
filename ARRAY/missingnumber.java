package ARRAY;

public class missingnumber {
    public static void main(String[] args) {
        int ar[]={1,2,3,5,6,7,8};
        int n=ar.length;
         int sum_missing_number=((n+1)*(n+2))/2;
         int sum=0;

         for(int i=0;i<n;i++){
            sum+=ar[i];


         }
         int missing_element=0;

         int missing=sum_missing_number-sum;
         System.out.println ("missing_element_in array" + missing +"  ");


    }
    
}
