package ch06.sec08.exam01;

public class CalculatorExample {
    public static void main(String[] args) {
        // new뒤에는 기본 생성자라고 불리운다
        Calculator cal= new Calculator();

        int test= cal.plus(12,11);
        System.out.println("test : " + test);
        System.out.println("끝");
        cal.powerOn();


    }
}
