package ch11;

/**
 * this is
 * Created by mo3tamed on 9/27/17.
 *
 * static methods  is inherited --- invoked by name of (derived class)
 * if redefined -> the other is hidden , can accessed by superclassName.staticMethod
 * static not overriden because it belong to class not to object (no meaning to override static method )
 *
 * private not accessed outside the class so not be inherited  or not Overriden
 *
 * A test = new TestInheritance() -->  test has all A methods but implemented by TEST
 * so  it has not access to method in TEST that are not in A
 *
 *
 */
public class TestInheritance  extends A {


    public static void main(String[] args) {


        A test = new TestInheritance() ;
       /* A.display();
        TestInheritance.display();
        test.show();
        */









    }

    private void show()
    {
        System.out.println("Show of Test");
    }


    static void display()
    {

        System.out.println("static from TEST ");
    }

    public void testPoly()
    {
        System.out.println("from  test ");
    }
    public void testPoly2()
    {
        System.out.println("from  test ");
    }
}
class A {


    private  void show ()
    {
        System.out.println("I am from a and iam private ");
    }
    static  void display()
    {

        System.out.println("static from a ");
    }

    public void testPoly()
    {
        System.out.println("from  a ");
    }

}

