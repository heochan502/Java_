package ch04.sec02;
import java.util.Scanner;
public class Mission01 {
    public static void main (String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("점수를 입력하세요> ");
        //int inNum= scanner.nextInt();
        String sNum= scanner.next();
        int temp;
        temp= Integer.parseInt(sNum);
        if (temp>=60){
            System.out.println("합격입니다.");
        }
        else {
            System.out.println("불합격입니다.");
        }
    }
}
