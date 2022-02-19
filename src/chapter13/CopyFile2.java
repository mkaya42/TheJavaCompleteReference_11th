package chapter13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* A version of CopyFile that uses try with resources
   It demonstrates two resources (in this case files) being
   managed by single try statements
 */
public class CopyFile2 {
    public static void main(String[] args) {
        int i;
        if (args.length != 2) {
            System.out.println("Usage CopyFile2 File Name");
            return;
        }
        try (FileInputStream fin = new FileInputStream(args[0]);
             FileOutputStream fout = new FileOutputStream(args[1])) {
            do {
                i = fin.read();
                if (i != -1) fout.write(i);
            } while (i!=-1);

        } catch (IOException e) {
            System.out.println("I/O Error");
        }
    }
}
