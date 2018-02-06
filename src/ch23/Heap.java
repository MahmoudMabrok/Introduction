package ch23;

import java.util.ArrayList;

/**
 * this is
 * Created by mo3tamed on 2/5/18.
 */
public class Heap <T extends  Comparable<T> > {

    private ArrayList<T> list  ;

    public Heap(){
        list = new ArrayList<T>() ;
    }

    @Override
    public String toString(){
        return  list.toString() ;
    }

    public void add (T newElement ){
        list.add(newElement);

        int currentIndex = list.size()-1;
        int parentIndex ;

        while (currentIndex > 0 ){
            parentIndex = (currentIndex-1) /2 ;
            if (list.get(currentIndex).compareTo(list.get(parentIndex)) > 0 )
            {
                T temp = list.get(currentIndex) ;
                list.set(currentIndex,list.get(parentIndex));
                list.set(parentIndex , temp) ;
            }else
            break;

            currentIndex = parentIndex ;
        }
    }
    public T remove1() {

        if (list.size() > 0){
            T t = list.get(0);
            list.remove(0) ;
            ArrayList<T> temp =(ArrayList<T>) list.clone() ;
            list.clear();
            for (int i = 0; i <temp.size() ; i++) {
                add(temp.get(i));
            }

            return  t ;
    }else
        return  null;

    }

    public  T  remove(){

        if (list.size() == 0 )
            return null ;
        T root = list.get(0);

        list.set(0,list.get(list.size()-1));
        list.remove(list.size()-1) ;


        int currentIndex = 0 ;
        int right  , left , maxIndex ;
        while (currentIndex < list.size()){
            right = (2*currentIndex)+2 ;
            left = 2*currentIndex +1 ;

            if (left >= list.size()) break; // leaf or tree is heap

            maxIndex = left ;
            if (list.get(maxIndex).compareTo(list.get(right)) < 0)
                maxIndex=right;

            //swap with its greatest child
            if (list.get(currentIndex).compareTo(list.get(maxIndex)) < 0 )
            {
                T temp = list.get(currentIndex) ;
                list.set(currentIndex , list.get(maxIndex)) ;
                list.set(maxIndex , temp) ;
                currentIndex =maxIndex ;
            }
            else
                break; // it is heap
        }


        return  root ;
    }


}
