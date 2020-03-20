package org.loja.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ConfigDataSource {

	private static Connection connection;
    
	public static Connection getConnection() {
		try {
			

			Properties ps = new Properties();
			ps.setProperty("user", "jvlwleyuqqgktj");
			ps.setProperty("password", "1e4723def9d1f512166b22f966a053f81aed30f330b8eb6ab62e54d1e02d2298");
			ps.setProperty("ssl", "true");
			ps.setProperty("sslmode", "verify-ca");
			ps.setProperty("sslfactory", "org.postgresql.ssl.NonValidatingFactory");
		//	Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			Class.forName("org.postgresql.Driver").newInstance();
			connection = DriverManager
					   //.getConnection("jdbc:mysql://localhost:3306/fabrica", "logcod", "1@cuca82");
					   .getConnection("jdbc:postgresql://"
					   		+ "ec2-54-157-78-113.compute-1"
					   		+ ".amazonaws.com:5432/ddo08ra18ll683", ps);
		    
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}

}
