package br.com.exercicio;

import java.sql.*;

public class Consulta {
    //Criar uma classe para realizar as seguintes consultas na tabela Livro:
    // a. Buscar um livro pelo título, considerando o início do texto buscado
    // b. Buscar um livro cujo vl_preco seja maior ou igual a um valor digitado.
    private final String url = "jdbc:postgresql://localhost/BDlivrariaUniversitaria";
    private final String user = "postgres";
    private final String password = "b0aofmd0";

    private static final String QUERY_TITULO = "select * from livro where nm_titulo like ?";
    private static final String QUERY_VALOR = "select * from livro where vl_preco>=?";

    public void BuscaTitulo(String titulo) throws SQLException {
        System.out.println(QUERY_TITULO);

        // Step 1: Establishing a Connection
        try (Connection connection = DriverManager.getConnection(url, user, password);

             // Step 2:Create a statement using connection object
             PreparedStatement preparedStatement = connection.prepareStatement(QUERY_TITULO);) {
            titulo=titulo + "%";
            preparedStatement.setString(1, titulo);
            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                String id = rs.getString("id_isbn");
                String name_titulo = rs.getString("nm_titulo");
                System.out.println(id + " - " + name_titulo);
            }
        } catch (SQLException e) {

            // print SQL exception information
            printSQLException(e);
        }
    }


    public void BuscaValor(Double valor) throws SQLException {
        System.out.println(QUERY_VALOR);

        // Step 1: Establishing a Connection
        try (Connection connection = DriverManager.getConnection(url, user, password);

             // Step 2:Create a statement using connection object
             PreparedStatement preparedStatement = connection.prepareStatement(QUERY_VALOR);) {
            preparedStatement.setDouble(1, valor);
            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                String id = rs.getString("id_isbn");
                String name_titulo = rs.getString("nm_titulo");
                Double valor_livro = rs.getDouble("vl_preco");
                System.out.println(id + " - " + name_titulo + " - " + valor_livro);
            }
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
