package ch17;

import java.io.*;

/**
 * this is
 * Created by mo3tamed on 1/4/18.
 */
public class Test
{

    public static void main(String[] args) {

        try (FileInputStream fis = new FileInputStream("a.dat");){

        }
        catch (IOException ex ){
            System.out.println(ex.toString());

        }


        try (java.io.PrintWriter output =
                     new java.io.PrintWriter("t.txt"); ) {
            output.printf("%s", "1234");
            output.printf("%s", "5678");
            output.printf("%s", "5678");
            output.printf("%s", "5678");
            output.printf("%s", "21");
            output.printf("%s", "567338");
            output.printf("%s", "567221218");
            output.close();
        }
        catch (FileNotFoundException e)
        {

        }

        try {

        FileInputStream fs = new FileInputStream("t.txt") ;

        int s ;
            System.out.println(s= fs.available());
           /* while (true )
            {
                System.out.println(fs.read() );

            }*/

            for (int i = 0; i < s ; i++) {
                System.out.println(fs.read() );
            }

            System.out.println("Test DataOutput");
            DataOutputStream ds =new DataOutputStream( new FileOutputStream("a.dat")) ;

            ds.write(10);
            ds.writeInt(10);
            ds.writeUTF("AB");
            ds.close();

            fs = new FileInputStream("a.dat") ;
            System.out.println(s= fs.available());
            for (int i = 0; i < s ; i++) {
                System.out.println(fs.read() );
            }
            fs.close();




        }catch (EOFException e )
        {
            System.out.println("finished ");
        }
        catch ( FileNotFoundException f )
        {
            System.out.println("f = " + f);
        }
        catch (IOException e ){

        }



        }


    }

