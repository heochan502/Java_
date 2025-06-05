package ch04.sec04.method;

public class Mission02Method {
    public static void main(String[] args) {
        printNumberFromTo(11,4); // [2,3,4,5,6]
        printNumberFromTo(16,12); //
    }
    public static void printNumberFromTo(int n1, int n2)
    {
        if (n1>n2)
        {
            int temp = n1;
            n1=n2;
            n2=temp;
        }

        System.out.print("[ ");
        for (int i = n1; i<=n2; i++)
        {


            System.out.print( (i==n2)? i+" ]\n": i+", ");
//            if (i==n2)
//            {
//                System.out.printf("%d ]\n", i);
//                break;
//            }
//            else {
//                System.out.printf("%d, ",i);
//            }

        }
    }



}
