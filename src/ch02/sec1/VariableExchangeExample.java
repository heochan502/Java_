package ch02.sec1;

public class VariableExchangeExample {
    public static void main(String[] args)
    {
        int x = 3, y=5;
        System.out.printf("x: %d, y: %d\n",x,y);
        int temp =y;
        y=x;
        x=temp;
        System.out.printf("x: %d, y: %d\n",x,y);

    }
}
