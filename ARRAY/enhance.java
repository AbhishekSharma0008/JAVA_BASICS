public class enhance {
    public static void main(String[] args ){
        int num[][]=
        {
            {1,2,3,4},{1,2,3},{1,2}
        };
        for( int a[] : num){
            for( int  b: a){
                System.out.print(b+ " ");
            }
            System.out.println();

        }

    }
    
}
