package database;
import java.sql.*;
public class Dbcon1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
   Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","");
   Statement st=con.createStatement();
   String s= "create database school1";
   st.execute(s);
	}

}
