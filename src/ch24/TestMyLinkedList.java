package ch24;

/**
 * this is
 * Created by mo3tamed on 2/17/18.
 */
public class TestMyLinkedList {

    public static void main(String[] args) {

        MyLinkedList <String> list = new MyLinkedList<>() ;
        System.out.println("111 " + list.getFirst());
        list.addLast("Ahemd0");
        list.addFirst("Ahmed");
        list.addFirst("Ahmed2");
        list.addFirst("Ahmed3");
        list.addLast("Ahemd0");
        list.display();
        System.out.println("22222" + list.getLast());
        System.out.println(list.removeFirst());
        System.out.println(list.removeFirst());
        System.out.println(list.removeFirst() + "last ");
        list.display();
        list.removeLast();
        list.display();


    }
}
