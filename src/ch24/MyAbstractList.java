package ch24;

/**
 * this is
 * Created by mo3tamed on 2/13/18.
 */
public abstract class MyAbstractList<E>  implements   MyList<E>{

    protected  int size = 0 ; // to used it its subclasses only !!

    protected MyAbstractList() {
    }
    protected  MyAbstractList(E[] objects){

        for (int i = 0; i <objects.length ; i++) {
            add(objects[i]);
        }
    }

    public void add(E e ){
        add(size , e);
    }

    @Override
    public boolean isEmpty() {
        return size==0 ;
    }
    @Override
    public int getSize(){
        return  size ;
    }

    /**
     * remove an element from list
     * @param e element to be removed
     * @return true if element exist and removed
     *false if element not removed
     */
    @Override
    public boolean remove(E e) {
       if (indexOf(e) >= 0)
       {
           remove(indexOf(e));
           return true ;
       }
       else
           return  false ;
    }
}
