package ch23;

/**
 * this is
 * Created by mo3tamed on 2/5/18.
 */
public class TestHeap {

    public static void main(String[] args) {
        Heap<Integer> h = new Heap<>() ;
        h.add(5);
        h.add(1);
        h.add(12);
        h.add(9);
        h.add(50);


        System.out.println(h);
        System.out.println(h.remove());
        System.out.println(h);

        System.out.println(h.remove());
        System.out.println(h);
        System.out.println("10".charAt(0));
    }
}
