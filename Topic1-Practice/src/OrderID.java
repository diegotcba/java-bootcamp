
/**
 * @author DiegoT
 *
 */
public class OrderID {

	private static OrderID instance=null;
	private int orderId;
	
	private OrderID()
	{
		orderId=1;
	}
	
	public static OrderID getInstance()
	{
		if (instance==null)
		{
			instance=new OrderID();
		}
		return instance;
	}
	
	public int getOrderId()
	{
		return orderId;
	}
	
	public void updateOrderId()
	{
		orderId+=1;
	}
}
