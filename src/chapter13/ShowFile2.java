package chapter13;


import java.io.*;

/*
     Display a text file
     To use this program,specify the name
     of the file that you want to see.
     For example, to see a file called TEST.txt
     use the following command line.
     Java ShowFile2 TEST.txt

     This variation wraps the code that opens and
     access the file within a single try block.
     The file is closed by the final block
*/
public class ShowFile2 {
    public static void main(String[] args) {
        FileInputStream fin = null;
        int i;

        //First confirm that a file name has been specified
        if (args.length != 1) {
            System.out.println("Usage: ShowFile2 fileName");
            return;
        }
        //At this point , the file is open and can be read
        //The following read characters until EOF is encountered.
        try {
            fin=new FileInputStream(args[0]);
            do {
                i =fin.read();
                if(i!=-1){
                    System.out.println((char)i);
                }
            }while (i!=-1);
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        } catch (IOException e) {
            System.out.println("An I/O Error Occurred");
        }
        finally {
            //Close file in all cases
            try {
                if(fin!=null){
                    fin.close();
                }
            } catch (IOException e) {
                System.out.println("Error Closing File");
            }
        }
    }
}
