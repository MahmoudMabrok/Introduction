package ch21;

import java.util.LinkedHashSet;

/**
 * this is excercise of Book "INtroducion of Java "
 *
 */

public class Excercise21_1 {

    public static void main(String[] args) {


        LinkedHashSet <String> set1 = new LinkedHashSet<>() ;
        set1.add("A") ;
        set1.add("B") ;
        set1.add("C") ;
        set1.add("D") ;
        System.out.println("set1 = " + set1);
        LinkedHashSet<String> set2 = new LinkedHashSet<>() ;
        set2.add("D") ;
        set2.add("E") ;
        set2.add("F") ;
        System.out.println("set2 = " + set2);

        System.out.println("addAll --- union ");
        set1.addAll(set2);
        System.out.println(set1);

        System.out.println("removeAll   --difference ");
        set1.removeAll(set2) ;
        System.out.println(set1);

        set1.add("D") ;
        System.out.println("retain    --intersection ");
        set1.retainAll(set2);
        System.out.println(set1);



    }
}
