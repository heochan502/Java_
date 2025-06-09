package ch04.sec09;

import java.util.Arrays;

public class ArrayShuffleMethod {
    public static void main(String[] args) {
        int[] arr = makeArrayFromTo(5,8);
        int[] arr2 = makeArrayFromTo(15,20);
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
}
