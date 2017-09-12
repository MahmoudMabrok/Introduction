package ch7;

import java.util.Arrays;

/**
 * 7.15
 * this is excercise of Book "INtroducion of Java "
 *task is to remove duplicate
 * sol ::
 * first get num of duplicate to get new arr size
 * by first sort it (copy to save original )
 * then check if there is two number equal then increase  n
 *
 * second make the new arr
 * create new arr by new size
 *check if element exist continue else add it
 *
 *note :: new arr has new arrangement
 *
 * Created by mo3tamed on 9/7/17.
 */
public class RemoveDuplicate {
    public static void main(String[] args) {

        int[] test = {  1,2,3  , 2 , 2 , 3 , 1 } ;
      test =   removeDuplicate(test);
        ArrayOPeration.display(test);

    }

    public static int[]  removeDuplicate(int[] x ) {

        int n = getNumOfDuplicate(x ) ;

        int[] newList = new int[x.length - n] ;

       boolean status_exist  ; //state if there is a duplicate

        int index = 0 ; // index of element in new arr

        for (int i = 0; i < x.length  ; i++) {

             status_exist = false ;
            for (int j = i+1 ; j < x.length  ; j++) {
                if (x[i] == x[j])
               status_exist = true  ;
            }

            //if status_exist still false this mean no duplicate
            if (status_exist == false) {
                newList[index] = x[i];
                index++;
            }

        }

     return  newList ;

    }


    public static int getNumOfDuplicate (int[] val  )
    {
        int n = 0 ;

        int [] x = new int[val.length] ;
        System.arraycopy(val , 0 , x , 0 , val.length);
        Arrays.sort(x  );
        for (int i = 0; i < x.length -1; i++) {

            if (x[i] == x[i+1])
                n++;
            else
                continue;
        }
        return n ;


    }


}
