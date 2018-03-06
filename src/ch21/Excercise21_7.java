package ch21;

import com.sun.javafx.collections.MappingChange;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * this is
 * Created by mo3tamed on 1/24/18.
 */
public class Excercise21_7 {

    public static void main(String[] args) {


        File f = new File("/home/motamed/Projects/Introduction/a.txt") ;
        if (f.exists())
        {
            System.out.println("exist");
            for (Map.Entry<String , Integer> m : countWords(f).entrySet()){
                System.out.println( m.getKey() +"    " +m.getValue());
            }
        }

    }
    public static TreeMap<String , Integer>  countWords(File f )
    {
        String value ;
      TreeMap<String ,Integer > data = new TreeMap<>() ;
      try {

          Scanner sc =new Scanner(f) ;
          while (sc.hasNext()){
              value = sc.next() ;
              if (data.containsKey(value))
              {
                  data.put(value,(int)(data.get(value) + 1 ) );
              }else
              {
                  data.put( value,1  ) ;
              }
          }
      }catch (FileNotFoundException e ){
        e.printStackTrace();
      }

return data ;
    }


}
