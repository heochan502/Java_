package ch04.sec04.method;

import ch03.sec11.ScoreMethodExample;

public class Mission03Method {
    public static void main(String[] args) {
        int star = ScoreMethodExample.getRandomValue(3, 7);
        System.out.println("star : "+ star);


//        printSingleLine(star); // 5라면 *****(개행)
        printStar(star);
//        rePrintStar(star);
        printMultiLine(star);
    }
    public static void printMultiLine(int num)
    {
        for (int i=0; i<num; i++)
        {
            printSingleLine(num);
        }
    }
    public static void rePrintStar(int num)
    {
        for (int i=num; i>0; i--)
        {
            printSingleLine(i);
        }
    }

    public static void printStar(int num)
    {
        for (int i=1; i<=num; i++)
        {
            printSingleLine(i);
        }
    }
    public static void printSingleLine(int num)
    {
        for (int i=0; i<num; i++)
        {
            System.out.print((i==(num-1) ? "*\n": "*"));
        }
    }
}
