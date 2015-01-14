
public class Order {
	private int id;
	private PaymentType paymentType;
	private Cart cart;
	private double total;
	
	public Order(int id, PaymentType paymentType, Cart cart)
	{
		this.id=id;
		this.paymentType=paymentType;
		this.cart=cart;
	}
	
	public void setPaymentType(PaymentType paymentType)
	{
		this.paymentType=paymentType;
	}
	
	public void calculateTotal()
	{
		total=cart.getPrice()-paymentType.calculateDiscount(cart);
	}
	
	public double getTotal()
	{
		return total;
	}
	
	public int getId()
	{
		return id;
	}
}
