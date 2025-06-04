package ch02.sec01.method;

public class VariableUseMethodExample {
    public static void main (String[] args)
    {
        printTime(9,20);
        printTime(-3,-0);
    }
    public static void printTime(int hour, int min){
        System.out.println("호출됐다 ㅋㅋㅋㅋㅋ");
       // System.out.printf("%02d : %02d\n" ,hour,min);

        System.out.println( ((hour<10 && hour>=0)? "0"+hour : hour) + " : "+ ((min<10 && min>=0)? "0"+min : min));
    }
}
