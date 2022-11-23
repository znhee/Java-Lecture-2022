package project2;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class DAO {
	private String host;
	private String user;
	private String password;
	private String database;
	private String port;
	
	public static void main(String[] args) {
		DAO dao= new DAO();
		
		dao.createTable();
		
		dao.insertEmployee(new Employee(133, "강자바", "부장", LocalDate.of(2000, 8, 1)));
		dao.insertEmployee(new Employee(143, "은전기", "차장", LocalDate.of(2003, 1, 1)));
		dao.insertEmployee(new Employee(163, "노전자", "과장", LocalDate.of(2018, 8, 1)));
		dao.insertEmployee(new Employee(173, "권표준", "대리", LocalDate.of(2022, 1, 1)));
		dao.insertEmployee(new Employee(213, "홍정부", "사원", LocalDate.of(2019, 1, 1)));
		
		dao.printAllEmployee();
	}
	
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
			String connStr = "jdbc:mysql://" + host + ":" + port + "/" + database;
			conn = DriverManager.getConnection(connStr, user, password);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public void createTable() {
		Connection conn = myGetConnection();
		String sql = "CREATE TABLE IF NOT EXISTS employee(\n"
				+ "	id INT PRIMARY KEY, \n"
				+ "	name VARCHAR(4) NOT NULL,\n"
				+ "	position VARCHAR(4) NOT NULL,\n"
				+ "	joinDate DATETIME\n"
				+ "	);";
		
		try {
			Statement stmt = conn.createStatement();
			stmt.execute(sql); stmt.close(); conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void insertEmployee(Employee emp) {
		Connection conn = myGetConnection();
		String sql = "INSERT INTO employee VALUES (?, ?, ?, ?);";
		try {
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setInt(1, emp.getId());
			pStmt.setString(2, emp.getName());
			pStmt.setString(3, emp.getPosition());
			pStmt.setString(4, emp.getJoinDate().toString());
			
			pStmt.executeUpdate();
			pStmt.close(); conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public void printAllEmployee() {
		Connection conn = myGetConnection();
		List<Employee> list = new ArrayList<>();
		String sql = "SELECT id, name, position, DATE_FORMAT(joinDate, '%Y-%m-%d') AS joinDate FROM employee ORDER BY joinDate;";
		try {
			Statement stmt = conn.createStatement();
			
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				Employee emp = new Employee();
				emp.setId(rs.getInt(1));
				emp.setName(rs.getString(2));
				emp.setPosition(rs.getString(3));
				emp.setJoinDate(LocalDate.parse(rs.getString(4)));
				list.add(emp);
			}
			rs.close(); stmt.close(); conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		for(Employee emp:list)
			System.out.println(emp);
	}
}
