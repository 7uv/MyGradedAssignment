package db;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
	CreateDB cdb = new CreateDB();
	public CreateTable() {
		String query = "CREATE TABLE IF NOT EXISTS test ( " + "ID INTEGER PRIMARY KEY, " + "NAME TEXT NOT NULL )";
		try (Connection conn = cdb.ds.getConnection(); Statement stmt = conn.createStatement();) {
			int rv = stmt.executeUpdate(query);
			System.out.println("create table test returned " + rv);
		} catch (SQLException e) {
			e.printStackTrace();
			System.exit(0);
		} finally {
			System.out.println("table creation completed");
		}
	}
}
