package db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TableOperations {
	String query, query1, query2 = "";
	int rv = 0;

	public TableOperations() {
		// Initialize database
		CreateDB cdb = new CreateDB();

		// Insert operations
		query1 = "INSERT INTO test ( NAME ) VALUES ( 'Shane' )";
		query2 = "INSERT INTO test ( NAME ) VALUES ( 'Sharon' )";
		try (Connection conn = cdb.ds.getConnection(); Statement stmt = conn.createStatement();) {
			rv = stmt.executeUpdate(query1);
			System.out.println("1st executeUpdate() returned " + rv);

			rv = stmt.executeUpdate(query2);
			System.out.println("2nd executeUpdate() returned " + rv);
		} catch (SQLException e) {
			e.printStackTrace();
			System.exit(0);
		}

		// Read operations
		System.out.println("Attempting to read a row in test table");
		query = "SELECT * FROM test";
		try (Connection conn = cdb.ds.getConnection(); Statement stmt = conn.createStatement();) {
			ResultSet rs = stmt.executeQuery(query);

			while (rs.next()) {
				int id = rs.getInt("ID");
				String name = rs.getString("NAME");
				System.out.println("Result: ID = " + id + ", NAME = " + name);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.exit(0);
		}

		// Update operations
		System.out.println("Attempting to update a row in test table");
		query = "UPDATE test SET NAME = 'Poopsie' WHERE NAME = 'Sharon'";
		try (Connection conn = cdb.ds.getConnection(); Statement stmt = conn.createStatement();) {
			rv = stmt.executeUpdate(query);
			System.out.println("executeUpdate() returned " + rv);
		} catch (SQLException e) {
			e.printStackTrace();
			System.exit(0);
		}

		// Read operations
		System.out.println("Attempting to read a row in test table");
		query = "SELECT * FROM test";
		try (Connection conn = cdb.ds.getConnection(); Statement stmt = conn.createStatement();) {
			ResultSet rs = stmt.executeQuery(query);

			while (rs.next()) {
				int id = rs.getInt("ID");
				String name = rs.getString("NAME");
				System.out.println("Result: ID = " + id + ", NAME = " + name);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.exit(0);
		}

		// Delete operations
		System.out.println("Attempting to delete a row from test table");
		query = "DELETE FROM test WHERE NAME = 'Shane'";
		try (Connection conn = cdb.ds.getConnection(); Statement stmt = conn.createStatement();) {
			rv = stmt.executeUpdate(query);
			System.out.println("executeUpdate() returned " + rv);
		} catch (SQLException e) {
			e.printStackTrace();
			System.exit(0);
		}

		// Read operations
		System.out.println("Attempting to read a row in test table");
		query = "SELECT * FROM test";
		try (Connection conn = cdb.ds.getConnection(); Statement stmt = conn.createStatement();) {
			ResultSet rs = stmt.executeQuery(query);

			while (rs.next()) {
				int id = rs.getInt("ID");
				String name = rs.getString("NAME");
				System.out.println("Result: ID = " + id + ", NAME = " + name);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.exit(0);
		}
	}
}
