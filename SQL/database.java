package SQL;

import java.sql.*;


public class database
{
public static void main(String args[]) throws Exception
{

Class.forName("org.sqlite.JDBC");//use driver

Connection con=DriverManager.getConnection("jdbc:sqlite:C://SQLite//univ.db");//establish connection

Statement stm=con.createStatement();//create statement

ResultSet rs=stm.executeQuery("select * from dept"); //executing query

int dno;
String dname;

while(rs.next())
{

dno=rs.getInt("deptno");
dname=rs.getString("dname");

System.out.println(dno+"|"+dname);
}
}
}