package com.diegotcba.shoppingcart;
import java.util.ArrayList;
import java.util.List;


/**
 * @author DiegoT
 * 
 * Composite class from Composite pattern for the Offers.
 *
 */
public class Offer implements Item {
	private List<Item> components=new ArrayList<Item>();
	
	private int id;
	private String name;
	private double price;

	public String getList() 
	{
//		String list="*" + name+"\t\t\t\t" + price +"\n";
		String list="\n";
		for(Item component : components)
		{
			list+=component.getList() + "\n";
		}
		return list;
	}
	
	public void add(Item component)
	{
		components.add(component);
	}
	
	public void remove(Item component)
	{
		components.remove(component);
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setPrice(double price)
	{
		this.price=price;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String toString()
	{
		return getList();
	}

}
