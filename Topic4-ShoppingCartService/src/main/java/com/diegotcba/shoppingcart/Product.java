package com.diegotcba.shoppingcart;

/**
 * @author DiegoT
 *
 * Interface for the application of Composite pattern
 */
public class Product implements Item {
	
	private int id;
	private String name;
	private double price;
	
	
	public Product(int id, String name, double price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}
	
	public int getId()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public void setPrice(double price)
	{
		this.price=price;
	}
	
	public String toString()
	{
		return "";
	}

	public String getList() {
		// TODO Auto-generated method stub
		return "\t" + getName() + "\t\t" + getPrice();
	}

}
