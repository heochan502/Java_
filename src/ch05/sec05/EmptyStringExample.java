package ch05.sec05;

public class EmptyStringExample {
    public static void main(String[] args) {

        String hobby="";
        if("".equals(hobby))//이퀄 앞에는 문자열이있는게 낫다. 반대면 null 이있으면 에러가 터지기 때문
        {
            System.out.println("hobby변수는 빈 문자열 객체를 참조");
        }
    }
}
