package ch04.sec04.method;

public class Mission07Method {
    public static void main(String[] args) {
        int[] scores ={90,88,100,70,60,90};

        double avg =getAverage(scores);
        System.out.printf("배열의 평균은 : %f", avg);
    }
    public static double getAverage(int[] num)
    {
        int sum =Mission05Method.addAllUpArray(num);
//        for(int i : num)
//        {
//            sum+=i;
//        }
        return (double)sum/num.length;
    }
}
