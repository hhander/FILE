package filedemo;

import java.io.*;

public class demo4 {
    public static void main(String[] args) throws IOException {
        File f = new File("bbb.txt");
        InputStream is = new FileInputStream(f);
        byte[] bytes = new byte[(int)f.length()];
        int len = 0;
        while((len = is.read(bytes))!=-1);
        {
            String str = new String(bytes);
            System.out.println(str);
        }

    }
}
