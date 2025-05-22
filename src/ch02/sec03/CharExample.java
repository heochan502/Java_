package ch02.sec03;

public class CharExample {
    public static void main (String[] args){

        char ch1= 'A';
        System.out.printf("ch1 : %c, %d \n", ch1, (int)ch1);
        System.out.printf("66 : %c, %d \n", 66, 66);
        System.out.printf("66 : %c, %d \n", 67, 67);

        char ch2= 68;
        System.out.printf("ch2 : %c, %d \n", ch2, (int)ch2);

        char ch3= '가';
        System.out.printf("ch2 : %c, %d \n", ch3, (int)ch3);
        System.out.printf("ch2 : %c, %d \n", '힣', (int)'힣');

        String str = "Hello";
        char[] strArr= str.toCharArray();

        System.out.printf("length: %d, H : %c, %d \n", strArr.length, strArr[0], (int)strArr[0]);

        String str2 ="";
        char ch4 = ' ';
        System.out.printf("ch4 : %d \n",  (int)ch4);


        String str5 ="😜";

        char[] strArr2= str5.toCharArray();
        System.out.printf("ch5 : %d length: %d\n",  (int)strArr2[1],strArr2.length );


    }

}
