package com.cg.pos.ui;

import java.util.ArrayList;
import java.util.Scanner;

import com.cg.pos.dto.PizzaDetails;
import com.cg.pos.dto.StoreDetails;
import com.cg.pos.exception.ConnectionException;
import com.cg.pos.service.StoreService;

public class PizzaSelect {

	public static ArrayList<StoreDetails> Selection(int selectChoice) throws ConnectionException {
		Scanner scanner = new Scanner(System.in);
		String pizzaName;
		StoreDetails store = new StoreDetails();
		ArrayList<StoreDetails> stored = null ;
		switch (selectChoice) {
		case 1:
			System.out.println("Enter the pizzaName: ");
			pizzaName = scanner.next();
//			StoereDetails storeDetails = new StorDetails();
//			pizzaDetails.setItemName(pizzaName);

			StoreService storeService = new StoreServiceImpl();
//			store = storeService.viewStore(store);
			stored = storeService.viewStore(pizzaName);
			System.out.println(stored);
//				CartService cartService = new CartServiceImpl();
//				int quantity;
//				String itemId;
//				int addChoice;
//		
//				PizzaDetails pizzaId = new PizzaDetails();
//				PizzaDetails pizzaQuantity = new PizzaDetails();
//				PizzaDetails pizzaDetails = new PizzaDetails();
//		
//				System.out.println("Enter your pizza:");
//				itemName = scanner.next();
//				pizzaId.setItemId(itemName);
//		
//				System.out.println("Enter the quantity");
//				quantity = scanner.nextInt();
//				pizzaQuantity.setQuantity(quantity);
//				AddPizza addPizza = new AddPizza();		
//				System.out.println(pizzaList);
//				addPizza.includePizza(pizzaId, pizzaQuantity);
//				System.out.println("Press 1 to add again");
//				System.out.println("Press 2 to confirm Order");
//				System.out.println("Press 3 to exit");
//				addChoice = scanner.nextInt();
//				do {
//					switch(addChoice) {
//					case 1: 
//						cartService.addMore(pizzaId, pizzaQuantity);
//						break;
//					case 2:
//						int cartId;
//						cartId= scanner.nextInt();
//						cartService.confirmOrder(cartId);
//						break;
//					case 3:
//						System.out.println(ExitMessage.Exit);
//						System.exit(addChoice);
//						break;
//					} }while(true);
//					}
//				    catch(InputMismatchException e) {
//					   throw new ConnectionException(e);	
//					}

			break;
		case 2:
			System.out.println(ExitMessage.Exit);
			System.exit(selectChoice);
			break;
		default:
			System.out.println(ExitMessage.Default);
		}
//		System.out.println(pizzaList);
		return stored;

	}

}
