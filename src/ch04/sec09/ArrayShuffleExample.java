package ch04.sec09;

import java.util.Arrays;

public class ArrayShuffleExample {
    public static void main(String[] args) {
        int[] arr = new int[10];
        //1~10


        for (int i=1; i<= arr.length; i++) arr[i-1]=i;
        System.out.println(Arrays.toString(arr));

        int ran =0;
        int indexNum=arr.length-2;
        int temp=0;
       // System.out.printf("랜덤 값 :");
        for (int i=0; i< arr.length; i++)
        {
           // ran = (int)(Math.random()*10.0);
         //   System.out.printf(" %d  ",ran);
            temp=arr[(int)(Math.random()*10.0)];
//            arr[ran] = arr[(ran-indexNum>0)? ran-indexNum:(-(ran-indexNum))];
//            arr[(ran-indexNum > 0)? ran-indexNum:-(ran-indexNum)]=temp;
            arr[(int)(Math.random()*10.0)] = arr[i];
            arr[i]=temp;
        }
        System.out.println("\n"+Arrays.toString(arr));
    }
}
