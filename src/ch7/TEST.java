package ch7;

/**
 * this is
 * Created by mo3tamed on 9/6/17.
 */
public class TEST {

    public static void main(String[] args) {


        /*int[] m ;
         m= { 10 , 5 } ;  array intializer not allowed here b
         because u don not set size of array
          */

       /* int[] test = {  1,2,3 } ;
        for (int i = 1; i < m.length; i++) {
            m[i] = m[i-1] ;
        }

        for (int e : m ) {   // show content
             System.out.println(e); // output is all element is 1
        }*/

       /* int[] myList;
        myList = new int[10];
        // Sometime later you want to assign a new array to myList
        myList = new int[20]; // create a new one 
        */


        int[] m = {  1,2,3  , 8 , 7 , 6 } ;
        ArrayOPeration.selectionSort(m);
        ArrayOPeration.display(m);


    }
}