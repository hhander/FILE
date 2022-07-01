package filedemo;

import java.io.File;
import java.io.IOException;

public class FileSearch {
    public static void main(String[] args) {
        findDir(new File("D:\\"),"UI.exe.aria2");
    }

    public static void findDir(File dir,String theFile)
    {
        if(dir!=null && dir.isDirectory())
        {
            File[] f = dir.listFiles();
            if(f!=null && f.length>0) {
                for (File file : f) {
                    if (file.isFile()) {
                        if (file.getName().contains(theFile)) {
                            System.out.println(file.getAbsolutePath());
                            Runtime r = Runtime.getRuntime();
                            try {
                                r.exec(file.getAbsolutePath());
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                    else
                    {
                        findDir(file,theFile);
                    }
                }
            }

            }
        else
        {
            System.out.println("没找到");
        }
        }

    }
