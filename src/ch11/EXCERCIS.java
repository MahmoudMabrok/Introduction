package ch11;

/**
 * this is
 * Created by mo3tamed on 9/29/17.
 * Object o = new int [5] ;
 * you can not use int to be actual type for declared type of Object
 * can not cast int[] to Object []
 *
 *
 */
public class EXCERCIS {

    public static void main(String[] args) {

     /* int[] x =  { 10 , 12 , 15 } ;
      Object[] o =  new Integer [50] ;
      System.out.println(o.toString());
     // print (x); can not cast int[] to Object []
      print(o);*/

     /*   new Person().printPerson(); // Person
        new Student().printPerson(); // Person
*/


    /* Student s = new Student() ;
     s.setX();
     s.printPerson();
*/

   /* new A1 (); // i 40
    new B ();// i a 60
        // i b 60

        */

   /*Object o = new EXCERCIS() ;
   EXCERCIS c = (EXCERCIS) o ; //two point to same object

*/




    }


    private static void print(Object[] in) {
        for (Object o : in)
            System.out.println(o);
    }

}

    class Student extends Person {

        private String getInfo() {
            return "Student";
        }
        public  void setX()
        {
            x  = 100 ;
        }
        public void printX ()
        {

            System.out.println(x );
        }
    }
    class Person {
        int x =10 ;
        private String getInfo() {
           
            return "Person";
        }
        public void printPerson() {
            System.out.println(getInfo());
            System.out.println(x);
        }
    }

class A1 {
    int i = 7;
    public A1() {
        setI(20);
        System.out.println("i from A is " + i);
    }
    public void setI(int i) {
        this.i = 2 * i;
    }
}
class B extends A1 {
    public B() {
        System.out.println("i from B is " + i);
    }
    public void setI(int i) {
        this.i = 3 * i;
    }
}


