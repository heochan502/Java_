package ch02.sec1;

public class VariableUseExample {
    public static void main (String[] args)
    {
        int hour = 3;
        int min = 5;

        System.out.println(hour + "시간 " + min + "분 \n총 " + ((hour * 60) + min) + "분");
        System.out.printf("%d시간 %d분\n총 %d분",hour ,min ,((hour * 60) + min));

    }

}
