package service;

import core.Guest;

/**
 * I declare that this code was written by me. I will not copy or allow others
 * to copy my code. I understand that copying code is considered as plagiarism.
 *
 * 16035558, 24 June 2021 1:17:22 pm
 */

public class SHNGuest extends Guest{
	
	private int daysServe;
	private String travelDoc;
	

	public SHNGuest(int id, String name, String roomNo, String guestType, int daysServe,String travelDoc) {
		super(id,name,roomNo,guestType);
		
		this.daysServe= daysServe;
		this.travelDoc = travelDoc;
	}
	
	public int getDaysServe() {
		return daysServe;
		
	}
	
	public String getTravelDoc() {
		return travelDoc;
		
	}

	@Override
	public void display() {
		System.out.println("Days Serving: " + daysServe);
		System.out.println("Travel Document: " + travelDoc);
	}
	
}
