package c209_ESE;
/**
 * I declare that this code was written by me. I will not copy or allow others
 * to copy my code. I understand that copying code is considered as plagiarism.
 *
 * 16035558, 24 June 2021 12:35:22 pm
 */

public class STCGuest extends Guest {
	
	private String discode;
	private int groupsize;

	public STCGuest(int id, String name, String roomNo, String guestType, String discode, int groupsize) {
		super(id,name,roomNo,guestType);
		
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
		System.out.println("Discount Code: " + discode);
		System.out.println("Group Size: " + groupsize);
		
	}
	
}
