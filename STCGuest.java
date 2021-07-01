package c209_ESE;

public class STCGuest extends Guest {
	
	private String discode;
	private int groupsize;

	public STCGuest(int id, String name, int roomNo, String guestType, String discode, int groupsize) {
		super(id, name, roomNo, guestType);
		this.discode = discode;
		this.groupsize = groupsize;
		// TODO Auto-generated constructor stub
		
		}

	public String getDiscode() {
		return discode;


	}
	
	public int getGroupSize() {
		return groupsize;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
	
}