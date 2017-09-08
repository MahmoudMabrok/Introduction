package ch7;

import java.util.Arrays;

/**
 * this is
 * Created by mo3tamed on 9/6/17.
 */
public class ArrayOPeration {


    public static void main(String[] args) {

        int[] m = {1, 2, 3, 5, 88, 77};

        shuffle(m);
        display(m);

        m = new int[12];
        System.out.println(m[0]);

    }

    public static void shuffle(int[] values) {

        int j = 0, temp = 0;
        for (int i = 0; i < values.length; i++) {

            j = (int) (Math.random() * (i + 1));
            temp = values[i];
            values[i] = values[j];
            values[j] = temp;

        }

    }

    public static void display(int[] values) {
        for (int e : values)
            System.out.println(e);
    }

    public static int[] getRandomArr( int size  , int start  , int end ) {

        int[] rand = new int[size] ;
        for (int i = 0; i <size ; i++) {
            rand[i] = (start ) + (int )(Math.random()* (end +1 )) ;
        }

        return rand ;
    }

    public  static  void  selectionSort(int[] val )
    {

        int minValue  ;
        int minIndex  ;

        for (int i = 0; i <val.length ; i++) {
            minValue = val[i];
            minIndex = i;
            for (int j = i+1; j < val.length; j++) {
                if (val[j] < minValue)
                {
                    minValue = val[j] ;
                    minIndex = j ;

                }
            }

            if (minIndex != i)
            {
                val[minIndex] = val[i] ;
                val[i] = minValue ;
            }
        }
    }

}