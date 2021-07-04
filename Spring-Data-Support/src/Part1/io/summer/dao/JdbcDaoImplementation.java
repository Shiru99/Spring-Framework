package Part1.io.summer.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import JDBC.io.summer.model.Circle;

/**
 * @implNote : Data Access Object (DAO)
 */
public class JdbcDaoImplementation {
    public Circle getCircle(int circleID) {

        Connection connection = null;
        Circle circle = null;
        String dbURL = "jdbc:postgresql://localhost:5432/dbname";
        String user = "Shiru99";
        String pass = "1234";
        String query = "SELECT * FROM circle where id=?";

        try {

            connection = DriverManager.getConnection(dbURL, user, pass);
            System.out.println("Connected to PostgreSQL database!");

            PreparedStatement pStatement = connection.prepareStatement(query);
            pStatement.setInt(1, circleID);

            ResultSet resultSet = pStatement.executeQuery();

            while (resultSet.next()) {
                circle = new Circle(
                    Integer.parseInt(resultSet.getString("id")),
                    resultSet.getString("name")
                );
            }

            resultSet.close();
            pStatement.close();
        } 
        catch (SQLException e) 
        {
            System.out.println("Connection failure");
            e.printStackTrace();
        } 
        finally 
        {
            try {
                connection.close();
                System.out.println("Connection closed");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return circle;
    }
}
