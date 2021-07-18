package service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import core.DbOperationsCore;
import db.CreateDB;

public class DbOperationsService implements DbOperationsCore{
	String shnGuests, stcGuests;
	int rv = 0;
	CreateDB cdb = new CreateDB();
	ResultSet rs = null;
	
	public DbOperationsService() {
		
	}
	
	@Override
	public void readSHNGuests() {
		System.out.println("Attempting to read SHN Guests");
		shnGuests = "SELECT * FROM hotel_guests where `GuestType`='SHN';";
		try (Connection conn = cdb.ds.getConnection(); Statement stmt = conn.createStatement();) {			
			// All hotel_guests rows
			rs = stmt.executeQuery(shnGuests);
			while (rs.next()) {
				int id = rs.getInt("ID");
				String name = rs.getString("NAME");
				System.out.println("Result: ID = " + id + ", NAME = " + name);
			}
			System.out.println("All rows retrieved.");		
		} catch (SQLException e) {
			e.printStackTrace();
			System.exit(0);
		}
	}

	@Override
	public void readSTCGuests() {
		System.out.println("Attempting to read STC Guests");
		stcGuests = "SELECT * FROM hotel_guests where `GuestType`='STC';";
		try (Connection conn = cdb.ds.getConnection(); Statement stmt = conn.createStatement();) {			
			// All hotel_guests rows
			rs = stmt.executeQuery(stcGuests);
			while (rs.next()) {
				int id = rs.getInt("ID");
				String name = rs.getString("NAME");
				System.out.println("Result: ID = " + id + ", NAME = " + name);
			}
			System.out.println("All rows retrieved.");		
		} catch (SQLException e) {
			e.printStackTrace();
			System.exit(0);
		}
		
	}
}
