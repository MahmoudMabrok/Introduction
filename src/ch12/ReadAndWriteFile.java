package ch12;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * this is
 * Created by mo3tamed on 10/13/17.
 */
public class ReadAndWriteFile {

    public static void main(String[] args) {

        writeFile("a.txt" , "My Name Is MaHmouOD ");
        readFile(new File("a.txt"));

        System.out.println(System.getProperty("line.separator"));

    }
    public static  void readFile (File f  )
    {

        try (Scanner read = new Scanner(f))
        {
            while(read.hasNext())
            {
                System.out.println(read.nextLine());
            }
        }catch (IOException e )
        {
            System.out.println(e.getMessage());
        }
    }

    public static void writeFile (String  file  , String content )
    {
        if (new File(file).exists())
        {
            System.out.println("file exists ");
            return;
        }

        try (PrintWriter write = new PrintWriter(file))
        {
           write.print(content);

        }catch (IOException e)
        {
            System.out.println("e = " + e);
        }

    }
}
