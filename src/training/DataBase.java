package training;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBase {

	public static void main(String[] args) {
		
	    try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root12");
			Statement st=c.createStatement();
			st.executeUpdate("create database test");
			st.executeUpdate("create table test.gullycricket(id int,name varchar(30),score int)");
			st.executeUpdate("insert into test.gullycricket values(1, 'mahesh',0)");
			st.executeUpdate("insert into test.gullycricket values(2, 'hemanth',20)");
			int i=st.executeUpdate("update test.gullycricket set score=30");
			System.out.println(i);
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

	}
