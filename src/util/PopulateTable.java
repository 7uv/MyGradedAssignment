package util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import core.PopulateTableCore;
import db.CreateDB;

public class PopulateTable implements PopulateTableCore {
	String query, query1, query2, hotelGuests, travelDocs = "";
	int rv = 0;
	CreateDB cdb = new CreateDB();
	ResultSet rs = null;

	public PopulateTable() {

	}

	public void read() {
		// Read operations
		// System.out.println("Attempting to read table");
		hotelGuests = "SELECT * FROM hotel_guests";
		travelDocs = "SELECT * FROM travel_docs";
		try (Connection conn = cdb.ds.getConnection(); Statement stmt = conn.createStatement();) {
			// All hotel_guests rows
			rs = null;
			rs = stmt.executeQuery(hotelGuests);
			while (rs.next()) {
				int id = rs.getInt("ID");
				String name = rs.getString("NAME");
				// System.out.println("Result: ID = " + id + ", NAME = " + name);
			}
			// System.out.println("All hotel guests retrieved.");
			
			// All travel_docs rows
			rs = null;
			rs = stmt.executeQuery(travelDocs);
			while (rs.next()) {
				String id = rs.getString("ID");
				String description = rs.getString("DESCRIPTION");
				// System.out.println("Result: ID = " + id + ", DESCRIPTION = " + description);
			}
			// System.out.println("All travel docs retrieved.");
		} catch (SQLException e) {
			e.printStackTrace();
			System.exit(0);
		}
	}
	
	public void insert() {
		hotelGuests = "INSERT INTO `hotel_guests` (`ID`, `Name`, `RoomNo`, `GuestType`, `DiscountCode`, `GroupSize`, `SHNdays`, `TravelDocID`) VALUES"
				+ "(1, 'Tan Wah Piow', '02-68', 'STC', 'SR4501', 4, NULL, ''),"
				+ "(2, 'Jamie Chan', '04-22', 'SHN', '', NULL, 21, 'TD01'),"
				+ "(3, 'Deepa Rani', '04-24', 'SHN', '', NULL, 14, 'TD02'),"
				+ "(4, 'Salmah Kassim', '07-54', 'STC', 'SR4005', 6, NULL, ''),"
				+ "(5, 'John Rosario', '03-72', 'STC', 'SR4982', 2, NULL, '');";
		travelDocs = "INSERT INTO `travel_docs` (`ID`, `Description`) VALUES"
				+ "('TD01', 'Singaporean'),"
				+ "('TD02', 'Singapore PR'),"
				+ "('TD03', 'Employment Pass'),"
				+ "('TD04', 'Work Permit'),"
				+ "('TD05', 'Student pass');";		
		
		try (Connection conn = cdb.ds.getConnection(); Statement stmt = conn.createStatement();) {
			rv = stmt.executeUpdate(hotelGuests);
			// System.out.println("hostel_guests insert statement returned " + rv);
			
			rv = stmt.executeUpdate(travelDocs);
			// System.out.println("travel_docs insert statement returned " + rv);
		} catch (SQLException e) {
			e.printStackTrace();
			System.exit(0);
		}
		// System.out.println("Reading inserted items");
		read();
	}

	/*
	 * Only applying test updates for future implementation
	 */
	public void update() {
		// Update operations
		// System.out.println("Attempting to update a row");
		query = "UPDATE test SET NAME = 'Poopsie' WHERE NAME = 'Sharon'";
		try (Connection conn = cdb.ds.getConnection(); Statement stmt = conn.createStatement();) {
			rv = stmt.executeUpdate(query);
			// System.out.println("executeUpdate() returned " + rv);
		} catch (SQLException e) {
			e.printStackTrace();
			System.exit(0);
		}
		//read();
	}

	/*
	 * Only applying test deletes for future implementation
	 */
	public void delete() {
		// Delete operations
		// System.out.println("Attempting to delete a row from test table");
		query = "DELETE FROM test WHERE NAME = 'Shane'";
		try (Connection conn = cdb.ds.getConnection(); Statement stmt = conn.createStatement();) {
			rv = stmt.executeUpdate(query);
			// System.out.println("executeUpdate() returned " + rv);
		} catch (SQLException e) {
			e.printStackTrace();
			System.exit(0);
		}
		//read();
	}
}
