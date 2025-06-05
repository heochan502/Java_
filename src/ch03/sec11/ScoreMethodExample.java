package ch03.sec11;

import java.util.Random;

public class ScoreMethodExample {
    public static void main(String[] args) {
        int randomScore = getRandomValue(10,100); // 10~100
        int randomScore2 = getRandomValue(1,5); // 1~5

//        for(int i=0; i<20; i++){
//        System.out.println(randomScore2);
//        randomScore2 = getRandomValue(1,5);
//        }
        System.out.println(randomScore);

        char grade= getGrade(randomScore);
        //100점 초과시 혹은 0점 미만시 ' '리턴
        // 90점 이상 A
        //80점 이상 B
        // 70점 이상 C
        // 나머지 D
        System.out.println("점수는 : " + grade);
    }
    public static int getRandomValue(int from, int to)
    {
        return (int)(Math.random()*(to-from+1)+from );
    }

    public static char  getGrade(int score)
    {

        if (score>100 || score<0)
        {
            return ' ';
        }
//        switch (score/10){
//            case 10:
//            case 9:
//                return 'A';
//            case 8:
//                return 'B';
//            case 7:
//                return 'C';
//            default:
//                return 'D';
//        }

        return switch (score/10) {
            case 10,9 -> 'A';
            case 8 -> 'B';
            case 7 -> 'C';
            default -> 'D';
        };
//        return (ran > 100 || ran < 0) ? '불' :
//                (ran >= 90) ? 'A' :
//                        (ran >= 80) ? 'B' :
//                                (ran >= 70) ? 'C' : 'D';

    }
}
