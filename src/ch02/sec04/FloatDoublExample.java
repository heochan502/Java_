package ch02.sec04;

public class FloatDoublExample {
    public static void main (String[] args)
    {
        // 정밀도 확인
        // 실수 리터럴을 float 변수에 대입할 때는 항상 끝에 'F' or 'f'를 붙인다.
        float var0=0.1F;
        float var00 = (float)0.1;
        // foat var1= 0.01234567890123456789F;
        float var1= 0.01234567890123456789F; // 반만 출력된다
        double var2= 0.01234567890123456789;

        System.out.println("var1 : " + var1);
        System.out.println("var2 : " + var2);

    }
}
