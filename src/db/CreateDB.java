package db;

import org.sqlite.SQLiteDataSource;

public class CreateDB {
	public SQLiteDataSource ds = null;
	public CreateDB() {
		try {
			ds = new SQLiteDataSource();
			ds.setUrl("jdbc:sqlite:MY_GRAD_ASSN.db");
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		}
		// System.out.println("Opened database connections successfully");
	}
}
