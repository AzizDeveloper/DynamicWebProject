package foxmindedinstrumentariy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DatabaseFacade {

	public static List<String> getBooks(){
		
		List<String> result = new ArrayList<String>();
		
		try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres",
				"postgres", "1234")) {
			System.out.println("Java JDBC PostgreSQL Example");
			String query = "SELECT * FROM books.books";
			
			System.out.println("Connected to PostgreSQL database!");
			Statement statement = connection.createStatement();
			
			System.out.println("After Statement");
		
			ResultSet resultSet = statement.executeQuery(query);
			//SELECT * FROM customer;
			
			System.out.println("After ResultSet");
			while (resultSet.next()) {
				result.add(resultSet.getString("name"));
				
			}
			
			System.out.println("After while");
		} catch (SQLException e) {
			System.out.println("Connection failure.");
			e.printStackTrace();
		}
		return result;
	}
}
