package ch05.sec06;

import java.util.Arrays;

public class ArrayCreateByValueListExample2 {
    public static void main(String[] args) {
        //int[] scores ={83, 90,87};
        int[] scores;
        //scores = {83, 90,87};
        scores = new int[]{83, 90, 87};
        System.out.println("main: " + Arrays.toString(scores));
        printItem(scores);
    }
    // 소괄호에 들어있는건 파라메터임 위에는 string 아래는int 파라메터
    // 한국어로는 매개변수 임
    //            리턴타입 메소드명  (파라미터(매개변수))
    public static void printItem(int[] arr)
    {
        System.out.println("printItem: " +Arrays.toString(arr));
    }
}
