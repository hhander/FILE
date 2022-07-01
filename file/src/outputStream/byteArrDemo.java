package outputStream;

import java.io.*;

public class byteArrDemo {
    public static void main(String[] args) {

        long stTime = System.currentTimeMillis();

        try(
                InputStream is = new FileInputStream(new File("E:\\高数\\1.多元函数的基本概念.mp4"));
                InputStream bis = new BufferedInputStream(is);
                OutputStream os = new FileOutputStream(new File("D:\\CODE\\BBB"));
                OutputStream bos = new BufferedOutputStream(os);

                ) {
//            byte[] buffer = new byte[1024];
            int len;
            while((len = bis.read())!= -1)
            {
                bos.write(len);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        long endTime = System.currentTimeMillis();
        System.out.println(endTime - stTime);

    }
}
