package com.diegotcba.topic4;

public class ShoppingCartServiceFactory {
	
	private ShoppingCartServiceFactory() {};
	
	public static ShopppingCartService getLocalService()
	{
		return new ShoppingCart();
	}
}
