package com.diegotcba.shoppingcart;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Cart {
	private List<ItemOrder> items;
	
	public Cart()
	{
		items=new ArrayList<ItemOrder>();
	}
	
	public void addItem(Item item,int quantity)
	{
		items.add(new ItemOrder(item,quantity));
	}

	public void removeItem(ItemOrder item)
	{
		items.remove(item);
//		Iterator<Component> it=Iterator();
//		while (it.hasNext()) {
//			Component item = (Component) it.next();
//			if (item.getProduct().getId()==id)
//			{
//				it.remove();
//			}
//		}
	}
	
	public Iterator<ItemOrder> Iterator()
	{
		return new CartIterator();
	}
	
	public int getItemsCount()
	{
		return items.size();
	}
	
	public double getPrice()
	{
		double totalprice=0;
		Iterator<ItemOrder> it=Iterator();
		while (it.hasNext()) {
			ItemOrder item = (ItemOrder) it.next();
			totalprice+=item.getPrice();
		}
		return totalprice;
	}
		
	public String toString()
	{
		String list="";
		
		Iterator<ItemOrder> it=Iterator();
		while (it.hasNext()) {
			ItemOrder item = (ItemOrder) it.next();
			list+=item + ((it.hasNext()) ? "\n" : "");
		}
		return list;
	}
	
	class CartIterator implements Iterator<ItemOrder>
	{
		private int currentIndex=0;

		public boolean hasNext() {
			if (currentIndex>=items.size())
			{
				return false;
			}
			else
			{
				return true;
			}
		}

		public ItemOrder next() 
		{
			return items.get(currentIndex++);
		}
		
		public void remove()
		{
			items.remove(--currentIndex);
		}
		
	}
}
