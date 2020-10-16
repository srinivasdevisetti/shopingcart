package shopingKart;

import java.util.ArrayList;
import java.util.List;

public class products {
	
	List<product> products= new ArrayList<>();
	public products() {
		this.initStoreItems();
	}
	public List<product> getproduct(){
		return products;
	
	}
	
	
	public void initStoreItems() {
		String[] name= {"realme","redmi","oppo"};
		double[] price= {1500,2000,2500};
		int[] stock= {20,15,13};
		for(int i=0;i<name.length;i++) {
			products.add(new product(i+1,name[i], price[i], stock[i]));
		}
		
	}
	
	
	
	
	

}
