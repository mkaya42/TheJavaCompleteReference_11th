package chapter13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    Copy a file,
    To use this program specify the name
    of the source file and destination file.
    For example,to copy a file calles FIRST.txt
    to a file called SECOND.txt
    use the following command line

    java CopyFile FIRST.txt SECOND.txt

*/
public class CopyFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;

        //First confirm that both files have been specified
        if (args.length != 2) {
            System.out.println("Usage : CopyFile from to");
            return;
        }

        //Copy a file

        try {
            //Attempt to open the files
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);
            do {
                i = fin.read();
                if (i != -1) {
                    fout.write(i);
                }
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("I/O Error");
        }
        finally {
            try {
                if(fin!=null)fin.close();
            } catch (IOException e) {
                System.out.println("Error closing input file");
            }
            try {
                if(fout!=null)fout.close();
            } catch (IOException e) {
                System.out.println("Error closing output file");
            }
        }
    }
}
