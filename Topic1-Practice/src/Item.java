
public class Item {
	private Product product;
	private int quantity;
	
	public Item(Product product, int quantity)
	{
		this.product=product;
		this.quantity=quantity;
	}
	
	public double getPrice()
	{
		return (double)(quantity*product.getPrice());
	}
	
	public int getQuantity()
	{
		return quantity;
	}
	
	public Product getProduct()
	{
		return product;
	}
	
	public String toString()
	{
		return product.toString() + "  " + quantity + "   $"+getPrice();
	}
		
}
