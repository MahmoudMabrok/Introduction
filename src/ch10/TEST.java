package ch10;

import java.math.BigInteger;

/**
 * this is
 * Created by mo3tamed on 9/21/17.
 *
 *
 *
 * 4.hashCode() get hash(equiv ) of content in case of string
 * you can use  System.identityHashCode(s2)
 *
 *
 */
public class TEST {

    public static void main(String[] args) {
        
        
        
        Integer t = new Integer("10") + new Integer("10") ;

        int x = t ;
        System.out.println("t = " + t);


        String  s1 = "Hello" ;
        String  s2 = "Hello" ;
        String s3 = new String("Hello") ;
        String s4 = new String("Hello") ;
        System.out.println(s1 == s2 );
        System.out.println(s3 == s4 );
        System.out.println(s3 == s2 );

        System.out.println(s1.length());
        System.out.println(s1.equals(s3));

        System.out.println(System.identityHashCode(s3));
        System.out.println(System.identityHashCode(s4));
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));



        BigInteger b = new BigInteger(String.valueOf(Long.MAX_VALUE)) ;
        for (int i = 0; i <10 ; i++) {
            b=b.add(BigInteger.ONE) ;
            System.out.println( b.toString());
        }



       // System.out.println(s3.hashCode());
      //  System.out.println(s1.hashCode());


    }
}
