package com.diegotcba.topic4;

import static org.junit.Assert.*;

import org.junit.Test;

public class ShoppingCartTest {

	@Test
	public void testCreateService()
	{
		ShopppingCartService service=ShoppingCartServiceFactory.getLocalService();
		assertTrue((service!=null));
	}
	
	@Test
	public void testListItemsCount()
	{
		ShopppingCartService service=ShoppingCartServiceFactory.getLocalService();
		assertEquals(4, service.getListItems().size());
	}
	
	@Test
	public void testCartNotNull()
	{
		ShopppingCartService service=ShoppingCartServiceFactory.getLocalService();
		assertTrue((service.getCart()!=null));
	}
	
	@Test
	public void testAddItem()
	{
		ShopppingCartService service=ShoppingCartServiceFactory.getLocalService();
				
		service.addItem(service.getListItems().get(1),3);
		assertEquals(1, service.getCart().getItemsCount());
	}
	
	@Test
	public void testTotalCart()
	{
		ShopppingCartService service=ShoppingCartServiceFactory.getLocalService();
		
		service.addItem(service.getListItems().get(1),3);
		service.addItem(service.getListItems().get(2),1);
		assertTrue(service.getCart().getPrice()>0);
	}
	
	@Test
	public void testRemoveItem()
	{
		ShopppingCartService service=ShoppingCartServiceFactory.getLocalService();
		
		service.addItem(service.getListItems().get(1),3);
		service.addItem(service.getListItems().get(2),1);
		service.removeItem(service.getCart().Iterator().next());
		assertEquals(1,service.getCart().getItemsCount());
	}
	
	@Test
	public void testDoCheckout()
	{
		ShopppingCartService service=ShoppingCartServiceFactory.getLocalService();
		
		service.addItem(service.getListItems().get(1),3);
		service.addItem(service.getListItems().get(2),1);
		service.removeItem(service.getCart().Iterator().next());
		service.doCheckOut();
		
		assertEquals(1,service.getCart().getItemsCount());
	}
	
	@Test
	public void testCash()
	{
		ShopppingCartService service=ShoppingCartServiceFactory.getLocalService();
		
		service.addItem(service.getListItems().get(1),3);
		service.addItem(service.getListItems().get(2),1);
		service.removeItem(service.getCart().Iterator().next());
		service.doCheckOut();
		service.setCashPayment();
		assertEquals("Cash",service.getPaymentNameOrder());
	}
	
	@Test
	public void testTotal()
	{
		ShopppingCartService service=ShoppingCartServiceFactory.getLocalService();
		
		service.addItem(service.getListItems().get(1),3);
		service.addItem(service.getListItems().get(2),1);
		service.removeItem(service.getCart().Iterator().next());
		service.doCheckOut();
		service.setCashPayment();
		assertTrue(service.getTotalOrder()>0);
	}
}
