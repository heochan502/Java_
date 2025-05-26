package ch02.sec02;

public class ByteExample {
    public static void main (String[]args)
    {
        // byte: -128 ~ 127
        byte var1 = -128;
        byte var2 = -30;
        byte var3 = 127;

        System.out.println("byte var1 : " + var1);
        System.out.println("byte var2: " + var2);
        System.out.println("byte var3: " + var3);

        //byte var4 = -129; // 컴파일 에러 발생
        // 컴파일 에러가 났다는 건 데이터를 태입할 수 있다.
        // 너무  큰 값 이라서 타입이 맞지 않아서
        // byte var5 = 128;  // 컴파일 에러 발생
    }
}
