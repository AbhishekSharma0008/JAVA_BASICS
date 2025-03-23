
public class fun_overloading_para {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;

    }

    public static void main(String[] args) {
        System.out.println(sum(9, 1));
        System.out.print(sum(5, 4, 1));;
    }

}
 