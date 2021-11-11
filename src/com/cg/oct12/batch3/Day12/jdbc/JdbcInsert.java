package com.cg.oct12.batch3.Day12.jdbc;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
// download postgres jdbc jar and add to classpath 

// demo to connect to PostgreSQL database and fetch records 
public class JdbcInsert {
	public static void main(String[] args) {
		System.out.println("Start");

		String className = "org.postgresql.Driver";
		String url = "jdbc:postgresql://localhost:5432/cg12oct"; // check this
		String user = "postgres";
		String password = "root"; // check this
		String sql = "INSERT INTO emp (eid, ename, salary) VALUES (101, 'Sonu', 45780);";
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			Class.forName(className);
			con = DriverManager.getConnection(url, user, password);
			st = con.createStatement();
			rs = st.executeQuery(sql);
//			while (rs.next()) {
//				int columnIndex = 1;
//				for (int i = 1; i <= 3; i++) {
//					System.out.print(rs.getString(columnIndex) + "\t");
//					columnIndex++;
//				}
//				System.out.println("\n Inserted ");
//			}
			
			int res=st.executeUpdate(sql);
			if (res!=0)
			  {
				  System.out.println("Data Inserted");
			  }
			  else {
				System.out.println("Data Not Inserted");  
			  }
			  
			
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}
	}
}