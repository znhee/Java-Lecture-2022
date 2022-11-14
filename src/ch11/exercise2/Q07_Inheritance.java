package ch11.exercise2;

public class Q07_Inheritance {

	public static void main(String[] args) {
		ColorTV mytv = new ColorTV(32, 1024);
		mytv.printProperty();
		
		IPTV iptv = new IPTV("192.1.1.2", 32, 1024);
		iptv.printProperty();
	}

}

class TV {
	private int size;

	public TV(int size) {
		super();
		this.size = size;
	}

	public int getSize() {
		return size;
	}

}

class ColorTV extends TV{
	
	private int color;

	public ColorTV(int size, int color) {
		super(size);
		this.color = color;
	}
	
	protected void printProperty() {
		System.out.println(getSize() + "인치 " + color + "컬러");
	}
}

class IPTV extends ColorTV {
	private String addr;
	public IPTV(String addr, int size, int color) {
		super(size, color);
		this.addr = addr;
	}
	
	@Override
	protected void printProperty() {
		System.out.print("나의 IPTV는 " + addr + " 주소의 ");
		super.printProperty();
	}
}