package ch24;

/**
 * this is
 * Created by mo3tamed on 2/13/18.
 */
public interface MyList<E> extends  Iterable<E> {

    void add(E e);
    void add( int index,E e);
    E get(int index ) ;
    E set(int index , E e) ;
    int indexOf(E e) ;
    int lastIndexOf(E e) ;
     E remove(int index) ;
     boolean remove(E e) ;
     boolean isEmpty() ;

    /**
     *
     * @return size of list
     */
     int getSize ();
     void clear();
}
