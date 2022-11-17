package mysql;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import com.mysql.cj.jdbc.Driver;

public class Ex03_Properties {

	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("/Users/zlnnnl/Workspace/mysql.properties");
			Properties props = new Properties();
			props.load(is);
			is.close();
			
			String host = props.getProperty("host");
			String user = props.getProperty("user");
			String password = props.getProperty("password");
			String database = props.getProperty("database");
			String port = props.getProperty("port", "3306");
			String connStr = "jdbc:mysql://" + host + ":" + port + "/" + database;
//			conn = DriverManager.getConnection(connStr, user, password);
			System.out.println(connStr);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
