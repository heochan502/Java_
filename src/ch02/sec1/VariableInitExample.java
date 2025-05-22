package ch02.sec1;

public class VariableInitExample {
    public static void main (String[ ]args)
    {
        int value=0; // 지역변수 선언 초기화한적 없음
        int result = value +10; // 사용 하려고하면 컴파일 에러가 난다.
        System.out.println(result);
    }
}
