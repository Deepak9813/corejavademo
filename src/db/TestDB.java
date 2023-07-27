package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDB {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		
		//register driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//getConnection(url,un,psw)
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "");

		
	//=======================insert sql ====================================
	
		String sql = "insert into user(username, password) values('deepak','123') ";
		
		Statement stm = con.createStatement();
		stm.execute(sql);
		System.out.println("success");
		
		con.close();
		
	}

}
