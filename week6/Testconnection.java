package jdbcpractice;
import java.sql.*;
public class Testconnection {

	public static void main(String[] args) {
		try
		{
			String url="jdbc:oracle:thin:@localhost:1521:XE";
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver loaded");
			Connection conn=DriverManager.getConnection(url,"system","system");
			System.out.println("Connection established");
			
			String query="create table RegistrationForm(Name varchar2(20), password varchar2(20), phonenumber int, address varchar2(100))";
			Statement st=conn.createStatement();
			st.executeUpdate(query);
			System.out.println("Table created");
			
			conn.close();
			
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
