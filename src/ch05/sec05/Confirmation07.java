package ch05.sec05;

public class Confirmation07 {
    public static void main(String[] args) {
        int[] array= {1,11,12,5,3,8,2,10};
        int temp=array[0];
        for (int i=0; i< array.length; i++)
        {
             if(temp<array[i]) {
                 temp = array[i];
             }
        }
        System.out.printf("%d", temp );
    }
}

