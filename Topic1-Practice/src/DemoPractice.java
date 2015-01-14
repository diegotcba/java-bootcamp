//import java.util.Iterator;


public class DemoPractice {

	public static void main(String[] args)
	{
		Cart cart=new Cart();
		Item item1=new Item(new Product(1,"Green Shoes",50.5),2);
		Item item2=new Item(new Product(2,"Texas Jeans",123.5),2);
		Item item3=new Item(new Product(3,"Marvel T-Shirt",60.5),2);
		
		cart.addItem(item1);
		cart.addItem(item2);
		cart.addItem(item3);
						
		System.out.println("\n\n");
		
		//Checkout and creating of a new Order 
		PaymentType payment=new CreditCardPayment("VISA", "1234-8764");
		Order order=new Order(OrderID.getInstance().getOrderId(),payment,cart);
		
		OrderID.getInstance().updateOrderId();
		
		order.calculateTotal();
		System.out.println("Order: " + order.getId());
		System.out.println("Cart price: " + cart.getPrice());
		System.out.println("Payment Method: " + payment);
		System.out.println("---------------------------------------------");
		System.out.println(cart);
		System.out.println("---------------------------------------------");
		System.out.println("Total: " + order.getTotal());
		
		System.out.println("\n\n");
		//Checkout and creating of a new Order 
		payment=new PaypalPayment("tellodiego@yahoo.com", "123456");	
		order=new Order(OrderID.getInstance().getOrderId(),payment,cart);
		
		OrderID.getInstance().updateOrderId();
		
		order.calculateTotal();
		System.out.println("Order: " + order.getId());
		System.out.println("Cart price: " + cart.getPrice());
		System.out.println("Payment Method: " + payment);
		System.out.println("---------------------------------------------");
		System.out.println(cart);
		System.out.println("---------------------------------------------");
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
		System.out.println("---------------------------------------------");
		System.out.println(cart);
		System.out.println("---------------------------------------------");
		System.out.println("Total: " + order.getTotal());
	}
}
