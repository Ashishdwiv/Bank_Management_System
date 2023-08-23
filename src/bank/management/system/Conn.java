//register the driver
//create connention
//create statement
//run query
//end connection
package bank.management.system;
import java.sql.*;

public class Conn {
    Connection c;
    Statement s;
    public Conn()
    {
        try{
//            Class.forName(com.mysql.cj.jdbc.Driver);
            c=DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root", "Ashish#21");
             s=c.createStatement();  
        }  
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
