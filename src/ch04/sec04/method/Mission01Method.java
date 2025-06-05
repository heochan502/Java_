package ch04.sec04.method;

public class Mission01Method {
    public static void main(String[] args) {
        int sum = sumFromTo(10,20); // 10~ 20까지 모두 더한값
        int sum2 = sumFromTo(15,49); // 10~ 20까지 모두 더한값


        System.out.println(sum);
        System.out.println(sum2);

    }
    public static int sumFromTo(int innum1, int innum2)
    {
        for(int i=innum1+1; i<=innum2; i++)
        {
            innum1+=i;
        }
        return innum1;
    }
}
