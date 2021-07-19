import java.util.*;

import java.sql.*;

import java.io.*;

public class nice {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        try
        {
           
            String url="jdbc:oracle:thin:@localhost:1521:XE";
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("loaded");
            Connection con=DriverManager.getConnection(url,"system","system");
            Statement st=con.createStatement();
            // int rs=st.executeUpdate("create table skuser(name varchar(20),gender varchar(5))");
            // PreparedStatement pps=con.prepareStatement("insert into skuser values(?,?)");
           
            // int i;
            // for(i=0;i<3;i++){

            //     String name=sc.nextLine();
            //     String gender=sc.nextLine();

            //     pps.setString(1, name);
            //     pps.setString(2, gender);
            //     pps.executeUpdate();
            // }

            // int rs=st.executeUpdate("insert into skuser values('c','male')");

            int rs=st.executeUpdate("update skuser set gender='f' where name='c' ");
            rs=st.executeUpdate("delete from skuser where name='sk'");

            ResultSet res=st.executeQuery("select * from skuser");

            while(res.next()){
                System.out.println(res.getString(1)+" "+res.getString(2));


            }

   
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

}
