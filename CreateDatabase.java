import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class CreateDatabase {
	public static void main(String[] args){
		try
		{
			Connection con=null;
			Class.forName("org.sqlite.JDBC");
			Scanner sc=new Scanner(System.in);
			String s=sc.next();
			String url = "jdbc:sqlite:"+s+".db";
			con=DriverManager.getConnection(url);
		    if(con!=null)
		    {
			    System.out.println("Connected to SQLite3");
		    }
		    else
		    {
			    System.out.println("Connection to SQLite has been failed");

		    }
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

}
}
