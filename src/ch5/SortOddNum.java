package ch5;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * task is to sort odd number , even number remains in its place
 * sol
 * get index of odd
 * get values of odd
 * then sort it
 * last
 * replace number in right place
 *
 * Created by mo3tamed on 8/31/17.
 */
public class SortOddNum {

    public static void main(String[] args) {
        int [] input = { 10 , 1 , 5 , 8 ,3 ,7} ;
        System.out.println(sortOdd(input));
        for (int e :input) {
            System.out.println(e);
        }


    }

    public static int [] sortOdd ( int [] input )
    {
        ArrayList <Integer> index_odd = new ArrayList<>() ;
        ArrayList <Integer> val_odd = new ArrayList<>() ;
        for (int i = 0; i <input.length ; i++) {
            if (input[i] % 2 != 0 )
            {
                index_odd.add(i) ;
                val_odd.add(input[i]) ;
            }

        }

        Collections.sort(val_odd);

        for (int i = 0 , j= val_odd.size()-1 ; i <val_odd.size() ; i++ , j--) {
            input[index_odd.get(j)] = val_odd.get(i) ; // place number in place
        }

        return input ;



    }
}
