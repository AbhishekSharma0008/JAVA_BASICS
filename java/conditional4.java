public class conditional4 {
    
    public static void main(String []args ){
        int a=5;
        int b=4;
        int c=5;
        if (a==b && b==c && c==a  ){
            System.out.println("the triangle is equilateral trinagle ");
        }
        else if (a==b && b!=c && c!=a ){
            System.out.println("the triangel is isoscle triangle ");
        }
        else {
            System.out.println("the triangle is scalane triangle "); 
             }
    }
}
//triangle concept 