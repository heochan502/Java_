package ch02.sec08;

public class Mission01 {
    public static void main(String[] args) {
        int num1=10;
        int num2=3;
        double result = (num1)/(float)num2;
        // 작은 타입값이 큰걸로 바뀐다
        System.out.println("result : "+ result);
    }
}
