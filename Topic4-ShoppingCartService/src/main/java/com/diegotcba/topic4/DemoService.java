package com.diegotcba.topic4;

import java.util.List;

import com.diegotcba.shoppingcart.Item;

public class DemoService {

	public static void main(String[] args)
	{
		System.out.println("Local service example \n\n");
		ShopppingCartService service=ShoppingCartServiceFactory.getLocalService();
		
		List<Item> items = service.getListItems();
		service.addItem(items.get(1),3);
		service.addItem(items.get(2),1);
		service.addItem(items.get(3),1);

		System.out.println(service.getCart());
		
		service.doCheckOut();
		
		service.setCreditCardPayment("VISA", "1234-85346");
		
		System.out.println("Order: " + service.getOrderId());
		System.out.println("Cart price: " + service.getCart().getPrice());
		System.out.println("Payment Method: " + service.getPaymentNameOrder());
		System.out.println("-------------------------------------------------------------------");
		System.out.println(service.getCart());
		System.out.println("-------------------------------------------------------------------");
		System.out.println("Total: " + service.getTotalOrder());
	}
}
