import java.sql.*;
import java.util.Scanner;
public class Insert {
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
				PreparedStatement pstmt=con.prepareStatement("insert into Movie(name,actor,actress,director,year) values('Rakshasudu','Srinivas','Anupama','Ramesh',2019)");
				PreparedStatement pstmt1=con.prepareStatement("insert into Movie(name,actor,actress,director,year) values('Gentleman','Nani','Nivedha','Mohan',2016)");
				PreparedStatement pstmt2=con.prepareStatement("insert into Movie(name,actor,actress,director,year) values('Krishnarjuna yudham','Nani','Anupama','Gandhi',2018)");
				PreparedStatement pstmt3=con.prepareStatement("insert into Movie(name,actor,actress,director,year) values('Jai lava kusa','NTR','Nivedha','Ravindra',2017)");
				pstmt.execute();	
				pstmt1.execute();	
				pstmt2.execute();	
				pstmt3.execute();	
				System.out.println("Data inserted");
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