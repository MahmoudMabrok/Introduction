package ch2;

import java.util.Scanner;

/**
 * this is
 * Created by mo3tamed on 8/21/17.
 */
public class Test1 {
    public static void main(String[] args) {
         // int i=j=k = 2 ;  error not define k , j but as assign is valid

       /* long  b = 2547854751L;
        System.out.println(3%5);
        long x=0 ,y= 1;
        Double d = 10.26647;
        System.out.println(--x);
        System.out.println(x=15);
        System.out.println(y=++x+x++);
        System.out.println(y);*/

     //   System.out.println((int)(d*1000)/ 1000.0); tested

        /*for (int i = 0; i < 50; i++) {
            System.out.println( (int)(Math.random()*2)); // return 0.1 randomly
        }*/
        // check  equal for float

      /*  double f1 = 1-0.1-0.1-0.1-0.1-0.1-0.1-0.1;
        System.out.println(f1 - 0.3< (1E-14));*/

/*
        int x =(int)(Math.random()*10) ;
        int y =(int)(Math.random()*10 );

        System.out.println(x + "  -  " + y  + " =   "
        );
        Scanner in = new Scanner(System.in) ;
        int re = in.nextInt() ;

        System.out.println(re == x - y );
*/
Test1 t1 = new Test1() ;
        Scanner in =new Scanner(System.in) ;

        float f = in.nextFloat() ;
        double d = in.nextDouble() ;


        double e = 65;
        Double ee = (double)65 ;

        System.out.println(e);



    }
}
