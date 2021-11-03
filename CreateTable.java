import java.sql.*;
import java.util.Scanner;
public class CreateTable {
public static void main(String[] args){
	try
	{
		Connection con=null;
		Class.forName("org.sqlite.JDBC");
		String url = "jdbc:sqlite:movies.db";
		con=DriverManager.getConnection(url);
	    if(con!=null)
	    {
		    System.out.println("Connected to SQLite3");
	    	Statement stmt =con.createStatement();
	    	String query="create table Movie (mid INTEGER PRIMARY KEY AUTOINCREMENT,name text,actor text,actress text,director text,year int)";
			stmt.executeUpdate(query);
			System.out.println("Table created");
			
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


