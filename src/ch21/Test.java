package ch21;

import java.io.File;
import java.util.*;

/**
 *
 *
 * {@link HashSet}    set of non duplicate -- not care of order
 * -{@link LinkedHashSet}  provide ordered insert
 * -{@link TreeSet} is sorted (some of method  head (return elements lower given ), tail(return elements higher given ))
 * , provide  methods of Nav ( lower/ floor (greatest num less / less or equal element p ) , ceil )
 *
 *
 * If you don’t need to maintain a sorted set when updating a set, you should use a hash
 * set, because it takes less time to insert and remove elements in a hash set(as in Tree it
 * must be sorted first ). When you  need a sorted set, you can create a tree set from the hash set.
 *
 * elements add but only store non duplicate element
 *
 *
 * Created by mo3tamed on 1/23/18.
 */
public class Test {

    public static void main(String[] args) {


        Set <Integer> hs = new HashSet<>(5 , 0.5f) ;
        hs.add(5); 
        hs.add(5); //no duplicates in set
        hs.add(11);
        hs.add(1121);
        System.out.println("hs = " + hs);
        Set <Integer> hs2 = new HashSet<>() ;
        hs2.add(2);
        hs2.add(4); //no duplicates in set
        hs2.add(45);
        hs2.add(1121);
        System.out.println("hs2 = " + hs2);
        hs.addAll(hs2);
        System.out.println("Uion in hs " + hs);

        LinkedHashSet <Integer> hss = new LinkedHashSet<>() ;
        hss.add(1);
        hss.add(1);
        hss.add(3);
        hss.add(14) ;
        System.out.println("ordered " + hss);

        hs.remove(3) ;
        System.out.println("hss = " + hss);

        HashSet <File> f = new HashSet<>() ;
        Set<String> set = new HashSet<>();
        // Add strings to the set
        set.add("London");
        set.add("Paris");
        set.add("New York");
        set.add("San Francisco");
        set.add("Beijing");
        set.add("New York");
        TreeSet<String> treeSet = new TreeSet<>(set);
        System.out.println("Sorted tree set: " + treeSet);
        // Use the methods in SortedSet interface
        System.out.println("first(): " + treeSet.first());
        System.out.println("last(): " + treeSet.last());
        System.out.println("headSet(\"New York\"): " +
                treeSet.headSet("New York"));
        System.out.println("tailSet(\"New York\"): " +
                treeSet.tailSet("New York"));
        // Use the methods in NavigableSet interface
        System.out.println("lower(\"P\"): " + treeSet.lower("P"));//max before P
        System.out.println("higher(\"P\"): " + treeSet.higher("P"));
        System.out.println("floor(\"P\"): " + treeSet.floor("P"));
        System.out.println("ceiling(\"P\"): " + treeSet.ceiling("P"));
        System.out.println("pollFirst(): " + treeSet.pollFirst());
        System.out.println("pollLast(): " + treeSet.pollLast());
        System.out.println("New tree set: " + treeSet);
        
        


    }
}
