package ch8;

/**
 * this is excercise of Book "INtroducion of Java "
 * Created by mo3tamed on 9/7/17.
 */
public class LargestElement {
    public static void main(String[] args) {

        int[][] samples  = { { 1,1  ,1 },
                {1,1 , 1},
                { 1,2,1 }} ;
        System.out.println(largestElement(samples)[0]); //2
        System.out.println(largestElement(samples)[1]);//2 row
        System.out.println(largestElement(samples)[2]);//1 col

    }

    /**
     * used to get largest element and its indexes
     * @param values array
     * @return array of 3
     * first is largest element
     * second row index
     * third col index
     */
    public static int[]  largestElement(int [][] values ) {

        int[] max  = new int[ 3];
        int temp =  values[0][0]   ;

        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j <values[i].length ; j++) {
                if (temp  <= values[i][j])
                {
                    temp = values[i][j] ;
                    max[1] = i ;
                    max[2] = j ;

                }
            }
        }

        max[0] = temp ;
        return max ;


    }
}
