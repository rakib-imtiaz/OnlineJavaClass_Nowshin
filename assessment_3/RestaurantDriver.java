package assessment_3;

import java.util.ArrayList;
import java.util.Scanner;

public class RestaurantDriver {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Menu takeawayMenu = new Menu(1, "Takeaway Menu", "Takeaway", "Main Branch", "All Day");
		Menu dineInMenu = new Menu(2, "Dine-in Menu", "Dine-in", "Main Branch", "Dinner");

		// Create menu items
		MenuItem item1 = new StandardMenuItem(1, "Margherita Pizza",
				"Classic pizza with tomato sauce and mozzarella cheese", 12.99);
		MenuItem item2 = new PremiumMenuItem(2, "Lobster Ravioli",
				"Ravioli filled with lobster and served in a creamy sauce", 24.99);
		MenuItem item3 = new DiscountedMenuItem(3, "Garden Salad",
				"Fresh mixed greens, tomatoes, cucumbers, and carrots", 8.99);
		MenuItem item4 = new DrinksMenuItem(4, "Iced Tea", "Freshly brewed iced tea", 2.99);
	
		// Populate menus
		takeawayMenu.addMenuItem(item1);
		takeawayMenu.addMenuItem(item2);
		takeawayMenu.addMenuItem(item3);
		takeawayMenu.addMenuItem(item4);

		dineInMenu.addMenuItem(item1);
		dineInMenu.addMenuItem(item2);
		dineInMenu.addMenuItem(item3);
		dineInMenu.addMenuItem(item4);

		System.out.println("Welcome to the Restaurant Menu Management System");
		System.out.println("Developed by: [Your Group Members' Names]");

		System.out.print("Do you want to place an order? (y/n): ");
		String choice = scanner.nextLine();

		if (choice.equalsIgnoreCase("y")) {
			System.out.print("Enter your name: ");
			String customerName = scanner.nextLine();

			System.out.print("Enter your status (new/active/vip): ");
			String customerStatus = scanner.nextLine();

			Customer customer = new Customer(customerName, customerStatus);
			System.out.println(customer);

			System.out.println("\nMenu Options:");
			System.out.println("1. Takeaway Menu");
			System.out.println("2. Dine-in Menu");
			System.out.print("Select a menu: ");
			int menuChoice = scanner.nextInt();
			scanner.nextLine(); // Consume newline character

			Menu selectedMenu = menuChoice == 1 ? takeawayMenu : dineInMenu;
			
			System.out.println("\nSelected Menu:");
			System.out.println(selectedMenu);

			ArrayList<MenuItem> order = new ArrayList<>();

			System.out.println(
					"\nPlease select the items you want to order (enter the item number, or 'done' to finish):");
			while (true) {
				System.out.print("Enter item number: ");
				String input = scanner.nextLine();
				if (input.equalsIgnoreCase("done")) {
					break;
				}
				try {
					int itemNumber = Integer.parseInt(input);
					MenuItem selectedItem = null;
					for (MenuItem item : selectedMenu.menuItems) {
						if (item.itemNumber == itemNumber) {
							selectedItem = item;
							break;
						}
					}
					if (selectedItem != null) {
						order.add(selectedItem);
						System.out.println("Added " + selectedItem.itemName + " to your order.");
					} else {
						System.out.println("Invalid item number. Please try again.");
					}
				} catch (NumberFormatException e) {
					System.out.println("Invalid input. Please enter a valid item number or 'done' to finish.");
				}
			}

			if (order.isEmpty()) {
				System.out.println("No items were ordered. Exiting...");
				return;
			}

			System.out.println("\nOrder Summary:");
			double totalBeforeDiscount = 0;
			for (MenuItem item : order) {
				System.out.println(item);
				totalBeforeDiscount += item.itemPrice;
			}

			double discount = customer.getDiscount();
			double totalAfterDiscount = totalBeforeDiscount * (1 - discount);

			double serviceCharge = 0;
			if (dineInMenu == selectedMenu) {
				serviceCharge = totalAfterDiscount * 0.025; // 2.5% service charge for dine-in
			}

			double totalAmount = totalAfterDiscount + serviceCharge;

			System.out.println("\nTotal before discount: $" + String.format("%.2f", totalBeforeDiscount));
			System.out.println(
					"Discount (" + (discount * 100) + "%): $" + String.format("%.2f", totalBeforeDiscount * discount));
			System.out.println("Service charge: $" + String.format("%.2f", serviceCharge));
			System.out.println("Total amount due: $" + String.format("%.2f", totalAmount));

			System.out.println("\nThank you for your order!");
		}
		else {
			System.out.println("Application Exiting....!");
			System.out.println("BYE!");
		}
	}
}
