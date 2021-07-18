package db;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DropTable {
	CreateDB cdb = new CreateDB();
	int rv = 0;
	public DropTable() {		
		System.out.println( "Attempting to drop table test" );
		String query = "DROP TABLE IF EXISTS test";
		String hotelGuests = "DROP TABLE IF EXISTS hotel_guests";
		String travelDocs = "DROP TABLE IF EXISTS travel_docs";
		
		try ( Connection conn = cdb.ds.getConnection();
				Statement stmt = conn.createStatement(); ) {
			int rv = stmt.executeUpdate( query );
			System.out.println( "drop table test returned " + rv );
			
			rv = stmt.executeUpdate(hotelGuests);
			System.out.println("drop table hotel_guests returned " + rv);
			
			rv = stmt.executeUpdate(travelDocs);
			System.out.println("drop table travel_docs returned " + rv);
		} catch ( SQLException e ) {
			e.printStackTrace();
			System.exit( 0 );
		}
	}
}