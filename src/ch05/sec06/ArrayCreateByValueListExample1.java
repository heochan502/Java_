package ch05.sec06;

public class ArrayCreateByValueListExample1 {
    public static void main(String[] args) {
        String[] season = {"Spring", "Summer","Fall", "Winter"};

        System.out.println("season[0]: "+season[0]);
        System.out.println("season[1]: "+season[1]);

        season[0]="봄";
        System.out.println("season[0]: "+season[0]);

        int[] scores = {83,90,87};

        int sum=0;

        for (int i =0; i<scores.length; i++) sum+=scores[i];
        System.out.println("sum: "+sum);
        sum =0;
        // 아래는 읽기전용 읽어와서 뭐 데이터 작업할떄만 쓰인다 향샹된 for문
        for (int item :scores) {
            sum+=item;

        }

        double avg = sum/(double)scores.length;
        System.out.println("sum: "+sum);
        System.out.println("평균: "+avg);


    }
}
