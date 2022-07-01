package outputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class demo2objectOutputstream {
    public static void main(String[] args) {
        try (
                OutputStream os = new FileOutputStream("file/src/sss.object",true);
                ObjectOutputStream oos = new ObjectOutputStream(os);
                ){
            Student s1 = new Student("张三",18,"乒乓球");
            Student s2 = new Student("李四",19,"乒乓球");
            oos.writeObject(s1);
            oos.writeObject(s2);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
