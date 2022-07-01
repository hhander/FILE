package outputStream;

import java.io.*;

public class CopyDemo {
    public static void main(String[] args) {

        try (
                InputStream is = new FileInputStream("E:\\高数\\1.多元函数的基本概念.mp4");
             OutputStream os = new FileOutputStream("D:\\CODE\\ABC");)
        {

            byte[] buffer = new byte[1024];
            int len;
            while ((len = is.read(buffer))!=-1) {
                os.write(buffer,0,len);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }




    }
}
