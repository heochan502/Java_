package ch01.sec08;

// ch01.sec08.Hello


/*
    클래스 선언
    Hello: 클래스명
    클래스명은 파일명과 동일 하다.
    public 클래스명은 파일명과 동일하다.
* */
public class Hello {
    /* main 메소드 선언 후 메소드 콜이나 호출로 사용한다
       main: 메소드명
       main 메소드는 프로그램으로 시작함.
    */
    public static void main(String[] args) {
        // "  " 쌍따옴포 사이는 문자열로 표현, 문자열 안에서는 주석처리 안 된다.
        System.out.printf("Hello,/*여기 주석 아님*/ Java!\n"); // println 메소드 호출

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }
     class Hi{

     }
}