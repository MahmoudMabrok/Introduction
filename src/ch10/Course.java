package ch10;

/**
 * this is
 * Created by mo3tamed on 9/20/17.
 */
public class Course {

    private  String courseName ;
    private  int capacity = 2 ;
   private String[] students  = new String[capacity];
    public static  int n_students ;


    public static void main(String[] args) {

Course c = new Course("CS50") ;
c.addStudent("Ahmed");
c.addStudent("Mohamed");
c.addStudent("Fekry");
c.addStudent("Fekry");
c.addStudent("Fekry");
 c.display(n_students);
 c.dropStudent("Fekry");
 c.clear();
 c.addStudent("sasas");
 c.display(n_students);

    }

    public Course (String name )
    {
        courseName = name ;
    }

    public void addStudent (String  name )
    {
        if (n_students == students.length)
        {
            String[] temp = new String[students.length * 2 ] ;
            System.arraycopy(students ,0,temp,0,n_students);
            students = temp ;
        }
        students[n_students++] = name ;
    }
    public void dropStudent(String  name)
    {
        int index = -1 ;
        for (int i = 0; i < n_students; i++) {
            if (students[i].equals(name))
                index = i  ;
        }
        if (index == -1 ) {
            System.out.println("No student ");
        return ;
        }
        String[] temp = new String[students.length] ;
        int j = 0 ;
        for (int i = 0; i < n_students; i++) {
            if (i == index) //dropped student
                continue;
            temp[j] = students[i] ;
            j++ ;
        }
        n_students-- ;
        students = temp ;
    }
    public  void display ( int n )
    {
        for (int i = 0; i <n ; i++) {
            System.out.println(students[i]);
        }
    }
    public  void clear()
    {
        students = new String[capacity] ;
        n_students=0;
    }

}
