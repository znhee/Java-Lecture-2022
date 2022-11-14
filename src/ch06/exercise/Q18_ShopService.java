package ch06.exercise;

public class Q18_ShopService {
	private static Q18_ShopService singleton = new Q18_ShopService();
	
	private void ShopService() {}
	
	public static Q18_ShopService getInstance() {
		return singleton;
	}
}
