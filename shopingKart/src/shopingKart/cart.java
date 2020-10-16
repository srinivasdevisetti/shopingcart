package shopingKart;

import java.util.ArrayList;
import java.util.List;

public class cart {
	
	//private static product product = null;
	List<product> cartItems= new ArrayList<>();

	
	public void addToCart(int pid) {
		List<product> products=new products().getproduct();
		for(product prod:products) {
			if(prod.getPid() == pid) {
				product product=prod;
				cartItems.add(product);
				break;
				
			}
		}
	
		
		
		
		
	}

	public void RemoveFromCart(int pid) {
		List<product> products=new products().getproduct();
		for(product prod:products) {
			if(prod.getPid() == pid) {
				product product=prod;
				cartItems.remove(product);
				break;
				
			}
		}
	
		
		
	}
	
	public void printCartItems() {
		for(product pro:cartItems) {
			System.out.println(pro.getName());
		}
			
	}

}
