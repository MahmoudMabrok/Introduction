package ch34;

import java.sql.*;

/**
 * this is
 * Created by mo3tamed on 10/28/17.
 */
public class Testdb {

    public static void main(String[] args) {



        try {
            //load Driver
            Class.forName("com.mysql.jdbc.Driver");
            //establish a connection
            Connection con = DriverManager.getConnection( "jdbc:mysql://localhost/javabook" ,"scott", "t") ;
            System.out.println("connction created  ::: ");
            //create statement

               Statement st = con.createStatement() ;
            /*PreparedStatement ps = con.prepareStatement("insert into Student (ssn , mi) values ( ? , ?)") ;
            ps.setString( 1 , "0104");
            ps.setString( 2 , "f");
            ps.executeUpdate() ;
            System.out.println("prepared executed");*/

           // st.executeUpdate("insert into Student (ssn , mi) values ( '00' , 'm') ; ") ;
         //   st.executeUpdate("delete from Student where ssn = '01' ;  ") ;
            ResultSet rs = st.executeQuery("select * from Student  ; " ) ;
            while(rs.next())
            {

                System.out.print("ssn :: " + rs.getString("ssn") + "\t mi  ::" +rs.getString("mi"));
                System.out.println();
            }
            st.close();
            con.close();


          //  System.out.println("inserted ");*/
          //  System.out.println("deleted ");
            System.out.println("show after delete ");


        }catch (ClassNotFoundException e)
        {
            System.out.println(e);
        }catch (SQLException s)
        {
            System.out.println(s);
        }


        }
}
