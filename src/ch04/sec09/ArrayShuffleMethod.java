package ch04.sec09;

import java.util.Arrays;

public class ArrayShuffleMethod {
    public static void main(String[] args) {
        int[] arr = makeArrayFromTo(5,8);
        int[] arr2 = makeArrayFromTo(15,20);
        System.out.println(Arrays.toString(arr) );
        System.out.println(Arrays.toString(arr2) );

        shuffleArray(arr);
        shuffleArray(arr2);
        System.out.println(Arrays.toString(arr) );
        System.out.println(Arrays.toString(arr2) );

    }
    public static int[] makeArrayFromTo(int _start, int _end){
        int[] makeArr= new int[_end-_start];
        for (int i =0 ; i<makeArr.length; i++)
        {
            makeArr[i]= _start+i;
        }
        return makeArr;
    }

    public static void shuffleArray(int[] inArr)
    {
        int temp=0;
        int _rand=0;
        for (int i =0; i< inArr.length;i++)
        {
            temp = inArr[_rand=(int)(Math.random()*inArr.length)];
            inArr[_rand]=inArr[i];
            inArr[i]=temp;
        }


    }


}
