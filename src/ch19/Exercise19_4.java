package ch19;

/**
 * this is
 * Created by mo3tamed on 1/19/18.
 */

public class Exercise19_4 {


    public static <E extends Comparable<E>> int search (E[] list  , E value  ){
        for (int i = 0; i < list.length ; i++) {
            if (list[i].compareTo(value) == 0 )
                return  i ;
        }
        return  -1 ;
    }
    public static void main(String[] args) {
        System.out.println(search(new Integer []{ 10 , 12 , 4 , 78 } , 78 ));

    }
}
