package com.educationit.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {

	static String db = "protalento";
	static String login = "root";
	static String password = "";
	static String url = "jdbc:mysql://localhost/" + db;
	

	Connection conn = null;

	public Conexion() {
		try {
			// obtenemos el driver para mysql
			Class.forName("com.mysql.jdbc.Driver");
			//new com.mysql.jdbc.Driver();


			// obtenemos la conexion
			conn = DriverManager.getConnection(url, login, password);
			if (conn != null) {
				System.out.println("Se conecto a la base de dato " + db);
			}
		} catch (SQLException e) {
			System.out.println("SQLException");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Exception");
			e.printStackTrace();
		}

	}


	public Connection getConnection() {
		return conn;
	}

}
