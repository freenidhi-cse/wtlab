package jdbcpractice;
import java.sql.*;
import java.io.*;

public class Experiment {
	public static void main(String [] args)
	{
		try
		{
			
			String url="jdbc:oracle:thin:@localhost:1521:XE";
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("loaded");
			Connection con=DriverManager.getConnection(url,"system","system");
			System.out.println("connected");
			String query="insert into RegistrationForm values(?,?,?,?)";
			PreparedStatement pstmt=con.prepareStatement(query);
			pstmt.setString(1,"varun");
			pstmt.setString(2,"varun");
			pstmt.setInt(3,91002);
			pstmt.setString(4,"Hyd");
			pstmt.executeUpdate();
			System.out.println("inserted");
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
