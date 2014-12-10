package terminal.com.peterson.briana;



public interface ClientAPI {
	

	boolean scan(ShoppingCartItem shoppingCartItem);
	boolean remove(String itemName);
	double total();	
	
	
	
}
