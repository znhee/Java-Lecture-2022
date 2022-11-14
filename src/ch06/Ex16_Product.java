package ch06;
/**
 * 몸풀기 문제 
 */

public class Ex16_Product {
	private int id;
	private String name;
	private int price;
	private String category;
	
	public Ex16_Product() {}
	public Ex16_Product(int id, String name, int price, String category) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Ex16_Product [id=" + id + ", name=" + name + ", price=" + price + ", category=" + category + "]";
	}
	
	
}
