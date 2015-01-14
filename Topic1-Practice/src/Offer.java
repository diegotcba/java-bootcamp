import java.util.ArrayList;
import java.util.List;


/**
 * @author DiegoT
 * 
 * Composite class from Composite pattern for the Offers.
 *
 */
public class Offer implements Component {
	private List<Component> components=new ArrayList<Component>();
	
	private String name;
	private double price;

	@Override
	public String getList() 
	{
		String list=name+"\t\t\t\t" + price +"\n";
		for(Component component : components)
		{
			list+=component.getList() + "\n";
		}
		return list;
	}
	
	public void add(Component component)
	{
		components.add(component);
	}
	
	public void remove(Component component)
	{
		components.remove(component);
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
