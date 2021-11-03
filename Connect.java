import java.sql.*;
import java.util.Scanner;
public class Connect {
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


