package com.cg.pos.ui;

import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.cg.pos.dto.CustomerDetails;
import com.cg.pos.dto.PizzaDetails;
import com.cg.pos.exception.ConnectionException;
import com.cg.pos.service.CustomerService;
import com.cg.pos.service.CustomerServiceImpl;
import com.cg.pos.util.ExceptionMessages;

public class POSMain {
	@SuppressWarnings("static-access")
	public static void main(String[] args)  {

		System.out.println("Welcome To Pizza Orering System");
		System.out.println("Press 1 to view the selection page");
		System.out.println("Press 2 to exit");
		Scanner scanner = new Scanner(System.in);
		try {
			int choice = scanner.nextInt();
			// scanner.nextLine();
			switch (choice) {
			case 1:
				System.out.println("Enter your id:");
				String customerId = scanner.next();
				CustomerDetails cusDto = new CustomerDetails();
				cusDto.setCustomerId(customerId);
				CustomerService custService = new CustomerServiceImpl();

				try {
					cusDto = custService.ViewCustomer(cusDto);
					System.out.println("Welcome " + cusDto.getCustomerName());

				}

				catch (SQLException e) {
					System.out.println(ExceptionMessages.Message1);
				}

				PizzaDetails pizzDetails = new PizzaDetails();
				int selectChoice;
				System.out.println("Enter 1 to select Pizza");
				System.out.println("Press 2 to exit the selection");
				try {
				selectChoice = scanner.nextInt();
				PizzaSelect.Selection(selectChoice);
				}
				catch (InputMismatchException e) {
					System.out.println(ExceptionMessages.Message3);
				}
					
				break;
			case 2:
				System.out.println("Successfully exitted");
				System.exit(choice);
				break;
			default:
				System.out.println("Please use the provided options");
			}
		} catch (ConnectionException e) {
			System.out.println(ExceptionMessages.Message1);
		}



//		System.out.println(pizzDetails); 

	}
}
