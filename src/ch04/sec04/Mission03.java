package ch04.sec04;

public class Mission03 {
    public static void main (String[] args){
        int star =(int)(Math.random()*6.0)+3;
//        for (int i=0; i<10; i++) {
//            star =(int)(Math.random()*6.0)+3;
//
//            System.out.printf("%d  ", star);
//        }
        System.out.printf("별의 수 : %d  \n", star);
        for(int i =0; i<star; i++)for (int j=0; j<=star; j++) System.out.printf("%s", (j!=star)? "*":"\n");
    }
}
