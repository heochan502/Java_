package ch05.sec05.method;

public class Mission02Method {
    public static void main(String[] args) {
        String ext  = getExt("sadf.sdkf.jpg");
        String ext2  = getExt("sad12312f.sd333kf.jpeg");
        System.out.println(ext);
        System.out.println(ext2);

    }
    public static String getExt(String instr)
    {
//        String ext = instr.substring( instr.lastIndexOf('.')+1);
        return instr.substring( instr.lastIndexOf('.')+1);
    }
}
