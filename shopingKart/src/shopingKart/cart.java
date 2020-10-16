package shopingKart;

import java.util.ArrayList;
import java.util.List;

public class cart {
	
	private static product product = null;
	List<product> cartItems= new ArrayList<>();
	
	public void addToCart(int pid) {
		cartItems.add(product);
		
		
	}

	public void RemoveFromCart(int pid) {
		cartItems.remove(product);
		
		
	}
	public product getProductByPid(int pid) {
		List<product> products=new products().getproduct();
		for(product prod:products) {
			if(prod.getPid() == pid) {
				 product=prod;
				break;
				
			}
		}
		return product;
		
	}
	public void printCartItems() {
		for(product prod:cartItems) {
			System.out.println(prod.getName());
		}
			
	}

}
