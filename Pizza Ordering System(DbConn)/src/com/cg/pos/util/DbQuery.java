package com.cg.pos.util;

public class DbQuery {
	public static final String ViewCustomer = "select * from Customer where cId = ?";
	public static final String ViewPizza = "select * from pizza";
	public static final String AddItem = " select pizzaName, Quantity, AddOns, StoreName from pizza inner Join store on pizza.storeId = store.storeId where itemId = ?";
	public static final String LookCart = "select cartId from order where orderId = ?";
	public static final String showStore= " select pizza.storeId, store.storeName, store.storeAddress from store right outer join pizza on store.storeId = pizza.storeId where pizzaName = ? ";
}
