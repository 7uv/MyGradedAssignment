package service;

import db.DropTable;

public class CleanUpService {
	@SuppressWarnings("unused")
	public CleanUpService() {
		// Drop all database tables
		DropTable dtbl = new DropTable();
	}
}
