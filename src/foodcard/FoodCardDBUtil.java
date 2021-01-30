package foodcard;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;


public class FoodCardDBUtil {
	static List<Food> getFoodItems() throws SQLException, ClassNotFoundException {
		List<Food> ans = new ArrayList<>();
		String url = "jdbc:mysql://localhost:3306/foodcart?useSSL=false";
		String user = "root";
		String pass = "newrootpassword";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection(url, user, pass);
		
		Statement statement = connection.createStatement();
		
		ResultSet result = statement.executeQuery("select * from food");
		
		while (result.next()) {
			int id = result.getInt(1);
			String item = result.getString(2);
			int price = result.getInt(3);
			Food food = new Food(id,item,price);
			ans.add(food);
		}
		return ans;
	}
}
