package ch3;

import java.util.Scanner;

/**
 * this is
 * Created by mo3tamed on 8/24/17.
 */
public class SolveQuadric {

    public static void main(String[] args) {


        int a,b ,c;
        Scanner in = new Scanner(System.in) ;

        System.out.println("Enter a , b ,c ");
        a= in.nextInt() ;
        b= in.nextInt() ;
        c= in.nextInt() ;

        int discrimint = (b * b) - 4 *(a * c) ;

        if (discrimint  == 0 )
        {
            System.out.println("one solution ");
            System.out.println(  -b  / (2.0 * a) );
        }
        else if (discrimint > 0 )
        {
            System.out.println("two solution ");
            System.out.println( (-b+Math.sqrt(discrimint) ) /( 2.0 *a));
            System.out.println( (-b-Math.sqrt(discrimint) ) /( 2.0 *a));

        }
        else
            System.out.println("no real solution ");
    }
}
