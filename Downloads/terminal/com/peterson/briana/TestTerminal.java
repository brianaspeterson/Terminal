/**
 * 
 */
package terminal.com.peterson.briana;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Briana Peterson 
 * @date 12/8/2014
 * 
 *
 */
public class TestTerminal {

	double finalBobCartAmount = 32.40;
	double finalRitaCartAmount = 7.25;
	double finalBrianaCartAmount = 15.40;
	double finalReginasCartAmount = 31.0;
	double finalReggiesCartAmount = 72.0;
	boolean beenRemoved = true;
	
	@Test
	public void threeItemConstructor() {
		Terminal reggiesCart =  new Terminal();
		reggiesCart.scan(new ShoppingCartItem("A", 6, 12.0));
		assertEquals(finalReggiesCartAmount, reggiesCart.total(), 0);

	}
	
	//public ShoppingCartItem(String itemName, int quantity, double itemPrice, double unitPrice, int unitQuantity)
	@Test
	public void fiveItemConstructor() {
		Terminal reginasCart =  new Terminal();
		reginasCart.scan(new ShoppingCartItem("A", 6, 12.0, 7.0, 4));
		assertEquals(finalReginasCartAmount, reginasCart.total(), 0);

	}
	
	
	@Test
	public void test() {
		Terminal bobsCart = new Terminal();
		bobsCart.scan(new ShoppingCartItem("A", 1, 2.0, 7.0, 4));
		bobsCart.scan(new ShoppingCartItem("B", 1, 12.0));
		bobsCart.scan(new ShoppingCartItem("C", 1, 1.25, 6.0, 6));
		bobsCart.scan(new ShoppingCartItem("D", 1, 0.15));
		bobsCart.scan(new ShoppingCartItem("A", 1, 2.0, 7.0, 4));
		bobsCart.scan(new ShoppingCartItem("B", 1, 12.0));
		bobsCart.scan(new ShoppingCartItem("A", 1, 2.0, 7.0, 4));
		bobsCart.scan(new ShoppingCartItem("A", 1, 2.0, 7.0, 4));
		assertEquals(finalBobCartAmount, bobsCart.total(), 0);
	}
	
	@Test
	public void test1(){
		Terminal ritasCart = new Terminal();
		ritasCart.scan(new ShoppingCartItem("C", 7, 1.25, 6.0, 6));
		assertEquals(finalRitaCartAmount, ritasCart.total(), 0);
		}
	
	@Test
	public void test2(){
		Terminal brianasCart = new Terminal();
		brianasCart.scan(new ShoppingCartItem("A", 1, 2.0, 7.0, 4));
		brianasCart.scan(new ShoppingCartItem("B", 1, 12.0));
		brianasCart.scan(new ShoppingCartItem("C", 1, 1.25, 6.0, 6));
		brianasCart.scan(new ShoppingCartItem("D", 1, 0.15));
		assertEquals(finalBrianaCartAmount, brianasCart.total(), 0);
		
		}
	@Test 
	// work on remove
	public void removeTest(){
		Terminal brianasBudgetCart = new Terminal();
		brianasBudgetCart.scan(new ShoppingCartItem("A", 1, 2.0, 7.0, 4));
		brianasBudgetCart.scan(new ShoppingCartItem("B", 1, 12.0));
		brianasBudgetCart.scan(new ShoppingCartItem("C", 1, 1.25, 6.0, 6));
		brianasBudgetCart.scan(new ShoppingCartItem("D", 1, 0.15));
		assertEquals(beenRemoved, brianasBudgetCart.remove("C"));
		
		}

}
