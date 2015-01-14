import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Cart {
	private List<Item> items;
	
	public Cart()
	{
		items=new ArrayList<Item>();
	}
	
	public void addItem(Item item)
	{
		items.add(item);
	}

	public void removeItem(int id)
	{
		Iterator<Item> it=Iterator();
		while (it.hasNext()) {
			Item item = (Item) it.next();
			if (item.getProduct().getId()==id)
			{
				it.remove();
			}
		}
	}
	
	public Iterator<Item> Iterator()
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
		Iterator<Item> it=Iterator();
		while (it.hasNext()) {
			Item item = (Item) it.next();
			totalprice+=item.getPrice();
		}
		return totalprice;
	}
	
	public void displayItems()
	{
		Iterator<Item> it=Iterator();
		while (it.hasNext()) {
			Item item = (Item) it.next();
			System.out.println(item);
		}
	}
	
	public String toString()
	{
		String list="";
		
		Iterator<Item> it=Iterator();
		while (it.hasNext()) {
			Item item = (Item) it.next();
			list+=item + "\n";
		}
		return list;
	}
	
	class CartIterator implements Iterator<Item>
	{
		private int currentIndex=0;

		@Override
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

		@Override
		public Item next() 
		{
			return items.get(currentIndex++);
		}
		
		@Override
		public void remove()
		{
			items.remove(--currentIndex);
		}
		
	}
}
