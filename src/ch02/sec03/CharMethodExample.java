package ch02.sec03;

public class CharMethodExample {
    public static void main(String[] args) {

        printCharToInt('c');
        printCharToInt('가');
        printCharToInt('!');
        int val = getCharToInt('c');
        System.out.printf("%c : %d \n", (char)val, val);

    }
    //return 매소드, void 매소드
    // 리턴 타입, 매소드명, 파라미터, 구현부
    public static void printCharToInt(char inChar)
    {
        System.out.printf("%c : %d \n", inChar, (int)inChar);
    }
    public static int getCharToInt(char inChar)
    {
//        System.out.printf("%c : %d \n", inChar, (int)inChar);
        return (int)inChar;
    }
}
