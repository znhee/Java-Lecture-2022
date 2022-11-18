package mysql.customer;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * DAO(Data Access Object)
 */
public class DAO {
	private String host;
	private String user;
	private String password;
	private String database;
	private String port;
	
	DAO () {
		try {
			InputStream is = new FileInputStream("/Users/zlnnnl/Workspace/mysql.properties");
			Properties props = new Properties();
			props.load(is);
			is.close();		
			
			host = props.getProperty("host");
			user = props.getProperty("user");
			password = props.getProperty("password");
			database = props.getProperty("database");
			port = props.getProperty("port", "3306");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public Connection myGetConnection() {
		Connection conn = null;
		try {
//			InputStream is = new FileInputStream("/Users/zlnnnl/Workspace/mysql.properties");
//			Properties props = new Properties();
//			props.load(is);
//			is.close();
//			
//			String host = props.getProperty("host");
//			String user = props.getProperty("user");
//			String password = props.getProperty("password");
//			String database = props.getProperty("database");
//			String port = props.getProperty("port", "3306");
			String connStr = "jdbc:mysql://" + host + ":" + port + "/" + database;
			conn = DriverManager.getConnection(connStr, user, password);
//			System.out.println(connStr);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public void deleteCustomer(String uid) {
		Connection conn = myGetConnection();
		String sql = "UPDATE customer SET isDeleted=1 WHERE uid=?;";
		try {
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setString(1, uid);
			
			// Delete 대신에 isDeleted 필드를 1로 변경
			pStmt.executeUpdate();
			pStmt.close();
			conn.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void updateCustomer(Customer c) {
		Connection conn = myGetConnection();
		String sql = "UPDATE customer SET name=?, regDate=?, isDeleted=? WHERE uid=?;";
		try {
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setString(1, c.getName());
			pStmt.setString(2, c.getRegDate().toString());
			pStmt.setInt(3, c.getIsDeleted());
			pStmt.setString(4, c.getUid());
		
			// Update 실행
			pStmt.executeUpdate();
			pStmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		
	}
	
	public Customer getCustomer(String uid) {
		Connection conn = myGetConnection();
		String sql = "SELECT * FROM customer WHERE uid=?;";
		Customer c = new Customer();
		try {
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setString(1, uid);
			
			// Select 실행
			ResultSet rs = pStmt.executeQuery();
			while (rs.next()) {
				c.setUid(rs.getString(1));
				c.setName(rs.getString(2));
				c.setRegDate(LocalDate.parse(rs.getString(3)));
				c.setIsDeleted(rs.getInt(4));
			}
			rs.close();
			pStmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return c;
	}
	
	public List<Customer> getCustomers() {
		Connection conn = myGetConnection();
		Statement stmt = null;
		List<Customer> list = new ArrayList<>();
		String sql = "SELECT * FROM customer WHERE isDeleted=0;";
		try {
			stmt = conn.createStatement();
			
			// Select 실행
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Customer c = new Customer();
				c.setUid(rs.getString(1));
				c.setName(rs.getString(2));
				c.setRegDate(LocalDate.parse(rs.getString(3)));
				c.setIsDeleted(rs.getInt(4));
				list.add(c);
			}
			rs.close();
			stmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	public void insertCustomer(Customer c) {
		Connection conn = myGetConnection();
		String sql = "INSERT INTO customer(uid, name) VALUES(?,?);";
		
		try {
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setString(1, c.getUid());
			pStmt.setString(2, c.getName());
			
			pStmt.executeUpdate();
			pStmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
