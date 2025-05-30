package ch05.sec05;

public class Confirmation08 {
    public static void main(String[] args) {
        int[][] array= {
                {95,86},
                {83,92,96},
                {78, 83,93,87,88}
        };
        int sum =0;
        int divNum=0;
        for (int i=0; i < array.length; i++){
            divNum+=array[i].length;
            for (int k=0; k<array[i].length; k++,divNum++)
            {
                sum+=array[i][k];
            }
        }
        System.out.printf("전체의 합 : %d \n 전체의 평균 : %f ",sum,(double)sum/divNum );

        //System.out.printf("%d", temp );
    }
}

