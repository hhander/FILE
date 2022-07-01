package filedemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class demo6 {
    public static void main(String[] args) throws IOException {
        File f = new File("bbb.txt");
        InputStream is = new FileInputStream(f);
        byte[] bytes = is.readAllBytes();
        System.out.println(new String(bytes));

    }
}
