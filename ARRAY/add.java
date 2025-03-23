
class calc{
    public int  add (int x,int y) 
    {
     int result=x+y;
     return result;

    }
}



public class add {
    public static void main(String[] args){
        calc obj=new calc();
        int result=obj.add(5,6);
        System.out.println(result);
    }
    
}
