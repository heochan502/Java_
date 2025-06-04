package ch02.sec01.method;

public class VariableUseMethodExample {
    public static void main (String[] args)
    {
        printTime(9,20);
        printTime(0,1);

        printTime(2,9, 2);
        printTime(0,1, 1);
    }
    public static void printTime(int hour, int min){
       // System.out.println("호출됐다 ㅋㅋㅋㅋㅋ");
       // System.out.printf("%02d : %02d\n" ,hour,min);
        //this(hour, min);
      // printTime(hour,min);
       // System.out.println( ((hour<10 && hour>=0)? "0"+hour : hour) + " : "+ ((min<10 && min>=0)? "0"+min : min));
        System.out.println(parseTime(hour) +" : "+ parseTime(min));
    }
    public static void printTime(int hour, int min, int sec){
       // System.out.println("호출됐다 ㅋㅋㅋㅋㅋ");
        // System.out.printf("%02d : %02d\n" ,hour,min);
        //System.out.print( ((hour<10 && hour>=0)? "0"+hour : hour)+" : ");
        System.out.print( parseTime(hour) + " : ");
        printTime(min,sec);
       // System.out.println( ((hour<10 && hour>=0)? "0"+hour : hour) + " : "+ ((min<10 && min>=0)? "0"+min : min)+ " : "+ ((sec<10 && sec>=0)? "0"+sec : sec));
    }

    public static String parseTime(int val)
    {
        return val <10 ?"0"+val : String.valueOf(val);
    }
}
