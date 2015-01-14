import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Cart {
	private List<Component> items;
	
	public Cart()
	{
		items=new ArrayList<Component>();
	}
	
	public void addItem(Component item)
	{
		items.add(item);
	}

	public void removeItem(Component item)
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
	
	public Iterator<Component> Iterator()
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
		Iterator<Component> it=Iterator();
		while (it.hasNext()) {
			Component item = (Component) it.next();
			totalprice+=item.getPrice();
		}
		return totalprice;
	}
		
	public String toString()
	{
		String list="";
		
		Iterator<Component> it=Iterator();
		while (it.hasNext()) {
			Component item = (Component) it.next();
			list+=item + ((it.hasNext()) ? "\n" : "");
		}
		return list;
	}
	
	class CartIterator implements Iterator<Component>
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
		public Component next() 
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
