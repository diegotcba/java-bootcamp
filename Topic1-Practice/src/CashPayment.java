import java.util.Iterator;


public class CashPayment implements PaymentType {

	@Override
	public double calculateDiscount(Cart cart) {
		double expensive=0;
		int i=0;
		
		Iterator<Item> it=cart.Iterator();
		while (it.hasNext()) {
			Item item = (Item) it.next();
			if (i==0) { expensive=item.getPrice();}
			
			if (item.getPrice()>=expensive)
			{
				expensive=item.getPrice();
			}
		}
		return expensive*0.9;
	}
	
	@Override
	public String toString()
	{
		return "Cash";
	}

}
