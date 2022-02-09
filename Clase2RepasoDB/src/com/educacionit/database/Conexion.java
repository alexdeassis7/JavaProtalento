package com.educacionit.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {
	
	static String db = "protalento";
	static String user = "root";
	static String password = "";
	static String url = "jdbc:mysql://localhost/" + db;
	
	Connection conn = null;

	public Conexion() {
		
	}
	
	public Connection getConnection() {
		//obtenemos el driver para mysql
		// obtenemos la conexion
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);
			if (conn != null) {
				System.out.println("Se conecto a la base de dato " + db);
			}
			
		} catch (SQLException | ClassNotFoundException e) {
			System.out.println("SQLException");
			e.printStackTrace();
		}
		
		return conn;
	}
	
}
