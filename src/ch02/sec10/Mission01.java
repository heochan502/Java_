package ch02.sec10;
import java.util.Scanner;


public class Mission01 {
    public static void main (String[] args)
    {

       // String strNum= scanner.next();// 입력받은 문자열을 정수로 파싱하여 x2한값

      //  System.out.println ("입력 받은 숫자의 2배는 : "+ strNum );
       // int inNum= Integer.parseInt(strNum) *2;
       // System.out.println ("입력 받은 숫자의 2배는 : "+ inNum );
        int inNum=0;
        try {
            Scanner scanner= new Scanner (System.in);
            System.out.printf("숫자를 입력해주세요>");
            String strNum= scanner.next();// 입력받은 문자열을 정수로 파싱하여 x2한값
           // System.out.println ("입력 받은 숫자의 2배는 : "+ strNum );
             inNum= Integer.parseInt(strNum) *2;
            System.out.println ("입력 받은 숫자의 2배는 : "+ inNum );
        }
        catch(Exception e)
        {

            System.out.println("숫자 입력해 이새끼야");
        }

    }
}
