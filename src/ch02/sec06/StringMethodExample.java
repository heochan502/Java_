package ch02.sec06;

public class StringMethodExample {
    public static void main (String[]args)
    {
        String str1= new String("안녕");
        String str2= new String("안녕");
        printCompareString(str1, str1);
        // 두 문자열은 동일하다.
        // 두 문자열은 동등하다.
        // 두 문자열은 동등 하지않다.
    }


    public static void printCompareString(String inStr1, String inStr2)
    {
       // boolean temp = inStr1.equals(inStr2);
        System.out.println("비교할 문자 열 A : " +inStr1);
        System.out.println("비교할 문자 열 B : " +inStr2);
        if (inStr1 == inStr2)
        {
            System.out.println("두 문자열은 동일하다");
        }
        else if (inStr1.equals(inStr2))
        {
            System.out.println("두 문자열은 동등하다");
        }
        else
            System.out.println("두 문자열은 동등 하지 않다");


    }
}
