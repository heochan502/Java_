package ch05.sec11;

import java.util.Arrays;

public class MainStringArrayArgument {
    public static void main(String[] args) {

        System.out.println(args.length);

        System.out.println(Arrays.toString(args));

        for (String tmp : args){
            System.out.println(tmp);
        }
    }
}
