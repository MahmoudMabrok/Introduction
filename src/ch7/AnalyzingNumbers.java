package ch7;

import java.util.Scanner;

/**
 * this is
 * Created by mo3tamed on 9/6/17.
 */
public class AnalyzingNumbers {

    public static void main(String[] args) {

        Scanner in =new Scanner( System.in) ; // input
        int[] values = new int[5] ;
        int sum = 0  ;
        double avg = 0 ;


        for (int i = 0; i <values.length ; i++) { // get input and computes sum
            values[i] = in.nextInt();
            sum += values[i] ;
        }

        avg = sum / 5.0 ;  // compute avg

        int n_above_avg =0 ;
        for (int e  : values) {
            if (e > avg )
                n_above_avg ++ ;  // count of above avg
        }

        System.out.println("n count of above avg "+avg + "  is " + n_above_avg  );


    }
}
