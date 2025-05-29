package ch05.sec05;

public class IndexOfContainsExample {
    public static void main(String[] args) {
        String subject = "자바 프로그래밍 나이쓰 프로그래밍";
        int idx = subject.indexOf("프로그래밍");
        System.out.println("idx : "+ idx);

        // 그 단어의 앞의 위치값 반환 함
        System.out.println("idx앞 : "+subject.indexOf("그"));
        System.out.println("idx뒤  : "+subject.lastIndexOf("그"));

        boolean result = subject.contains("나이쓰");
        System.out.println("result: " + result);
    }
}
