package com.techelevator;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class VendingMachineCLI {

	private static final String MAIN_MENU_OPTION_DISPLAY_ITEMS = "Display Vending Machine Items";
	private static final String MAIN_MENU_OPTION_PURCHASE = "Purchase";
	private static final String[] MAIN_MENU_OPTIONS = { MAIN_MENU_OPTION_DISPLAY_ITEMS, MAIN_MENU_OPTION_PURCHASE };

	private static final String FEED_MONEY = "Feed Money";
	private static final String SELECT_ITEM = "Select Item";
	private static final String FINISH_PURCHASE = "Finish Purchase";
	private static final String[] PURCHASE_MENU_OPTIONS = { FEED_MONEY, SELECT_ITEM, FINISH_PURCHASE };

	private static final String ONE_DOLLAR = "$1";
	private static final String TWO_DOLLAR = "$2";
	private static final String FIVE_DOLLAR = "$5";
	private static final String TEN_DOLLAR = "$10";
	private static final String[] DOLLAR_MENU_OPTIONS = { ONE_DOLLAR, TWO_DOLLAR, FIVE_DOLLAR, TEN_DOLLAR };

	Money money = new Money();
	private String price;
	private Menu menu;
	private int itemCount;
	Scanner scanner = new Scanner(System.in);

	public VendingMachineCLI(Menu menu) {
		this.menu = menu;

	}

	public void run() {
		while (true) {
			String choice = (String) menu.getChoiceFromOptions(MAIN_MENU_OPTIONS);

			Map<String, List<Item>> map;

			Inventory inventory = new Inventory();
			map = inventory.fillInventory();
			if (choice.equals(MAIN_MENU_OPTION_DISPLAY_ITEMS)) {
				// display vending machine items



				for (Map.Entry<String, List<Item>> entry : map.entrySet()) {
					List<Item> items = entry.getValue();
					Item item = items.get(0);
					System.out.println(entry.getKey() + " " + item.getItemName() + " " + item.getItemPrice());
				}

			} else if (choice.equals(MAIN_MENU_OPTION_PURCHASE)) {
				// do purchase
				while (true) {
					String secondChoice = (String) menu.getChoiceFromOptions(PURCHASE_MENU_OPTIONS);

					if (secondChoice.equals(FEED_MONEY)) {
						String thirdChoice = (String) menu.getChoiceFromOptions(DOLLAR_MENU_OPTIONS);

						String fourthChoice = scanner.nextLine();

						if (fourthChoice.equals("1")) {
							money.moneyIn(1.00);
						} else if (fourthChoice.equals("2")) {
							money.moneyIn(2.00);
						} else if (fourthChoice.equals("3")) {
							money.moneyIn(5.00);
						} else if (fourthChoice.equals("4")) {
							money.moneyIn(10.00);
						} else {
							menu.printOutNotValid();
						}
							menu.printOutBalance(money.getBalance());
					}
					if (secondChoice.equals(SELECT_ITEM)) {

						menu.promptSelection();;
						String selection = scanner.nextLine();


						for (Map.Entry<String, List<Item>> entry : map.entrySet()) {
							List<Item> items = entry.getValue();
							Item item = items.get(0);
							if (selection.equals(entry.getKey())) {

							if (item.getItemCount() > 0) {	
								item.decreaseQuantity();
								itemCount = item.getItemCount(); 
								price = item.getItemPrice();
								money.purchaseAmountIn(Double.parseDouble(price));
								menu.printOutItemCount(itemCount);
								menu.printOutBalance(money.getBalance());
								menu.printOutChargeTotal(money.getPurchaseAmount());
								break;

							}else {
								menu.printOutNotValid();
							}
							}
						}
//						menu.printOutBalance(money.getBalance());
//						menu.printOutChargeTotal(money.getPurchaseAmount());
					}
					if (secondChoice.equals(FINISH_PURCHASE)) {
						double changeMoney = money.getBalance() - money.getPurchaseAmount();
						
						menu.printOutChange(changeMoney);
						money.endTransactionSetToZero();
						
					}
				}

			}
		}
	}
	
	public static void main(String[] args) {
		Menu menu = new Menu(System.in, System.out);
		VendingMachineCLI cli = new VendingMachineCLI(menu);
		cli.run();
	}

	public static String[] getDollarMenuOptions() {
		return DOLLAR_MENU_OPTIONS;
	}
}
