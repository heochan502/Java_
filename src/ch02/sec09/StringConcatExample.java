package ch02.sec09;

public class StringConcatExample {
    public static void main (String[] args)
    {
        //숫자 연산
        int result1 = 10+2+8;
        System.out.println("result1 : " + result1);

        // 결합연산
        String result2 = 10+ 2+ "8";
        System.out.println("result2 : " + result2); // 128

        String result3 = 10+ "2"+ 8;
        System.out.println("result3 : " + result3); // 1028

        //앞의 문자열 때문에 뒤에도 문자열로 파싱되어서 문자열로 판단해버린다
        String result4 = "10"+ 2 + 8;
        System.out.println("result4 : " + result4); // 1028


        String result5 = "10"+ (2 + 8);
        System.out.println("result5 : " + result5); // 1010


    }
}
