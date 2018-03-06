package ch21;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * this is
 * Created by mo3tamed on 1/23/18.
 */
public class TestMap {

    public static void main(String[] args) {
        TreeMap < Integer, String  >  hm= new TreeMap<>() ;
        hm.put( 1,"swwqq" ) ;
        System.out.println("hm = " + hm);
        hm.put(1 , "ssasawqwq") ;
        hm.put(2 , "grawqwq") ;
        System.out.println("hm = " + hm);
        for (Map.Entry <Integer ,String  > entry:hm.entrySet()
             ) {
            System.out.println("Key  " +entry.getKey() +"  Value is  " +entry.getValue() );
        }

        System.out.println(hm.values());
        System.out.println(hm.keySet());

        System.out.println(hm.get(1));





    }
}
