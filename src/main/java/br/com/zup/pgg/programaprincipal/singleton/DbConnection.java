package br.com.zup.pgg.programaprincipal.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
public static Connection connection = null;
	
	
	private DbConnection() {

	}
	
	public static Connection getConnection() {
		try {
			if(connection == null || connection.isClosed()) {
				
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pgg?user=root&password=root");
			}
		} catch (Exception e) {
			
		}
		return connection;
		
	}
	public static void close(Connection connection)
    {
        try {
            if (connection != null) {
                connection.close();
                connection=null;
            }
		} catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
