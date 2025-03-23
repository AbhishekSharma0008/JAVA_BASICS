public class multi {
    public static void main(String []args ){
        int num[][]={
            {1,2,2,2},
            {1,2,3},
            {1,2}
            };
           
            for(int i=0;i<3;i++)
            {
                for(int j=0;j<num[i].length;j++)
                {
                    System.out.print(num[i][j]+ " ");
                }
                System.out.println();
            }
        }
    }
    

