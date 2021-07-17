package bin.c209_ESE;

/**
 * I declare that this code was written by me. I will not copy or allow others
 * to copy my code. I understand that copying code is considered as plagiarism.
 *
 * 16035558, 24 June 2021 2:29:12 pm
 */

import java.util.ArrayList;

import core.Guest;
import service.SHNGuest;
import service.STCGuest;
import util.Helper;

public class ViewGuests {
	public ViewGuests() {
		System.out.println("==== START OF EXECUTION ====");
		
		
		
		
		System.out.println("==== :: END OF EXECUTION :: ====");
	}
	public static void main(String[] args) {
		ArrayList<Guest> guestList = new ArrayList<Guest>();

		SHNGuest shn1 = new SHNGuest(3, "Deepa Rani", "04-24", "SHN", 14, "Singapore PR");
		SHNGuest shn2 = new SHNGuest(2, "Jamie Chan", "04-22", "SHN", 21, "Singaporean");

		STCGuest stc1 = new STCGuest(1, "Tan Wah Piow", "02-68", "STC", "SR4501", 4);
		STCGuest stc2 = new STCGuest(4, "Salmah Kassim", "07-54", "STC", "SR4005", 6);
		STCGuest stc3 = new STCGuest(5, "John Rosario", "03-72", "STC", "SR4982", 2);

		guestList.add(shn1);
		guestList.add(shn2);
		guestList.add(stc1);
		guestList.add(stc2);
		guestList.add(stc3);
		
		
	}

	/*private void start() {
		int option = -1;

		while (option != 4) {

			mainMenu();
			option = Helper.readInt("Enter choice > ");
			if (option == 1) {
				viewAllGuest(guestList);
			} else if (option == 2) {
				viewSTCGuest(guestList);
			} else if (option == 3) {
				viewSHNGuest(guestList);
			} else if (option == 4) {
				System.out.println("GoodBye!");
			} else {
				System.out.println("Invalid option!");
			}

		}
	}*/

	private static void viewSHNGuest(ArrayList<Guest> guestList) {
		// TODO Auto-generated method stub

		String output = "";
		output += String.format("-20s%-10s\n", "REG ID", "NAME", "ROOM NO", "GUEST TYPE", "DAYS TO SERVE",
				"TRAVEL DOC");
		for (Guest i : guestList) {
			output += String.format("-20s%-10.2f\n", i.getID(), i.getName(), i.getRoomNo(), i.getGuestType());
		}
		System.out.println(output);

	}

	private static void viewSTCGuest(ArrayList<Guest> guestList) {
		// TODO Auto-generated method stub
		String output = "";
		output += String.format("-20s%-10s\n", "REG ID", "NAME", "ROOM NO", "GUEST TYPE", "DAYS TO SERVE",
				"TRAVEL DOC");
		for (Guest i : guestList) {
			output += String.format("-20s%-10.2f\n", i.getID(), i.getName(), i.getRoomNo(), i.getGuestType());
		}
		System.out.println(output);
	}

	private static void viewAllGuest(ArrayList<Guest> guestList) {
		// TODO Auto-generated method stub

	}

	private static void mainMenu() {
		// TODO Auto-generated method stub

		Helper.line(50, "=");
		System.out.println("HOTEL GUEST APP");
		Helper.line(50, "=");
		System.out.println("1. View All Guests");
		System.out.println("2. View Staycation Guests");
		System.out.println("3. View SHN Guests");
		System.out.println("4. Quit");

	}

}
