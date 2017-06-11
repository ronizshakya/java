import java.util.*;
import java.sql.*;
public class Inputid
{
	public static void main(String args[])
	{
		Scanner abc = new Scanner(System.in);
		System.out.println("enter id");
		String id = abc.nextLine();
		System.out.println("enter first name and last name");
		String fn = abc.nextLine();
		String ln = abc.nextLine();
		System.out.println("enter user name and pasword");
		String un = abc.nextLine();
		

	try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con;
			String path=("jdbc:mysql://localhost:3306/hcoe");
			Statement stmt;
			con = DriverManager.getConnection(path,"root","");
			stmt = con.createStatement();
			stmt.executeUpdate("insert into `app`(`id`,`first name`,`last name`,`user name`)values('"+fn+"','"+ln+"','"+un+"')");

		}
			catch(Exception e)
			{
				System.out.println("error"+e);
			}

	}

}
