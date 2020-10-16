package shopingKart;

public class product {
	public product(int pid, String name, double price, int stock) {
		super();
		this.pid = pid;
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
	private int pid;
	private  String name;
	private  double price;
	private int stock;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
		
	

}
