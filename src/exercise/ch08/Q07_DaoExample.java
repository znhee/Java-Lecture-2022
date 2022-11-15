package exercise.ch08;

public class Q07_DaoExample {
	public static void dbWork(Q07_DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	public static void main(String[] args) {
		dbWork(new Q07_OracleDao());
		dbWork(new Q07_MySqlDao());
	}

}
