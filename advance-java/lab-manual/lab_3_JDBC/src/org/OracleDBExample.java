package org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class OracleDBExample {
	public static void main(String[] args) {
		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			System.out.println("connection established..");

			Connection connection = DriverManager
					.getConnection("jdbc:odbc:oracle","system","admin");
			Statement statement = connection.createStatement();

			ResultSet resultSet = statement.executeQuery("select * from studentdata");

			while (resultSet.next()) {
				System.out.println(resultSet.getString(1) + "  "
						+ resultSet.getString(2));

			}
			connection.close();
		} catch (Exception e) {
		}
	}

}
