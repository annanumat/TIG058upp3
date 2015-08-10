import java.sql.*;

public class MethodDB {
	Connection c;
	Statement s;
	ResultSet rs;

	public Connection createConnection() {
		Connection localConn = null;
                Statement stm = null;

		try { 
	    Class.forName("org.sqlite.myJDBC"); //Sqlite-drivrutin
	} catch (ClassNotFoundException cnfe) {
		System.err.println("Couldn't find driver class:");
		cnfe.printStackTrace();
		System.exit(1);
	}
	System.out.println("Allt OK");
	
	try {
		localConn = DriverManager.getConnection("jdbc:sqlite:mintestdatabas.db");
	} catch (SQLException se) {
		System.out.println("Couldn't connect: print out a stack trace and exit.");
		se.printStackTrace();
		System.exit(1);
	}
	
	if (localConn != null)
		System.out.println("Hooray! We connected to the database!");
	else
		System.out.println("We should never get here.");

	return localConn;
}

public Statement myCreateStatement(Connection c) {
	Statement s = null;

	try {
		s = c.createStatement();
	} catch (SQLException se) {
		System.out.println("We got an exception while creating a statement:" +
			"that probably means we're no longer connected.");
		System.out.println(se.getMessage());
		System.exit(1);
	}
	return s;
}

public ResultSet myCreateResultSet(Statement s) {
	ResultSet rs = null;

	try {
		rs = s.executeQuery("SELECT name, stad FROM person");
	} catch (SQLException se) {
		System.out.println("We got an exception while executing our query:" +
			"that probably means our SQL is invalid");
		System.out.println(se.getMessage());
		System.exit(1);
	}
	return rs;
}

public void printResultSet(ResultSet rs) {
	int index = 0;

	try {
		while (rs.next()) {
			System.out.print("Here's the result of row " + index++ + ": ");
			System.out.println(rs.getString(1) + " som bor i " + rs.getString(2));
		}
	} catch (SQLException se) {
		System.out.println("We got an exception while getting a result:this " +
			"shouldn't happen: we've done something really bad.");
		System.out.println(se.getMessage());
		System.exit(1);
	}

}

public void searchMemberByGivenName(){
// VAD ÄR DETTA?    jButton3.runMe(givenName);
}

public void runMe() {
	c = createConnection();

	s = myCreateStatement(c);

	rs = myCreateResultSet(s);

	printResultSet(rs);

}

}