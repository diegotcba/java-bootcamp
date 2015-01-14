
/**
 * @author DiegoT
 *
 */
public class CreditCardPayment implements PaymentType {
	private String name;
	private String creditNumber;

	public CreditCardPayment(String name, String creditNumber) 
	{
		this.name=name;
		this.creditNumber=creditNumber;
	}
	
	@Override
	public double calculateDiscount(Cart cart) {
		return cart.getPrice()*0.1;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getCreditNumber()
	{
		return creditNumber;
	}
	
	@Override
	public String toString()
	{
		return "Credit Card " + name + " " + creditNumber;
	}

}
