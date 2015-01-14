import java.util.Iterator;


/**
 * @author DiegoT
 *
 */
public class CashPayment implements PaymentType {

	@Override
	public double calculateDiscount(Cart cart) {
		double expensive=0;
		int i=0;
		
		Iterator<Component> it=cart.Iterator();
		while (it.hasNext()) {
			Component item = (Component) it.next();
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
