package c209_ESE;

public class SHNGuest extends Guest{
	
	private int daysServe;
	private String travelDoc;
	

	public SHNGuest(int id, String name, int roomNo, String guestType, int daysServe,String travelDoc) {
		super(id, name, roomNo, guestType);
		this.daysServe= daysServe;
		this.travelDoc = travelDoc;
		// TODO Auto-generated constructor stub
	}
	
	public int getDaysServe() {
		return daysServe;
		
	}
	
	public String getTravelDoc() {
		return travelDoc;
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
	
}
