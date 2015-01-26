package com.diegotcba.topic4;

import java.util.ArrayList;
import java.util.List;

import com.diegotcba.shoppingcart.*;

public class ShoppingCart implements ShopppingCartService {
	private List<Item> items;
	private Cart cart;
	private Order order;
	
	protected ShoppingCart()
	{
		Product item1=new Product(1,"Green Shoes",50.5);
		Product item2=new Product(2,"Texas Jeans",123.5);
		Product item3=new Product(3,"Marvel T-Shirt",60.5);
		Product item4=new Product(4,"DC Hood",80);
		Product item5=new Product(5,"Girl Leggis",50);
		Offer offer1=new Offer();
		offer1.add(item4);
		offer1.add(item5);
		offer1.setName("Girl Combo");
		offer1.setPrice(100);
		
		items=new ArrayList<Item>();
		items.add(item1);
		items.add(item2);
		items.add(item3);
		items.add(offer1);
		
		cart=new Cart();
		
	}

	public void addItem(Item item, int quantity) {
		// TODO Auto-generated method stub
		cart.addItem(item, quantity);
	}

	public List<Item> getListItems() {
		// TODO Auto-generated method stub
		return items;
	}

	public void removeItem(ItemOrder item) {
		// TODO Auto-generated method stub
		cart.removeItem(item);
	}		
	
//	I think exposing the Cart object is wrong but I keep it 
//	just for showing the items inside the cart. 
	public Cart getCart()
	{
		return cart;
	}

	public void doCheckOut() {
		// TODO Auto-generated method stub
		order=new Order(OrderID.getInstance().getOrderId(), new CashPayment(), cart);
		OrderID.getInstance().updateOrderId();
	}

	public void setCashPayment() {
		// TODO Auto-generated method stub
		order.setPaymentType(new CashPayment());
	}

	public void setCreditCardPayment(String name, String number) {
		// TODO Auto-generated method stub
		order.setPaymentType(new CreditCardPayment(name, number));
	}

	public void setPaypalPayment(String email, String password) {
		// TODO Auto-generated method stub
		order.setPaymentType(new PaypalPayment(email, password));
	}

	public int getOrderId() {
		// TODO Auto-generated method stub
		return order.getId();
	}

	public double getTotalOrder() {
		// TODO Auto-generated method stub
		return order.getTotal();
	}

	public String getPaymentNameOrder() {
		// TODO Auto-generated method stub
		return order.getPaymentType().toString();
	}

}
