package ch03.sec03;

public class Confirmation02 {
    public static void main(String[] args) {
        int pencils = 534;
        int students = 30;
        int pencilsPerStudent = (pencils / students);
        System.out.println(pencilsPerStudent);

        int pencilsLeft =(pencils % students);
        System.out.println(pencilsLeft);

        int value =300;
       System.out.println((value/100)*100);
       System.out.println(value-(value%100));

    }
}
