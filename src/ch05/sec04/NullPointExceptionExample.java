package ch05.sec04;

public class NullPointExceptionExample {
    public static void main(String[] args) {
        int[] arr=null;
//        arr[0]=10; null
//        System.out.println(arr.length); null
        String str =null;
        System.out.println(str.length()); //null
    }
}
