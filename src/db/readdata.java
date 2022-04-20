package db;
import java.sql.*;
import java.util.*;
public class readdata {
	public static void main(String[] args) throws SQLException
	{
		Connection con=null;
		
	
		try
		{
	       Class.forName("com.mysql.cj.jdbc.Driver");
	       con = DriverManager.getConnection("jdbc:mysql://localhost:3306/zee","root","Pass@123");
	      /* Statement stmt=con.createStatement();
	       ResultSet rs=stmt.executeQuery("Select * from emp where des=?");
	       while(rs.next())
	       {
	    	   System.out.println(rs.getInt(1)+":"+rs.getString(2)+":"+rs.getInt(3));
	       }*/
	       
	       
	       
	       PreparedStatement pstmt=con.prepareStatement("SELECT * FROM emp WHERE desig=?");
	       
	       Scanner sc=new Scanner(System.in);
	       System.out.println("Enter name");
	   	   String des=sc.next();
	       pstmt.setString(1, des);
	       
	       ResultSet rs=pstmt.executeQuery();
	        
	       while(rs.next()){
	                  System.out.println(rs.getString(2));       
	       }
	       con.close();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			con.close();
		}
		
	}
}
