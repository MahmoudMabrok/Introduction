package ch7;

/**
 * this is excercise of Book "INtroducion of Java "
 * Created by mo3tamed on 9/7/17.
 */
public class countOccurance {
    public static void main(String[] args) {

        int[] rand = ArrayOPeration.getRandomArr(50 , 0 , 9 ) ;
        int[] counts = countOccurance( rand, 10  ) ;


        for (int i = 0; i < counts.length; i++) {
            System.out.println("count of " + i+ "  is " + counts[i] );
        }

    }

    /**
     *
     * @param val array to get count n of number of it
     * @param size  range of numbers to get count of it
     * @return
     */
    public static  int[] countOccurance (int [] val , int size  ) {

        int[] counts = new  int[ size] ;


        for (int i = 0; i < val.length; i++) {
            counts[val[i] - 0 ] ++ ;
        }

        return counts ;
    }


}
