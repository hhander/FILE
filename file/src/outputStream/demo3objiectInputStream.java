package outputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class demo3objiectInputStream {
    public static void main(String[] args) {
        try(
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream("file/src/sss.object"));
        ) {
            Student s = (Student) ois.readObject();
            System.out.println(s);
            Student s1 = (Student) ois.readObject();
            System.out.println(s1);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
