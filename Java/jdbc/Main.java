package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    private static final String jdbcURL = "jdbc:mysql://localhost:3306/library";
    private static final String username = "root";
    private static final String password = "test123";
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        Connection connection = null;

        try {
            // Establish a connection
            connection = DriverManager.getConnection(jdbcURL, username, password);
            logger.info("Connected to the database!");

            // Perform CRUD operations
            addBook(connection, "The Great Gatsby", "F. Scott Fitzgerald", "1925-04-10", "Fiction");
            addBook(connection, "To Kill a Mockingbird", "Harper Lee", "1960-07-11", "Classic");
            viewBooks(connection);
            updateBookGenre(connection, 1, "Modern Fiction"); // Update genre for book with ID 1
            deleteBook(connection, 2); // Delete book with ID 2
            viewBooks(connection);

        } catch (Exception e) {
            logger.log(Level.SEVERE, "An error occurred while connecting to the database or performing operations.", e);
        } finally {
            // Close the connection
            closeConnection(connection);
        }
    }

    // Create: Add a new book
    public static void addBook(Connection connection, String title, String author, String publicationDate, String genre) {
        String insertQuery = "INSERT INTO books (title, author, publication_date, genre) VALUES (?, ?, ?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
            preparedStatement.setString(1, title);
            preparedStatement.setString(2, author);
            preparedStatement.setString(3, publicationDate);
            preparedStatement.setString(4, genre);
            preparedStatement.executeUpdate();
            logger.info("Book added successfully: " + title);
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Failed to add book: " + title, e);
        }
    }

    // Read: View all books
    public static void viewBooks(Connection connection) {
        String selectQuery = "SELECT * FROM books";
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(selectQuery)) {
            logger.info("Fetching book records...");
            while (resultSet.next()) {
                logger.info("ID: " + resultSet.getInt("id") +
                        ", Title: " + resultSet.getString("title") +
                        ", Author: " + resultSet.getString("author") +
                        ", Publication Date: " + resultSet.getDate("publication_date") +
                        ", Genre: " + resultSet.getString("genre"));
            }
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Failed to fetch book records.", e);
        }
    }

    // Update: Update a book's genre
    public static void updateBookGenre(Connection connection, int id, String newGenre) {
        String updateQuery = "UPDATE books SET genre = ? WHERE id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(updateQuery)) {
            preparedStatement.setString(1, newGenre);
            preparedStatement.setInt(2, id);
            int rowsAffected = preparedStatement.executeUpdate();
            logger.info(rowsAffected + " book(s) updated successfully.");
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Failed to update book with ID: " + id, e);
        }
    }

    // Delete: Remove a book by ID
    public static void deleteBook(Connection connection, int id) {
        String deleteQuery = "DELETE FROM books WHERE id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery)) {
            preparedStatement.setInt(1, id);
            int rowsAffected = preparedStatement.executeUpdate();
            logger.info(rowsAffected + " book(s) deleted successfully.");
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Failed to delete book with ID: " + id, e);
        }
    }

    // Utility method to close the connection
    private static void closeConnection(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
                logger.info("Database connection closed.");
            } catch (Exception e) {
                logger.log(Level.WARNING, "Failed to close the database connection.", e);
            }
        }
    }
}
