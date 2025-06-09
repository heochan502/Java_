package ch05.sec05.method;

public class ChatAtMethod {
    public static void main(String[] args) {
        String gender1 = checkGender("900212-1998756"); // 남자 리턴
        String gender2 = checkGender("900212-2998756"); // 남자 리턴
        String gender3 = checkGender("900212-3998756"); // 남자 리턴
        String gender4 = checkGender("900212-4998756"); // 남자 리턴
        System.out.println(gender1);
        System.out.println(gender2);
        System.out.println(gender3);
        System.out.println(gender4);

    }
    public static String checkGender(String inStr)
    {
        char ssn= inStr.charAt(7);

        return switch (ssn){
            case '2','4' ->"여자";
            case '1','3' ->"남자";
            default -> "사람아님";
        };


//        if ((int)ssn>'4'|| (int)ssn<'1'){
//            return "사람아님";
//        }
//        else{
//            return ( '3'==ssn || '1'==(ssn) )? "남자":"여자";
//        }

    }
}
