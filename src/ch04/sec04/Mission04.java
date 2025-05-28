package ch04.sec04;

public class Mission04 {
    public static void main (String[]args)
    {
        int dan = (int)(Math.random()*11.0)+2;

        System.out.printf("%d  \n", dan);
        for(int i=1; i<=dan; i++)for (int j=1; j<10; j++)System.out.printf("%d x %d = %d%s", i,j,i*j,(j!=9)? " ":(j==i)? "\n\n":"\n");


    }
}
