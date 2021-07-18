
import bin.c209_ESE.ViewGuests;
import db.CreateDB;
import db.CreateTable;
import service.CleanUpService;
import service.TableOperations;

public class Main {
    @SuppressWarnings("unused")
	public static void main(String[] args) {
		System.out.println("==== PROGRAM START ====");
		
		// Database initialization
		System.out.println("CreateDB");
		CreateDB cdb = new CreateDB();
		System.out.println("CleanUpService");
		CleanUpService cs = new CleanUpService();
		System.out.println("CreateTable");
		CreateTable ctbl = new CreateTable();
		
		// Table operations
		System.out.println("TableOperations");
		TableOperations tbo = new TableOperations();
		tbo.insert();
		tbo.update();
		tbo.delete();
		
		// Call to ViewGuests
		System.out.println("ViewGuests");
		ViewGuests vg = new ViewGuests();
		
		// Final cleanup
		System.out.println("CleanUpService");
		CleanUpService csFinal = new CleanUpService();
    	
		System.out.println("==== ::PROGRAM END:: ====");
    }
}
