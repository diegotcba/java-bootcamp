import java.util.Iterator;

public class PaypalPayment implements PaymentType {
	private String email;
	private String password;
	
	public PaypalPayment(String email, String password) 
	{
		this.email=email;
		this.password=password;
	}
	
	@Override
	public double calculateDiscount(Cart cart) {
		double cheapest=0;
		int i=0;
		
		Iterator<Item> it=cart.Iterator();
		while (it.hasNext()) {
			Item item = (Item) it.next();
			if (i==0) { cheapest=item.getPrice();}
			
			if (item.getPrice()<=cheapest)
			{
				cheapest=item.getPrice();
			}
		}
		return cheapest;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public String getPassword()
	{
		return password;
	}
	
	@Override
	public String toString()
	{
		return "Paypal - " + email + " - " + password;
	}

}
