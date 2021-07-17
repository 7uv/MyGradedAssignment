package db;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DropTable {
	CreateDB cdb = new CreateDB();
	public DropTable() {		
		System.out.println( "Attempting to drop table test" );
		String query = "DROP TABLE IF EXISTS test";
		try ( Connection conn = cdb.ds.getConnection();
				Statement stmt = conn.createStatement(); ) {
			int rv = stmt.executeUpdate( query );
			System.out.println( "drop table test returned " + rv );
		} catch ( SQLException e ) {
			e.printStackTrace();
			System.exit( 0 );
		}
	}
}