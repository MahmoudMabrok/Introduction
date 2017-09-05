package ch6;

/**
 * this is
 * Created by mo3tamed on 9/3/17.
 */
public class TEST {

    public static void main(String[] args) {

        //test ambiguous invocation
        m(1 , 2.0 );



        // System.out.println(testVOID(55)) ; a void method must be a statement
        //                                   print do not resolve a void as a parameter


    /*    int i = 0;
        while (i <= 4) {
            method1(i);
            i++;
        }
        System.out.println("i is " + i);
        System.out.println(0%3); // 0

space
1
2 1
2 1
4 2 1
i is 5
        */


    }

   /* public static void testVOID(int n) {
        System.out.println(n);
        return;

    }*/
/*

    public static void method1(int i) {
        do {
            if (i % 3 != 0)
                System.out.print(i + " ");
            i--;
        }
        while (i >= 1);

        System.out.println();

    }*/

public static void m ( double a  , double b  )
{
    System.out.println((a+b) +  "    two double "  );
}
public static void m ( double b ,  int a  )
{
    System.out.println(a+b );
}



}
