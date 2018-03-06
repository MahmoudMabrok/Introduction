package ch17;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * this is
 * Created by mo3tamed on 1/4/18.
 */
public class Copy {

    public static void main(String[] args)  throws IOException {

        if (args.length != 2 )
        {
            System.out.println("Java Copy Source Target ");
            System.exit(1);
        }

        File fi = new File(args[0]) ;
        if (!fi.exists())
        {
            System.out.println("Source not find ");
            System.exit(-1);
        }
        File fout = new File(args[1]) ;
        if (fout.exists() )
        {
            System.out.println("Target exist , Append  ");
           // System.exit(1);
        }

        FileInputStream fs = new FileInputStream(fi) ;
        FileOutputStream fo = new FileOutputStream(fout , true ) ;

        System.out.println("Bytes is " + fs.available() );
        int value ;

        while ( (value = fs.read())!= -1  ){
            fo.write(value );
        }

        fs.close();
        fo.close();


    }
}
