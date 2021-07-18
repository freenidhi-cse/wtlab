package jdbcpractice;

import java.sql.*;

public class Select {

	public static void main(String[] args) {
		try
		{
			
			String url="jdbc:oracle:thin:@localhost:1521:XE";
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("loaded");
			Connection connn=DriverManager.getConnection(url,"system","system");
			System.out.println("connected");
			String query="select * from RegistrationForm";
			Statement s=connn.createStatement();
			s.executeQuery(query);
			ResultSet res=s.getResultSet();
			while(res.next())
			{
				System.out.println(res.getString("address"));
			}
			s.close();
			connn.close();
			//callable statement
			//CallableStatement st= connn.prepareCall("{call simple()} ");
			//ResultSet res=st.getResultSet();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
