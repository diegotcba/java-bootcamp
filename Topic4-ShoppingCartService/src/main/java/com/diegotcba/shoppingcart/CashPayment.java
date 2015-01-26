package com.diegotcba.shoppingcart;
import java.util.Iterator;


/**
 * @author DiegoT
 *
 */
public class CashPayment implements PaymentType {

	public double calculateDiscount(Cart cart) {
		double expensive=0;
		int i=0;
		
		Iterator<ItemOrder> it=cart.Iterator();
		while (it.hasNext()) {
			ItemOrder item = (ItemOrder) it.next();
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
