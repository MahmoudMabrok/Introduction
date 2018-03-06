package ch21;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * this is
 * still handle String
 * Created by mo3tamed on 1/24/18.
 */
public class Excercise21_3 {

    public static void main(String[] args) {


       File f = new File("/home/motamed/Projects/Introduction/src/ch21/Test.java") ;
        if (f.exists())
        {

            if (f.isDirectory())
            {
                File[] files = f.listFiles() ;
                for(File file : files)
                {
                    System.out.println(file.getName());
                    System.out.println("@@ "  + countOfKeyword(file));
                }
            }else
            {

                System.out.println("@@ "  + countOfKeyword(f));

            }

        }
       // System.out.println(countOfKeyword(f));

    }

    public static long countOfKeyword (File f ){
        String[] keywordString = {"abstract", "assert", "boolean",
                "break", "byte", "case", "catch", "char", "class", "const",
                "continue", "default", "do", "double", "else", "enum",
                "extends", "for", "final", "finally", "float", "goto",
                "if", "implements", "import", "instanceof", "int",
                "interface", "long", "native", "new", "package", "private",
                "protected", "public", "return", "short", "static",
                "strictfp", "super", "switch", "synchronized", "this",
                "throw", "throws", "transient", "try", "void", "volatile",
                "while", "true", "false", "null"};
        Set<String> keywordSet =
                new HashSet<>(Arrays.asList(keywordString));

        String line ;
        String[] tokens ;
        long count = 0 ;
        Scanner sc  ;
        try
        {
            sc= new Scanner(f) ;
            while (sc.hasNext()) {
              //  System.out.println("start of while");
                line = sc.nextLine();
              //  System.out.println("line = " + line);
                if (line.length() > 0) {
                    if (line.contains("//")) {
                        System.out.println("in // ");
                        continue;
                    }
                    else if (line.contains("/*")){
                        while(!line.contains("*/"))
                            line = sc.nextLine() ;
                        continue;
                    }
                    else {
                        System.out.println("in first else ");
                        tokens = line.split("[ ()]");
                        System.out.println("Tokens");
                        for (String q : tokens
                                ) {
                            System.out.println("T " + q);
                        }
                        if (tokens.length > 0) {
                            if (tokens[0].length() > 0 && tokens[0].charAt(0) == '*') //lines of multiple comment
                                continue;
                            else {

                                System.out.println("not second continue");
                                for (String st : tokens
                                        ) {
                                    if (keywordSet.contains(st))
                                        count++;
                                }
                            }
                        }
                    }

                    System.out.println("current count" + count);
                }

            }//end of while
        }catch (FileNotFoundException s )
        {
            s.printStackTrace();
        }

        return count  ;
    }
}
