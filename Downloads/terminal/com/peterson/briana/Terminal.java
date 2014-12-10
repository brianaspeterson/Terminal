package terminal.com.peterson.briana;

import java.util.*;

public class Terminal implements ClientAPI  {
	
	private Map<Integer, ShoppingCartItem> shoppingCartMap;
	int key = 0;
	
	public Terminal(){
		shoppingCartMap = new HashMap<Integer, ShoppingCartItem>();
		}

	@Override
	public boolean scan(ShoppingCartItem shoppingCartItem) {
		// TODO Auto-generated method stub
		
		if(shoppingCartMap.containsKey(shoppingCartItem.getItemName())){
			ShoppingCartItem shoppingCartItemNew = new ShoppingCartItem();
			shoppingCartItemNew.setItemPrice(shoppingCartItem.getItemPrice() + shoppingCartItemNew.getItemPrice());
			shoppingCartItemNew.setQuantity(shoppingCartItem.getQuantity() + shoppingCartItemNew.getQuantity());
			shoppingCartItem = shoppingCartItemNew;
			key++;
		}
		key++;
		shoppingCartMap.put(key, shoppingCartItem);

		return true;
	}

	@Override
	public boolean remove(String itemName) {
		// TODO Auto-generated method stub
		if (shoppingCartMap.containsValue(itemName)){
			shoppingCartMap.remove(itemName);
	
			return true;
		}
		else {
			return false;
		}
		
			}


	@Override
	public double total() {
		// TODO Auto-generated method stub
		double totalPerU = 0.0d;
		double totalGroup = 0.0d;
		double finalPrice = 0.0d;
		double totalA = 0.0d, totalB = 0.0d, totalC = 0.0d, totalD = 0.0d;
		double quantityA = 0.0d, quantityB = 0.0d, quantityC = 0.0d, quantityD = 0.0d;
		double totalUnitPriceA = 0.0d, totalUnitPriceB = 0.0d, totalUnitPriceC = 0.0d, totalUnitPriceD = 0.0d;
	
		Collection<ShoppingCartItem> keys = shoppingCartMap.values(); 
		for (ShoppingCartItem item : keys){
			if (item.getItemName()=="A" && item.getUnitQuantity() > 0.0){
				 
				 quantityA+= item.getQuantity();
				 totalGroup = (Math.floor((quantityA / item.getUnitQuantity())) * item.getUnitPrice());
				 totalPerU = (Math.floor((quantityA % item.getUnitQuantity())) * item.getItemPrice());
				 totalA = totalGroup + totalPerU;
				
			}
			else if (item.getItemName()=="B" && item.getUnitQuantity() > 0.0){
				 quantityB += item.getQuantity();
				 totalGroup = (Math.floor((quantityB / item.getUnitQuantity())) * item.getUnitPrice());
				 totalPerU = (Math.floor((quantityB % item.getUnitQuantity())) * item.getItemPrice());
				 totalB = totalGroup + totalPerU;
				 

			}
			
			else if (item.getItemName()=="C" && item.getUnitQuantity() > 0.0){
				 quantityC+= item.getQuantity();
				 totalGroup = (Math.floor((quantityC / item.getUnitQuantity())) * item.getUnitPrice());
				 totalPerU = (Math.floor((quantityC % item.getUnitQuantity())) * item.getItemPrice());
				 totalC = totalGroup + totalPerU;
				 System.out.println("TotalGroup C:" + totalGroup);
				 System.out.println("TotalPerU C:" + totalPerU);
				 System.out.println("Total C:" + totalC);
			}
			else if (item.getItemName()=="D" && item.getUnitQuantity() > 0.0){
				 quantityD+= item.getQuantity();
				 totalGroup = (Math.floor((quantityD / item.getUnitQuantity())) * item.getUnitPrice());
				 totalPerU = (Math.floor((quantityD % item.getUnitQuantity())) * item.getItemPrice());
				 totalD = totalGroup + totalPerU;
				 System.out.println("Total D:" + totalD);
			}
			else if (item.getItemName() == "A" && item.getUnitQuantity() == 0.0){
				totalUnitPriceA += item.getQuantity() * item.getItemPrice();
			}
			else if (item.getItemName() == "B" && item.getUnitQuantity() == 0.0){
				totalUnitPriceB += item.getQuantity() * item.getItemPrice();
			}
			else if (item.getItemName() == "C" && item.getUnitQuantity() == 0.0){
				totalUnitPriceC += item.getQuantity() * item.getItemPrice();
			}
			else if (item.getItemName() == "D" && item.getUnitQuantity() == 0.0){
				totalUnitPriceD += item.getQuantity() * item.getItemPrice();
			}
			
		}
		finalPrice = totalA + totalB +totalC +totalD + totalUnitPriceA + totalUnitPriceB + totalUnitPriceC + totalUnitPriceD;
		return finalPrice;
		}
	}	