
import java.util.*;
import java.sql.*;
public class Dbcon123 {
public static void main(String []args) throws SQLException ,ClassNotFoundException{
	Scanner s=new Scanner(System.in);
	System.out.println("enter the id");
	String id=s.nextLine();
	System.out.println("enter the name to be update");
	String name=s.nextLine();
	Class.forName("oracle.jdbc.driver.Oracle.Driver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manikanth");
 
	PreparedStatement ps=con.prepareStatement("update emp set name=? where empid=?");
	ps.setString(1,name);
	ps.setString(2,id);
	int k=ps.executeUpdate();
	System.out.println(k+"row update");
	con.close();
}



	
	
	
	
}

