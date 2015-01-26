package com.diegotcba.topic4;

import java.util.List;

import com.diegotcba.shoppingcart.Cart;
import com.diegotcba.shoppingcart.Item;
import com.diegotcba.shoppingcart.ItemOrder;

public interface ShopppingCartService {
	public void addItem(Item item, int quantity);
	public void removeItem(ItemOrder item);
	public List<Item> getListItems();
	public Cart getCart();
	public void doCheckOut();
	public void setCashPayment();
	public void setCreditCardPayment(String name, String number);
	public void setPaypalPayment(String email,String password);
	public int getOrderId();
	public double getTotalOrder();
	public String getPaymentNameOrder();
}
