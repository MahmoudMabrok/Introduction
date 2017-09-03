package ch5;

/**
 * this is
 * Created by mo3tamed on 9/3/17.
 */
public class HeadOrNail {
    public static void main(String[] args) {

    int n = 1_00 ;  // number of turns

    int head =0, nail  =0;

        for (int i = 0; i < n; i++) {
            int ran = (int )(Math.random()*2) ;
            if (1 == ran)
                head ++ ;
            else
                nail++ ;
        }

        System.out.println("head = " +head );
        System.out.println("nail = " + nail);





    }



}
