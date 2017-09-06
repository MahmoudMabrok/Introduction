package ch6;

/**
 * this is
 *
 *    1
 *   212
 *  32123
 * 4321234
 * Created by mo3tamed on 9/5/17.
 */
public class Pattern {


    public static void main(String[] args) {

    printPat(4 );
    }
    public static void  printPat (int n )
    {

        int n_space = n -1 ;

        for (int i = 0; i < n ; i++) {

            printSpaces(n_space); // print spaces
            n_space-- ;

            for (int j = i+1; j >=1 ; j--) {
                System.out.print(j );
            }

            for (int j = 2; j <= i+1 ; j++) {
                System.out.print( j );
            }
            System.out.println();
        }
    }

    public static void printSpaces (int n )
    {
        for (int i = 0; i <n ; i++) {
            System.out.print(" " );
        }
    }
}
