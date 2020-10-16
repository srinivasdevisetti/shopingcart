package shopingKart;

import java.util.*;

public class ui {
	cart cart=new cart();
	private int ch=0;

	public void menu() {
	
			
			startmenu();
		readinput();
		switch (ch){
			case 1:
				displayProducts();
				storeProductMenu();
				readinput();
				innerchoice();
				break;
			case 2 :
				showcart();
				break;
		
				default:
					break;
					}
	}
	public void startmenu() {
		System.out.println("selrct from folling:");
		System.out.println("display store products - 1");
		System.out.println("show cart -2");
		System.out.println("exite -0");
	}
	public int readinput() {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter=");
	return ch=sc.nextInt();
	
	}
	public void displayProducts() {
		products products=new products();
		List<product> prod = products.getproduct();
		for(product pro:prod) {
			System.out.println(pro.getPid()+"  "+pro.getName()+"  "+pro.getPrice()+"  "+pro.getStock());
		}
	}
	public void storeProductMenu() {
		System.out.println("add to cart - 1");
		System.out.println("remove to cart -2");
		System.out.println("exit -0");
	}
	public void showcart() {
		cart.printCartItems();
	}
	public void addtocart() {
		System.out.println("pid");
		int pid=readinput();
		cart.addToCart( pid);
	}
	public void removefromcart() {
		System.out.println("pid");
		int pid=readinput();
		cart.RemoveFromCart( pid);
	}
	public void innerchoice() {
		
		switch (ch){
		case 1:
			
			addtocart() ;
			System.out.println("cart items=");
			showcart();
			break;
		case 2:
			removefromcart();
			break;
		}
	}
}
