package jdbcpractice;

import java.sql.*;

public class Metadata {
	public static void main(String[] args) {
		try
		{
			String url="jdbc:oracle:thin:@localhost:1521:XE";
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver loaded");
			Connection conn=DriverManager.getConnection(url,"system","system");
			System.out.println("Connection established");
			
			DatabaseMetaData dbmd= conn.getMetaData();
			System.out.println("Data base name:"+dbmd.getDatabaseProductName());

			System.out.println("Data base version:"+dbmd.getDatabaseProductVersion());

			System.out.println("Data base driver name:"+dbmd.getDriverName());

			System.out.println("Data base driver version"+dbmd.getDriverVersion());

			System.out.println("Data base url:"+dbmd.getURL());

			System.out.println("Data base current user:"+dbmd.getUserName());
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

}
}
