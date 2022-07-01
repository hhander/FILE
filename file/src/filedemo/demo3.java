package filedemo;

import java.io.*;

public class demo3 {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        InputStream is = new FileInputStream(new File("bbb.txt"));
//        try {
//            int a;
//            while((a = is.read()) != -1) {
//                System.out.println((char) a);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        byte[] bytes = new byte[3];
        try {
            int len;
            while ((len = is.read(bytes)) != -1) {
                System.out.print(new String(bytes,0,len));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        String flag = "abc我爱中国";
        byte[] b = flag.getBytes("GBK");
        String a = new String(b,"GBK");
        System.out.println(a);




    }

}
