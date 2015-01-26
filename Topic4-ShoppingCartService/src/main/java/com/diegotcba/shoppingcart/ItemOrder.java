package com.diegotcba.shoppingcart;

/**
 * @author DiegoT
 *
 */
public class ItemOrder {
	private Item item;
	private int quantity;
	
	public ItemOrder(Item product, int quantity)
	{
		this.item=product;
		this.quantity=quantity;
	}
	
	public double getPrice()
	{
		return (double)(quantity*item.getPrice());
	}
	
	public int getQuantity()
	{
		return quantity;
	}
	
	public Item getProduct()
	{
		return item;
	}
	
	public String toString()
	{
		return "-" + item.getName() + "\t\t" + item.getPrice() + "\t" + quantity + "\t" + getPrice() + item.toString() + "\n";
	}

	public String getList() 
	{
		return "   " + toString();
	}
		
}
