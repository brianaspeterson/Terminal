package terminal.com.peterson.briana;

public class ShoppingCartItem {

	private String itemName;
	private double itemPrice;
	private double unitPrice;
	private int quantity;
	private int unitQuantity;
	
	public ShoppingCartItem(){
		
	}
	
	public ShoppingCartItem(String itemName, int quantity, double itemPrice){
		
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.quantity = quantity;
		this.unitPrice = 0.0;
		this.unitQuantity = 0;
		
	}
	
	public ShoppingCartItem(String itemName, int quantity, double itemPrice, double unitPrice, int unitQuantity){
		
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
		this.unitQuantity = unitQuantity;
		
	}
	
	
	public void setItemName(String itemName){
		this.itemName = itemName;
	}
	
	public String getItemName(){
		return itemName;
	}
	
	public void setItemPrice(double itemPrice){
		this.itemPrice = itemPrice;
	}
	
	public double getItemPrice(){
		return itemPrice;
	}
	public void setUnitPrice(double unitPrice){
		this.unitPrice = unitPrice;
	}
	
	public double getUnitPrice(){
		return unitPrice;
	}
	public void setQuantity(int quantity ){
		this.quantity = quantity;
	}
	
	public int getQuantity(){
		return quantity;
	}
	

	public int getUnitQuantity() {
		return unitQuantity;
	}

	public void setUnitQuantity(int unitQuantity) {
		this.unitQuantity = unitQuantity;
	}
	
	
}
