package c209_ESE;

public abstract class Guest {
    private int id;
	private String name;
	private int roomNo;
	private String guestType;
	
	
	
	}
	
	public int getID() {
		return id;
	}
	
	public String getName() {
		return name;
		
	}
	
	public int getRoomNo() {
		return roomNo;

}
	public String getGuestType() {
		return guestType;

 }
	
	public abstract void display();
  }
