//to update user name and password from the databasee..yesko lagi chai pailai dekhi data base ma name and pw hunu parxa..
import java.util.*;
import java.sql.*;
public class UpdateUser
{
	public static void main(String args[])
	{
		Scanner abc = new Scanner(System.in);
		System.out.println("enter user name");
		String un = abc.nextLine();
		System.out.println("enter old password");
		String pw = abc.nextLine();
		System.out.println("enter new password");
		String npw = abc.nextLine();
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con;
			String path=("jdbc:mysql://localhost:3306/hcoe");
			Statement stmt;
			con=DriverManager.getConnection(path,"root","");
			stmt=con.createStatement();
			stmt.executeUpdate("Update `login` set `Password`='"+npw+"' where Username='"+un+"'");//upadate password database ma bhakoo

			}
		catch(Exception e)
		{
			System.out.println("error:"+e);
		}
	}

	
}