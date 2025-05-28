package ch04.sec04;

public class Mission06 {
    public static void main(String[] args) {
        /*
        * 1부터 몇까지 더하면 누적합계가 100을 넘지 않는 제일 큰수가
        * 무엇인지
        *
        * */
        int sum=0;
        int i=0;
        for (;sum+i<100;i++)
        {
            sum+=i;
        }
        System.out.println("sum : "+sum+ " i : " + (i-1));
//        int sum = 0;
//        for (int i = 1; 100 > sum+i; i++) {
//            sum += i;
//            if (sum > 100) {
//                System.out.println(i);
//            }
//        }


    }
}