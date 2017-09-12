package ch8;

/**
 * this is excercise of Book "INtroducion of Java "
 * Created by mo3tamed on 9/7/17.
 */
public class SumDiagonal {
    public static void main(String[] args) {
        int[][] samples  = { { 1,1  ,1 },
                {1,1 , 1},
                { 1,1,1 }} ;

        System.out.println(sumDiagonal(samples));
    }

    public static  int    sumDiagonal(int[] [] values) {


        int sum = 0 ;
        for (int i = 0; i < values.length; i++) {
            sum+= values[i][i] ;  // as diagonal in same row /col order
        }

        return  sum ;
    }
}
