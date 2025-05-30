package ch05.sec05;

import java.util.Arrays;

public class ArrayCopyByForExample {
    public static void main(String[] args) {
        int[] oldIntArray = new int[3];
        for (int i=0; i<oldIntArray.length; i++)
        {
            oldIntArray[i] = i+1;
        }

        int[] newIntAarry= new int[oldIntArray.length];

        for (int i =0; i< newIntAarry.length; i++)
        {
            newIntAarry[i]=oldIntArray[i];
        }

//        int k=0;
//        for (int temp : oldIntArray)
//        {
//            newIntAarry[k++] = temp;
//        }

        System.out.println(Arrays.toString(oldIntArray));
        System.out.println(Arrays.toString(newIntAarry));

        oldIntArray[0]=10;

        System.out.println(Arrays.toString(oldIntArray));
        System.out.println(Arrays.toString(newIntAarry));

//        for (int tmp : oldIntArray)
//        {
//            System.out.println(tmp);
//        }
    }
}
