package mysql.baseball;

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
			String connStr = "jdbc:mysql://" + host + ":" + port + "/" + database;
			conn = DriverManager.getConnection(connStr, user, password);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public Player getPlayer(int backNum) {
		Connection conn = myGetConnection();
		String sql = "SELECT * FROM baseballplayer WHERE backNum=?;";
		Player p = new Player();
		
		PreparedStatement pStmt;
		try {
			pStmt = conn.prepareStatement(sql);
			pStmt.setInt(1, backNum);
			
			// Select 실행
			ResultSet rs = pStmt.executeQuery();
			while (rs.next()) {
				p.setBackNum(rs.getInt(1));
				p.setName(rs.getString(2));
				p.setPosition(rs.getString(3));
				p.setBirthday(LocalDate.parse(rs.getString(4)));
				p.setHeight(rs.getInt(5));
				p.setIsDeleted(rs.getInt(6));
			}	
			rs.close();
			pStmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return p;
	}
	
	public List<Player> getPlayers() {
		Connection conn = myGetConnection();
		Statement stmt = null;
		List<Player> list = new ArrayList<>();
		String sql = "SELECT * FROM baseballplayer;";
		try {
			stmt = conn.createStatement();
			
			// Select 실행
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Player p = new Player();
				p.setBackNum(rs.getInt(1));
				p.setName(rs.getString(2));
				p.setPosition(rs.getString(3));
				p.setBirthday(LocalDate.parse(rs.getString(4)));
				p.setHeight(rs.getInt(5));
				p.setIsDeleted(rs.getInt(6));
				list.add(p);
			}
			rs.close();
			stmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	public void insertPlayer(Player p) {
		Connection conn = myGetConnection();
		String sql = "INSERT INTO baseballplayer VALUES (?,?,?,?,?,DEFAULT);";
		try {
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setInt(1, p.getBackNum());
			pStmt.setString(2, p.getName());
			pStmt.setString(3, p.getPosition());
			pStmt.setString(4, p.getBirthday().toString());
			pStmt.setInt(5, p.getHeight());
			
			pStmt.executeUpdate();
			pStmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void updatePlayer(Player p) {
		Connection conn = myGetConnection();
		
		String sql = "UPDATE baseballplayer SET name=?, position=?, birthday=?, height=?, isDeleted=? WHERE backNum=?;";
		PreparedStatement pStmt;
		try {
			pStmt = conn.prepareStatement(sql);
			pStmt.setString(1, p.getName());
			pStmt.setString(2, p.getPosition());
			pStmt.setString(3, p.getBirthday().toString());
			pStmt.setInt(4, p.getHeight());
			pStmt.setInt(5, p.getIsDeleted());
			pStmt.setInt(6, p.getBackNum());
			
			// Update 실행
			pStmt.executeUpdate();
			pStmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void deletePlayer(int backNum) {
		Connection conn = myGetConnection();
		String sql = "UPDATE baseballplayer SET isDeleted=1 WHERE backNum=?;";
		
		try {
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setInt(1, backNum);
			
			// Delete 대신에 isDeleted 필드를 1로 변경
			pStmt.executeUpdate();
			pStmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void createTable() {
		Connection conn = myGetConnection();
		String sql = "" + 
				"CREATE TABLE if NOT EXISTS baseballplayer (\n"
				+ "	backNum INT PRIMARY KEY,\n"
				+ "	name VARCHAR(8) NOT NULL,\n"
				+ "	position VARCHAR(4) NOT NULL,\n"
				+ "	birthday DATE,\n"
				+ "	height INT,\n"
				+ "	isDeleted INT DEFAULT 0\n"
				+ ");";
		try {
			Statement stmt = conn.createStatement();

			stmt.execute(sql);
			stmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
