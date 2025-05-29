package ch05.sec05;


import java.util.Scanner;

public class Mission01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("주민 번호입력하셈.\n "+ "예) xxxxxx-xxxxxxx >");
        String ssn = scan.nextLine();
        System.out.println( ssn.length());
        if (ssn.length()!=14 || ssn.charAt(6) !='-')
        {
            System.out.println("주민 번호 잘못 입력했습니다. ");
        }
        else{
            char gender = ssn.charAt(7);
            System.out.println( gender);
            switch (gender) {
                case '1', '3':
                    System.out.println("남자" );
                break;

                case '2', '4':
                    System.out.println("여자" );
                break;
                default :
                    System.out.println("뭐냐" );
                    break;
            }
        }
    }
}
