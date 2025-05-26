package ch03.sec01;

public class SignOperatorExample
{
    public static void main(String[] args)
    {
        int x= -100;
        System.out.println ("x : "+ x);
        x= -x;
        System.out.println ("x : "+ x);

        byte b = 100;
        int y = -b;
        byte aa = 10;
        //byte bb = aa +aa; // 이거 안되는게 연산되는 순간 int 되어서 안됨
        System.out.println("y: " + y);// -100



    }
}
