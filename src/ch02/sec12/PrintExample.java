package ch02.sec12;

public class PrintExample {
    public static void main (String[]args)
    {
        int value =12300;
        System.out.println("상품의 가격:"+ value+"원");
        System.out.printf("상품의 가격:%d원\n", value);
        System.out.printf("상품의 가격:%,d원\n", value);

        // 아래구문은 문자열 만드는게 목적이라 다양하게 사용가능할듯
        String result = String.format("상품의 가격:%d원\n",value );
        System.out.println(result);

        // %n원은 총 n칸수를 쓰겟다 하는거고  -는 왼쪽 정렬 / 그앞 0문자는 빈칸은 0으로 채운다는거
        System.out.printf("상품의 가격:%11d원\n", value);
        System.out.printf("상품의 가격:%-11d원\n", value);
        System.out.printf("상품의 가격:%011d원\n", value);


        int year = 2025;
        int mon = 10 ;
        int day = 4 ;

        System.out.printf("날짜 : %d-%02d-%02d\n", year,mon,day);

        String result2 = String.format("%d-%02d-%02d\n", year,mon,day);
        System.out.print(result2);
        System.out.printf("날짜 : %d-%02d-%02d\n", year,mon,day);
        int radius =10;
        double area = 3.14159 * radius * radius; //반지름 10인 원의 넓이
        System.out.printf("반지름이 %d인 원의 넓이:%10.2f입니다.\n", radius,area);
        System.out.printf("반지름이 %d인 원의 넓이:%010.2f입니다.\n", radius,area);
        System.out.printf("반지름이 %d인 원의 넓이:%-10.2f입니다.\n", radius,area);

        String name= "홍길동";
        String job ="노석";
        System.out.printf("%6d | %-10s | %10s\n", 1,name,job);



    }
}
