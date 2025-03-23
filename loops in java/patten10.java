public class patten10{
    public static void main(String []args){
        int i,j;
        for(i=0;i<10;i++){
            for (j=0;j<10;j++){
                if (i==0||i==9||j==9/2){

                
                System.out.print("*");

            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }

}
}
