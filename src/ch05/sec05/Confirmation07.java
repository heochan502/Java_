package ch05.sec05;

public class Confirmation07 {
    public static void main(String[] args) {
        int[] array= {-11,-32,-3,-5,-1,-2,-4};
        int temp=array[0];
        for (int i=1; i< array.length; i++)
        {
             if(temp<array[i]) {
                 temp = array[i];
             }
        }
        System.out.printf("%d", temp );
    }
}

