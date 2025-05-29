package ch05.sec05;

public class CharAtExample {
    public static void main(String[] args) {
        String ssn= "950624-34230123";
        char gender = ssn.charAt(7);
        System.out.println("gender : " + gender);
        switch (gender) {
            case '1', '3'->
                System.out.println("남자" );

            case '2', '4' ->
                System.out.println("여자" );
            default ->
                System.out.println("뭐냐" );
        }

        System.out.printf("당신의 성별은 : %s \n",(gender =='1'|| gender =='3')? "남자": "여자");

        if (gender =='1' || gender =='3')
        {
            System.out.println("남자" );
        }
        else if (gender =='2' || gender =='4')
        {
            System.out.println("여자" );
        }
        else
        {
            System.out.println("뭐냐" );
        }




    }
}
