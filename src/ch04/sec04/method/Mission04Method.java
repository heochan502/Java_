package ch04.sec04.method;

public class Mission04Method {
    public static void main(String[] args) {
        gugudan(4);
        System.out.println();
        gugudan(5,2);
    }
    public static void gugudan(int num)
    {
        for (int  i =1; i<10; i++)
        {
            System.out.printf("%d x %d = %d\n" , num ,i , num*i);
        }

    }
    public static void gugudan(int num1, int num2){
        int i=0;
        if (num1>num2) {
         i= num1;
         num1=num2;
         num2=i;
        }
        else{
            i=num1;
        }
        for ( i=num1; i<=num2; i++)
        {
            System.out.println("========= "+i+"단 ==========");
            gugudan(i);
            System.out.println();
        }

    }
}
