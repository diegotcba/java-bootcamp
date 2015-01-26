package com.diegotcba.shoppingcart;

/**
 * @author DiegoT
 *
 */
public class DemoPractice {

	public static void main(String[] args)
	{
		
		Cart cart=new Cart();
		Product item1=new Product(1,"Green Shoes",50.5);
		Product item2=new Product(2,"Texas Jeans",123.5);
		Product item3=new Product(3,"Marvel T-Shirt",60.5);
		Product item4=new Product(2,"DC Hood",80);
		Product item5=new Product(3,"Girl Leggis",50);
		
		Offer offer1=new Offer();
		offer1.add(item4);
		offer1.add(item5);
		offer1.setName("Girl Combo");
		offer1.setId(7);
		offer1.setPrice(100);

		cart.addItem(item1,1);
		cart.addItem(item2,3);
		cart.addItem(item3,2);
		cart.addItem(offer1,1);
		
						
		System.out.println("\n\n");
		
		//Checkout and creating of a new Order 
		PaymentType payment=new CreditCardPayment("VISA", "1234-8764");
		Order order=new Order(OrderID.getInstance().getOrderId(),payment,cart);
		
		OrderID.getInstance().updateOrderId();
		
		order.calculateTotal();
		System.out.println("Order: " + order.getId());
		System.out.println("Cart price: " + cart.getPrice());
		System.out.println("Payment Method: " + payment);
		System.out.println("-------------------------------------------------------------------");
		System.out.println(cart);
		System.out.println("-------------------------------------------------------------------");
		System.out.println("Total: " + order.getTotal());
		
		System.out.println("\n\n");
		//Checkout and creating of a new Order 
		payment=new PaypalPayment("tellodiego@yahoo.com", "1234567");	
		order=new Order(OrderID.getInstance().getOrderId(),payment,cart);
		
		OrderID.getInstance().updateOrderId();
		
		order.calculateTotal();
		System.out.println("Order: " + order.getId());
		System.out.println("Cart price: " + cart.getPrice());
		System.out.println("Payment Method: " + payment);
		System.out.println("-------------------------------------------------------------------");
		System.out.println(cart);
		System.out.println("-------------------------------------------------------------------");
		System.out.println("Total: " + order.getTotal());

		System.out.println("\n\n");
		//Checkout and creating of a new Order 
		payment=new CashPayment();	
		order=new Order(OrderID.getInstance().getOrderId(),payment,cart);
		
		OrderID.getInstance().updateOrderId();
		
		order.calculateTotal();
		System.out.println("Order: " + order.getId());
		System.out.println("Cart price: " + cart.getPrice());
		System.out.println("Payment Method: " + payment);
		System.out.println("-------------------------------------------------------------------");
		System.out.println(cart);
		System.out.println("-------------------------------------------------------------------");
		System.out.println("Total: " + order.getTotal());
	}
}
