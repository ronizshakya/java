//enter the username,pw,lastnem in the database table
import java.util.*;
import java.sql.*;

class InsertQuery{
	public static void main(String args[]){
	Scanner abc = new Scanner(System.in);
		System.out.println("enter id:");
	String id = abc.nextLine();
		System.out.println("enter first name");
	String fn = abc.nextLine();
		System.out.println("enter last name");
	String ln = abc.nextLine();
		System.out.println("enter user name and password");
	String un = abc.nextLine();
	String pw = abc.nextLine();
	
	try{
		
		Class.forName("com.mysql.jdbc.Driver");
			String path = ("jdbc:mysql://localhost:3306/hcoe");
			Connection con;
			Statement stmt;
			con = DriverManager.getConnection(path,"root","");
			stmt = con.createStatement();
			stmt.executeUpdate("insert into `app`(`id`,`first name`,`last name`,`user name`,`Password`) values ('"+id+"','"+fn+"','"+ln+"','"+un+"','"+pw+"')");
			
		}
		catch(Exception e){
			System.out.println("error"+e);
		}
	}
}
