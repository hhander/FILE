package filedemo;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

public class demo1 {
    public static void main(String[] args) {
//        File f = new File("E:\\新建文件夹\\谢威威(改完)(老师意见).docx");
        File f = new File("E:" + File.separator+ "新建文件夹" + File.separator + "谢威威(改完)(老师意见).docx");
        long size = f.length();
        System.out.println(size);

        File f1 = new File("file/src/abc.txt");
        List<String> l = new LinkedList<>();


        System.out.println(f1.length());
    }
}
