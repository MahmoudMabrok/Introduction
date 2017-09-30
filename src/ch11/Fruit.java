package ch11;

/**
 * this is
 * Created by mo3tamed on 9/30/17.
 */
public class Fruit {

    public static void main(String[] args) {


        Fruit f =new Golden() ;
        System.out.println(f instanceof  Mac);
        System.out.println(f instanceof  Golden);
        System.out.println(f instanceof  Apple);

        // Mac m =  new Apple() ; illegal

        Object o = new Fruit();
        Object o2 =(Apple) o ;

    }
}

class Apple extends  Fruit {

}
class Golden extends Apple {}

class Mac extends Apple {}