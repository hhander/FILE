package outputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class demo1 {
    public static void main(String[] args) throws IOException {
        OutputStream os = new FileOutputStream("file/src/ccc.txt",true);
//        os.write('a');
//        os.write(98);
        os.write("我爱你中国".getBytes());
        os.write("\r\n".getBytes());
        os.write("哈哈".getBytes());
        os.flush();
        os.close();

    }
}
