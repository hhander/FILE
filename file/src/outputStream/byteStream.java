package outputStream;

import java.io.*;

public class byteStream {
    public static void main(String[] args) {

        try(
                InputStream is = new FileInputStream(new File("E:\\高数\\1.多元函数的基本概念.mp4"));
                OutputStream os = new FileOutputStream("D:\\CODE\\AAA")
        ) {
            int len;
            while(( len = is.read()) != -1) {
                os.write(len);
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    }

