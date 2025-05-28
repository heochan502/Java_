package ch04.sec04;

public class Mission02 {
    public static void main (String[] args)
    {
        for(int i=1;i<11; i++)
        {
            System.out.printf("%d%s",i, (i==10) ? "":", " );
        }
        System.out.println();
        int k=0;
        int j=1;
        for ( j=1; j<11; j++)
        {
            for (k=j; k!=10; )
            {
                System.out.printf("%d, ",j );
                break;
            }
          //  System.out.printf("%d",i );
        }
        System.out.printf("%d",k );
    }
}
