package ch04.sec04;

import java.util.Arrays;

public class Mission07 {
    public static void main(String[] args) {
        int[] scores ={90,88, 100, 70,60};

        int sum = 0;
       // double avg =0.0;
        for (int i : scores) sum+=i;

        for (int i=0; i<scores.length; i++)
        {
            sum+=scores[i];
        }
        System.out.println("평균 : " + (double)sum/scores.length);
        System.out.println("평균 : " + (double)Arrays.stream(scores).sum()/scores.length);
        //Arrays.stream(scores).sum()
    }
}

