package ch04.sec04.method;

public class Mission05Method {
    public static void main(String[] args) {
        int [] arr ={10, 70, 90, 110};
        int sum = addAllUpArray(arr);
        System.out.println("배열 값의 합은 : " + sum);
    }
    public static int addAllUpArray( int[] num)
    {
        int sum =0;

        for (int i :num)
        {
            sum+=i;
        }

//        for (int j=0; j<num.length; j++) {
//            sum += num[j];
//        }
        return sum;
    }
}
