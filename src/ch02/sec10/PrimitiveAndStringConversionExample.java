package ch02.sec10;

public class PrimitiveAndStringConversionExample {
    public static void main(String[] args)
    {
        int value1 = Integer.parseInt("10");
        System.out.printf("value1 : %d\n", value1+1);
        System.out.println("value1 : "+ value1);

        double value2 = Double.parseDouble("3.14");// Wrapper Type Class
        //double value2_1= (double)"3.14";  안됨 그래서 위에 방식으로
        // 하나는 레퍼런스 타입 하나는 primitive 타입이라서 그럼
        System.out.println("value2 : "+ value2);


        boolean value3 = Boolean.parseBoolean("true");

        long value4 = Long.parseLong("100000");


//        String str1 = ""+10;
//        System.out.printf("%s" , str1);


        //String str1 = ""+10;
        String str1 =String.valueOf(10);

        String str2 = String.valueOf(value2);
        System.out.printf("value2 : %s" , str2);

    }
}
