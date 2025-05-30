package ch05.sec05.sec11;

public class Mission01 {
    public static void main(String[] args) {
        int sum =0;
//        for (String num : args) {
//            sum += Integer.parseInt(num);
//        }
        char a = 'a';
        System.out.printf("%c %d\n", a , (int)a);
        for (int i=0; i< args.length; i++){
            sum+= Integer.parseInt(args[i]);
        }
        System.out.println("sum: "+ sum);

    }
}
