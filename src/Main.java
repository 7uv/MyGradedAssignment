
import bin.c209_ESE.ViewGuests;
import db.CreateDB;
import db.CreateTable;
import service.CleanUpService;
import util.PopulateTable;

public class Main {
    @SuppressWarnings("unused")
	public static void main(String[] args) {
		// System.out.println("==== PROGRAM START ====");
		
		// Database initialization
		// System.out.println("CreateDB");
		CreateDB cdb = new CreateDB();
		
		// Initial cleanup
		// System.out.println("CleanUpService");
		CleanUpService cs = new CleanUpService();
		
		// Create all tables afresh
		// System.out.println("CreateTable");
		CreateTable ctbl = new CreateTable();
		
		// Populate the table with sample values provided in question
		// System.out.println("TableOperations");
		PopulateTable tbo = new PopulateTable();
		tbo.insert();
		
		// not required by the question 
		//tbo.update();
		//tbo.delete();
		
		// Call to ViewGuests
		// System.out.println("ViewGuests");
		ViewGuests vg = new ViewGuests();
		
		// Final cleanup
		// System.out.println("CleanUpService");
		CleanUpService csFinal = new CleanUpService();
    	
		// System.out.println("==== ::PROGRAM END:: ====");
    }
}
