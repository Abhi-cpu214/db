package db;
import java.util.*;
import java.sql.*;
public class sq {
	public static void main(String[] args)
	{
		try
		{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/zee","root","Pass@123");
	//Statement stmt = con.createStatement();
	//stmt.execute("insert into emp values(002,'ashok',9,300000,'Dev')");
	// to take input from user and insert into database
	//PreparedStatement pstmt=con.prepareStatement("insert into emp values(?,?,?,?,?)");
	/*PreparedStatement pstmt=con.prepareStatement("delete from emp(?,?,?,?,?");
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter id");
	int id=sc.nextInt();
	System.out.println("Enter name");
	String name=sc.next();
	System.out.println("Enter age");
	int age=sc.nextInt();
	System.out.println("Enter salary");
	int salary=sc.nextInt();
	System.out.println("Enter designation");
	String des=sc.next();
	pstmt.setInt(1, id);
	pstmt.setString(2, name);
	pstmt.setInt(3, age);
	pstmt.setInt(4, salary);
	pstmt.setString(5, des);*/
	
	/*PreparedStatement pstmt=con.prepareStatement("delete from emp where id = ?");
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the user id to delete");
	int id=s.nextInt();
	pstmt.setInt(1,id);*/
	PreparedStatement pstmt=con.prepareStatement("update emp set name=? where id = ?");
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the id");
	int id=s.nextInt();
	System.out.println("Enter the name");
	String name=s.next();
	pstmt.setString(1,name);
	pstmt.setInt(2, id);
	pstmt.executeUpdate();
	System.out.println("new data inserted");
	con.close();
}
	catch(Exception e)
	{
	System.out.println(e);
	}
	}
	}