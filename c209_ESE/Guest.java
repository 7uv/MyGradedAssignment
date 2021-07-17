package c209_ESE;
/**
 * I declare that this code was written by me. I will not copy or allow others
 * to copy my code. I understand that copying code is considered as plagiarism.
 *
 * 16035558, 24 June 2021 1:28:03 pm
 */

public abstract class Guest {
    private int id;
	private String name;
	private String roomNo;
	private String guestType;
	
	public Guest(int id, String name, String roomNo, String guestType) {
		this.id = id;
		this.name = name;
		this.roomNo = roomNo;
		this.guestType = guestType;
	}
	
	
	
	public int getID() {
		return id;
	}
	
	public void setID(int id) {
		this.id = id;
		
	}
	public String getName() {
		return name;
		
	}
	
	public void setName(String name) {
		this.name = name;
		
	}
		
	public String getRoomNo() {
		return roomNo;
	}
	
		public void setRoomNo(String roomNo) {
			this.roomNo = roomNo;
			
}
	public String getGuestType() {
		return guestType;

 }
	
	public void setGuestType(String guestType) {
		this.guestType = guestType;
	
	}
	
	public abstract void display();



	
	
}
	
	
