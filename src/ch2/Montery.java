package ch2;

import java.util.Scanner;

/*
 *
 * Created by mo3tamed on 8/22/17.
 * Advice :: work with int rather than double to avoid lose precession
 * Double class --> accept object or double value , double primitive
*/


public class Montery {
    public static void main(String[] args) {

        Scanner in =new Scanner(System.in) ;

        double f = in.nextDouble() ;
        double input = Operation.format( ((int)(f * 1.0) / 1.0 ), 2 )  ; // take input then format to be 2 after point



        int left = (int ) input ;
        int right = (int)((input * 100) %100 );

        //get left parts
        //first i have all value after div with 100 i get num of 100 currency
        System.out.println( left / 100 +"   100$" );
        //then i do reminder to get value of parts  under 100 and so on
        left %= 100 ;
        System.out.println( left / 50 +"   50$" );
        left %= 50 ;
        System.out.println( left / 20 +"   20$" );
        left %= 20;
        System.out.println( left / 10 +"   10$" );
        left %= 10 ;
        System.out.println( left / 5 +"   5$" );
        System.out.println((left %= 5) + "   1$" );


        //get right parts
        //first i have all value after div with 50 i get num of 50 currency
        System.out.println( right / 50 +"   0.50$" );
        //then i do reminder to get value of parts  under 50 and so on
        right %= 50 ;
        System.out.println( right / 25 +"   0.25$" );
        right %= 25 ;
        System.out.println( right / 10 +"  0.10$" );
        right %= 10;
        System.out.println( right / 5 +"   0.05$" );
        System.out.println( (right % 5 ) +"   0.01$" );








    }
}
