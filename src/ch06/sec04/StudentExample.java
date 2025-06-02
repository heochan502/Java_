package ch06.sec04;

public class StudentExample {
    public static void main(String[]args)
    {
        // s1은 주소값을 저장한다 즉 Student라는 class 객체의 주소값을 저장한다.
        //
        Student s1 = new Student();
        System.out.println("s1 변수가 Student 객체를 참조합니다.");

        Student s2 = new Student();
        System.out.println("s2 변수가 Student 객체를 참조합니다.");
        s1.name="홍길동";
        s2.name="신사임당";
        s1.introduce();
        s2.introduce();

    }
}
