package ch05.sec06;

import java.util.Arrays;

public class ArrayCreateByValueListExample2 {
    public static void main(String[] args) {
        //int[] scores ={83, 90,87};
        int[] scores;
        //scores = {83, 90,87};
        scores = new int[]{83, 90, 87,98};
        System.out.println("main: " + Arrays.toString(scores));
        printItem(scores);


        int[] arr={10,20,30,40,50,100,200};
        printItem(arr);
    }
    // 자바는 객체안에만 매소드를 만들어야해서 매소드만 만들수있고
    // 함수는 객체 밖에서도 만들수있는것 밖에서도 만들수 있으면 함수 아니면 매소드
    // 소괄호에 들어있는건 파라메터임 위에는 string 아래는int 파라메터
    // 한국어로는 매개변수 임
    //            리턴타입 메소드명  (파라미터(매개변수))
    public static void printItem(int[] arr)
    {
       // System.out.println("printItem: " +Arrays.toString(arr));


        for(int i=0; i< arr.length;i++)
        {
            System.out.printf("score[%d]: %d\n" ,i,arr[i]);
        }


    }
}
