package c209_ESE;
/**
 * I declare that this code was written by me. I will not copy or allow others
 * to copy my code. I understand that copying code is considered as plagiarism.
 *
 * 16035558, 24 June 2021 2:29:12 pm
 */

import java.util.ArrayList;
import c209_ESE.Helper;
import c209_ESE.Guest;
import c209_ESE.SHNGuest;
import c209_ESE.STCGuest;



public class ViewGuests {

		private ArrayList<Guest> guestList = new ArrayList<Guest>();
		

		public static void main(String[] args) {

			ViewGuests vg = new ViewGuests();
			vg.start();
		
		}

		private void start() {
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
		}
	

	private static void viewSHNGuest(ArrayList<Guest> guestList) {
		// TODO Auto-generated method stub
		
		String output = "";
		output += String.format("-20s%-10s\n", "REG ID", "NAME", "ROOM NO", "GUEST TYPE", "DAYS TO SERVE", "TRAVEL DOC");
		for (Guest i : guestList) {
			output += String.format("-20s%-10.2f\n", i.getID(), i.getName(), i.getRoomNo(), i.getGuestType());
		}
		System.out.println(output);
		
	}


	private static void viewSTCGuest(ArrayList<Guest> guestList) {
		// TODO Auto-generated method stub
		String output = "";
		output += String.format("-20s%-10s\n", "REG ID", "NAME", "ROOM NO", "GUEST TYPE", "DAYS TO SERVE", "TRAVEL DOC");
		for (Guest i : guestList) {
			output += String.format("-20s%-10.2f\n", i.getID(), i.getName(), i.getRoomNo(), i.getGuestType());
		}
		System.out.println(output);
	}


	private static void viewAllGuest(ArrayList<Guest> guestList) {
		// TODO Auto-generated method stub
		String output = "";
		output += String.format("-20s%-10s\n", "REG ID", "NAME", "ROOM NO", "GUEST TYPE", "DAYS TO SERVE", "TRAVEL DOC");
		for (Guest i : guestList) {
			output += String.format("-20s%-10.2f\n", i.getID(), i.getName(), i.getRoomNo(), i.getGuestType());
		}
		System.out.println(output);
		
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

