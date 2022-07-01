package outputStream;

import javax.annotation.processing.SupportedSourceVersion;
import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CSBdemo {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
            try (
                    Reader r = new FileReader(new File("file/src/ChuSshiBiao"));
                    BufferedReader br = new BufferedReader(r);
                    Writer w = new FileWriter(new File("file/src/CSB2"),true);
                    BufferedWriter bw = new BufferedWriter(w);
            ) {
                List<String> l = new ArrayList<>();
                String line;
                while ((line = br.readLine()) != null) {
                    l.add(line);
                }
                l.sort(new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {
                        return o1.charAt(0) - o2.charAt(0);
                    }
                });

                for (String s : l) {
                    bw.write(s);
                    bw.newLine();
                }


            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
        }

    }

