package ch5;

/**
 * this is
 * Created by mo3tamed on 8/31/17.
 */
public class Div56notBoth {

    public static void main(String[] args) {

        int n= 0;
        for (int i = 100 ; i < 1_000  ; i++) {
            if ( (i %5 == 0) ^( i%6==0) )
            {
                System.out.print( i +"  " );
                n++ ;
                if (n > 10 )
                {
                    n= 0 ;
                    System.out.println();
                }
            }
        }
    }
}
