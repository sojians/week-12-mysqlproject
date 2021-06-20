package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import entity.Restaurants;


public class RestaurantsDao {

	public static List<Restaurants> findResta() {
	 	try(Connection connection = DbConnection.getConnection();) {
			String sql = "SELECT * FROM restaurant ORDER BY restaurant_id";
			
			try(PreparedStatement statement = connection.prepareStatement(sql)) {
				try(ResultSet rs = statement.executeQuery()) {
					List<Restaurants> restaurants = new LinkedList<>();
					
					while(rs.next()) {
						int restaId = rs.getInt("restaurant_id");
						String restaName = rs.getString("resta_name");
						String visitDate = rs.getString("visit_date");
						String restaCity = rs.getString("resta_city");
						int restaScore = rs.getInt("resta_score");
						
						Restaurants restaurant = new Restaurants(restaId, restaName, visitDate, restaCity, restaScore);
						restaurants.add(restaurant);
					}
					return restaurants;
				}
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	
	public static void updateResta(int restaId, String restaName, String restaCity, String visitDate, int restaScore) {
		try(Connection connection = DbConnection.getConnection()) {
			String sql = "UPDATE restaurant SET resta_name = ? WHERE resta_id = ?";
			try(PreparedStatement statement = connection.prepareStatement(sql)){
				statement.setString(1, restaName);
				statement.setInt(2, restaId);

				statement.executeUpdate();
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public static void deleteResta(int restaId) {
		try(Connection connection = DbConnection.getConnection()) {
			String sql = "DELETE FROM restaurant WHERE resta_id = ?";
			try(PreparedStatement statement = connection.prepareStatement(sql)){
				statement.setInt(1, restaId);
				statement.executeUpdate();
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public static void createResta(String restaName, String restaCity, String visitDate, int restaScore) {
		String sql = "INSERT INTO restaurants (resta_name, resta_city, visit_date, resta_score) VALUES (?, ?, ?, ?)";
		try(Connection connection = DbConnection.getConnection()) {
			try(PreparedStatement statement = connection.prepareStatement(sql)) {
				statement.setString(1, restaName);
				statement.setString(2, restaCity);
				statement.setString(3, visitDate);
				statement.setInt(4, restaScore);
				statement.executeUpdate();
			}
		} catch (SQLException e ) {
			throw new RuntimeException(e);
		}
	}
}