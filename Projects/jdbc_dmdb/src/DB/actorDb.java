package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

import model.Actor;


public class actorDb {
	//1) Establish connection
	private Connection getConnection() throws SQLException {
        String dbUrl = "jdbc:mysql://localhost:3306/bmdb?useSSL = false";
        String username = "bmdb_user";
        String password = "sesame";
        
        
        Connection connection = DriverManager.getConnection(dbUrl, username, password);
        return connection;
    }
	
	public List<Actor> GetAll(){
		List<Actor> actors = new ArrayList<>();
		try{
			//get connection
		
		Connection conn = getConnection();
		//create sql statement (prepared statement)
		String sql = "SELECT * FROM Actor";
		PreparedStatement ps = conn.prepareStatement ( sql);
		//execute a query
		ResultSet rs = ps.executeQuery();
		
		//parse result set into Java 'Actor' objects
		//rs.next() says give me next 
		while (rs.next() ) {
			//note that you can pull fields out of a result set either by column number, column name, gender, bdate
			int id = rs.getInt(1);
			String firstName = rs.getString("FirstName");
			String lastName = rs.getString(3);
			String gender = rs.getString(4);
			Date bdate = rs.getDate(5);
			Actor a = new Actor (id, firstName, lastName, bdate, gender);
			actors.add(a);
			
		}
		
		} catch (SQLException sqle) {
			System.out.println("Error getting actors");
			System.out.println("sqle");
		}
		//return a list of actors
		return actors;
	}

}
