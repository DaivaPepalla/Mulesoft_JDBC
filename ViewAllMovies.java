import java.sql.*;

public class ViewAllMovies {
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
				PreparedStatement pstmt=con.prepareStatement("select * from Movie");
				ResultSet rs=pstmt.executeQuery();
				System.out.println("-------------------------Movies----------------------");
				while(rs.next())
				{
					System.out.println("\n");
					System.out.println("Movie id: "+rs.getInt(1));
					System.out.println("Movie Name: "+rs.getString(2));
					System.out.println("Movie Actor: "+rs.getString(3));
					System.out.println("Movie Actress: "+rs.getString(4));
					System.out.println("Movie Director: "+rs.getString(5));
					System.out.println("Release Year: "+rs.getInt(6));
					System.out.println("\n");
					System.out.println("***************************************");
				}
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
