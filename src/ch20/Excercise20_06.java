package ch20;

import java.util.Date;
import java.util.LinkedList;

/**
 * this is
 * Created by mo3tamed on 1/21/18.
 * (Use iterators on linked lists) Write a test program that stores 5 million integers
 *in a linked list and test the time to traverse the list using an iterator vs. using
 *the get(index) method.
 *
 *
 */
public class Excercise20_06 {

    public static void main(String[] args) {

        Date d  =new Date() ;
        LinkedList<Integer> list = new LinkedList<>() ;
        for (int i = 0; i <1_000_000 ; i++) {
            list.add(i) ;
        }
        for (int i = 0; i <1_000_000 ; i++) {
            System.out.println(list.get(i) );


        for (Integer e :list
             ) {
            System.out.println(e);
        }

        System.out.println(new Date().getTime() - d.getTime());
    }
}

}

