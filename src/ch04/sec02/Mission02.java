package ch04.sec02;

import java.util.Scanner;

public class Mission02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("점수를 입력하세요> ");
        int inNum= scanner.nextInt();
        if (inNum > 100 || inNum <= 0 ) {
            System.out.println("잘못된 점수");
        }
        else{
            System.out.printf("%s", (inNum>=90)? "A":  (inNum==80)? "B":  (inNum==70)? "C": "D" );
        }

    }
}
