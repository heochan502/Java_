package ch04.sec04;

public class Mission05 {
    public static void main(String[] args) {
        int[] arr={10,70,90,110};
        int sum=0;
        for (int i=0; i<arr.length;i++)
        {
            sum +=arr[i];
        }
        System.out.println(sum);
        sum=0;
        int[] arr2 = {10, 70, 90, 110};
// 배열의 모든 값을 더한 결과값을 출력
        for (int num : arr2) {
            sum += num;
        }

        System.out.println(sum);
    }
}
