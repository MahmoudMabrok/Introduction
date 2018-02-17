package ch24;

import java.util.Iterator;

/**
 * this is
 * Created by mo3tamed on 2/13/18.
 */
public class MyLinkedList<E> extends  MyAbstractList<E> {

private  Node<E> head ;
private  Node<E> tail ;

    public void addFirst(E e ){

        Node<E> node = new Node<E>(e) ;
        node.next=head ;
        head = node ;

        if (tail == null )
            tail = head ;

        size++;
    }

    public void addLast(E e ){
        Node<E> node = new Node<E>(e) ;
        if (tail == null )
        {
            head = tail= node ;
        }else{
            tail.next = node ;
            tail = node ;
        }
        size++;

    }

    public E getFirst (){
        if (head == null ){
            return  null ;
        }
        else{
            return  head.element ;
        }
    }
    public E getLast(){
        if (tail == null ){
            return  null ;
        }
        else{
            return  tail.element ;
        }
    }

    public E removeFirst(){

        Node <E> temp = head ;
        if (size==0 )
            return  null ;
        else {
            head=head.next;
            size--;
        }
        if (head == null ) tail=null; //became empty

        return  temp.element ;
    }
    public E removeLast(){
        E temp = null ;
        if (size == 0 ){
            return  null ;
        }
        else if (size == 1 )
        {
            temp = head.element ;
            head = null ;
            tail = head ;
            size = 0  ;
        }
        else
        {
            Node current = head ;
            for (int i = 0; i < size - 2  ; i++) {
                current =current.next ;
            }
            temp =tail.element ;
            tail=current ;
            current.next=null; // release space
            size--;
        }
        return  temp ;
    }



    public void display(){
        System.out.print("List Elements [ ");
        Node <E> current = head ;
        while (current != null){
            System.out.print(current.element.toString()+" , ");
            current = current.next ;
        }
        System.out.println("]");
    }

    @Override
    public void add(int index, E e) {

        if (index == 0) addFirst(e);
        else if (index >= size ) addLast(e);  // greater than contains case it empty
                                                // and aim to add at index more size
        else{ //middle
            Node<E> node = new Node<E>(e) ;
            Node<E> current = head ;
            for (int i = 0; i <index-1 ; i++) {
                current = current.next ;
            }
            node.next = current.next ;
            current.next = node ;
            size++ ;
        }
    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public E set(int index, E e) {
        return null;
    }

    @Override
    public int indexOf(E e) {
        return 0;
    }

    @Override
    public int lastIndexOf(E e) {
        return 0;
    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public void clear() {

    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }
}

class Node <E> {

    E element ;
    Node<E> next ;

    public Node (E element){
        this.element=element ;
    }
}
