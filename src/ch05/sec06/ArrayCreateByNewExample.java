package ch05.sec06;

import java.util.Arrays;

public class ArrayCreateByNewExample {
    public static void main(String[] args)
    {
        // 배열 공간 먼저 확보
        int[] arr1 = new int[4];
        for(int i=0; i<arr1.length;i++)        {
            System.out.printf("arr1[%d]: %d\n",i,arr1[i]);
        }
        int temp=insert(arr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println(temp);

        int num =0;
        for(int i=0; i<arr1.length;i++)
        {
            arr1[i] = num += 10;
            // 읽기와 쓰기는 분리하는데 좋다
            System.out.printf("arr1[%d]: %d\n",i,arr1[i]);
        }
    }


    public static int insert(int[] arr)
    {
        for(int i=0; i<arr.length; i++)
        {
            arr[i]= (int)(Math.random()*10);
        }
        return arr[0];
    }
}
