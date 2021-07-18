package db;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
	CreateDB cdb = new CreateDB();
	int rv =0;
	public CreateTable() {
		String query = "CREATE TABLE IF NOT EXISTS test ( " + "ID INTEGER PRIMARY KEY, " + "NAME TEXT NOT NULL )";
		String hotelGuests = "CREATE TABLE IF NOT EXISTS `hotel_guests` ("
				+ "  `ID` INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,"
				+ "  `Name` varchar(30) NOT NULL,"
				+ "  `RoomNo` varchar(10) NOT NULL,"
				+ "  `GuestType` varchar(5) NOT NULL,"
				+ "  `DiscountCode` varchar(10) NOT NULL,"
				+ "  `GroupSize` int(11) DEFAULT NULL,"
				+ "  `SHNdays` int(11) DEFAULT NULL,"
				+ "  `TravelDocID` varchar(5) NOT NULL"
				+ ")";
		String travelDocs = "CREATE TABLE IF NOT EXISTS `travel_docs` ("
				+ "  `ID` varchar(10) NOT NULL PRIMARY KEY,"
				+ "  `Description` varchar(30) NOT NULL"
				+ ")";
		
		try (Connection conn = cdb.ds.getConnection(); Statement stmt = conn.createStatement();) {
			rv = stmt.executeUpdate(query);
			System.out.println("create table test returned " + rv);

			rv = stmt.executeUpdate(hotelGuests);
			System.out.println("create table hotel_guests returned " + rv);
			
			rv = stmt.executeUpdate(travelDocs);
			System.out.println("create table travel_docs returned " + rv);

		} catch (SQLException e) {
			e.printStackTrace();
			System.exit(0);
		} finally {
			System.out.println("table creation completed");
		}
	}
}
