package ch20;

import java.util.*;

/**
 * this is
 * Created by mo3tamed on 1/19/18.
 *
 *
 * ArrayLIst.clone  get a copy object of list
 * addAll    represent  set union --> add two collection together
 * removeAll represent  difference -- remove the common element  from first one
 * retainAll  represent  intersection
 *
 * asList --> return ArrayList in form of List
 *
 * Random - generate every one a unique random seed
 * */


public class Test {

    public static void main(String[] args) {

        ArrayList<String > list1 = new ArrayList<>(5) ; 
        list1.add("Ahmed") ; 
        list1.add("Mohamed") ; 
        list1.add("Salem") ;
        System.out.println("list1 = " + list1);
        ArrayList<String > list2 = new ArrayList<>(5) ;
        list2.add("Ahmed") ;
        list2.add("SS") ;             

        System.out.println("list2 = " + list2);
        list2.retainAll(list1) ;
        System.out.println(list2);

        list2 =(ArrayList<String>) list1.clone() ;
        System.out.println("B list2 = " +list2);
        list2.add("asasa") ;
        System.out.println("list2 = " + list2);
        System.out.println("list1 = " + list1);
        System.out.println(list2 instanceof  ArrayList );


        Collection <String> co = new Vector<>() ;
        co.add("String") ;
        co.add("String2") ;
        System.out.println(co instanceof  ArrayList);               //f
        System.out.println(co instanceof  Vector);
        System.out.println(co instanceof AbstractCollection);    //t


        Iterator<String> it = co.iterator() ;

       System.out.println(it.next());
       System.out.println(it.next());
        it.remove();
        System.out.println(it.hasNext());
        System.out.println("co = " + co);

        System.out.println("list1 = " + list1);
        ListIterator<String> li = list1.listIterator() ;
     //   li.add("sddd") ;
        System.out.println(list1);
        System.out.println( li.next());
        System.out.println( li.next());
        System.out.println( li.previous());


        LinkedList<Object> lk = new LinkedList<>(list1) ;
        System.out.println("traverse backward ");
        ListIterator<Object> lit = lk.listIterator(lk.size()) ; // start from end
        while (lit.hasPrevious())
            System.out.println(lit.previous());

        lit.set(10);  //replace last previous element
        System.out.println(lk);
        System.out.println(lk.remove(list1));
        System.out.println(lk);

        ArrayList <Integer> ar = new ArrayList<>(Arrays.asList( 4,8,3,4)) ;
        ArrayList <Integer> ar2 = new ArrayList<>(Arrays.asList( 1,2,3,4)) ;

        System.out.println("+++ar2 = " + ar2);
      //  Collections.copy(ar2,ar);
        ar.set(0,5);
        System.out.println("+++ar2 = " + ar2);
        System.out.println("+++ar = " + ar);


        Collections.shuffle( ar,new Random() );
        Collections.shuffle( ar2,new Random() );

        System.out.println("ar = " + ar);
        System.out.println("ar2 = " + ar2);

        System.out.println(Collections.binarySearch(ar ,2,Collections.reverseOrder() ) ) ;
        Collections.sort(ar ,Collections.reverseOrder() ) ;
        System.out.println(ar);




    }
}
