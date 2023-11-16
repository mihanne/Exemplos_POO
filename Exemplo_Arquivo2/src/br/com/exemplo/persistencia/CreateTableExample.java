package br.com.exemplo.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTableExample {

	private final String url = "jdbc:postgresql://localhost/BDlivrariaUniversitaria";
	private final String user = "postgres";
	private final String password = "";

    private static final String createTableSQL = "CREATE TABLE users " +
        "(ID INT PRIMARY KEY ," +
        " NAME TEXT, " +
        " EMAIL VARCHAR(50), " +
        " COUNTRY VARCHAR(50), " +
        " PASSWORD VARCHAR(50))";

    public static void main(String[] argv) throws SQLException {
        CreateTableExample createTableExample = new CreateTableExample();
        createTableExample.createTable();
    }

    public void createTable() throws SQLException {

        System.out.println(createTableSQL);
        // Step 1: Establishing a Connection
        try (Connection connection = DriverManager.getConnection(url, user, password);

            // Step 2:Create a statement using connection object
            Statement statement = connection.createStatement();) {

            // Step 3: Execute the query or update query
            statement.execute(createTableSQL);
        } catch (SQLException e) {

            // print SQL exception information
            printSQLException(e);
        }
    }

    public static void printSQLException(SQLException ex) {
        for (Throwable e: ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
}
