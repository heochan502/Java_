package ch05.sec08;

public class ArrayRefObjectExample {
    public static void main(String[] args)
    {
        String[] strArray = new String[3];
        strArray[0]="JAVA";
        strArray[1]="JAVA";
        strArray[2]= new String("JAVA");

        System.out.println(strArray[0].equals(strArray[2]));
        System.out.println(strArray[0]==strArray[2]);

    }
}
