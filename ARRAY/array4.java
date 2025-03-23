public class array4 {
    public static void main(String []args){
        int i ,j;
        int n=4;
        String name[][]={{"ABHISHEK BHARDWAJ"},
    
                     {"IS  A GOOD BOY "},{"CHAMPION"},{"GOAT"}};
        for(i=0;i<n;i++){
            for(j=0;j<name[i].length;j++){
                System.out.print(name[i][j]);
            }
            System.out.println();
        }
    }
    
}
