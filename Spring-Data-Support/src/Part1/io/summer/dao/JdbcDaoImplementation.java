package Part1.io.summer.dao;

import java.sql.Connection;
// import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import Part1.io.summer.model.Circle;

/**
 * @implNote : Data Access Object (DAO)
 */

@Component
public class JdbcDaoImplementation {

    @Autowired
    private DataSource dataSource;

    public DataSource getDataSource() {
        return dataSource;
    }

    public Circle getCircle(int circleID) {

        Connection connection = null;
        Circle circle = null;
        // String dbURL = "jdbc:postgresql://localhost:5432/dbname";
        // String user = "Shiru99";
        // String pass = "1234";
        String query = "SELECT * FROM circle where id=?";

        try {

            // connection = DriverManager.getConnection(dbURL, user, pass);
            connection = dataSource.getConnection();
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



    ////////////////////////////// Using JDBC Template //////////////////////////////

    // private JdbcTemplate jdbcTemplate = new JdbcTemplate();
    private JdbcTemplate jdbcTemplate;


    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    
    // Using JDBC template - requires datasource & Query
    public int getCircleCount(){
        // jdbcTemplate.setDataSource(getDataSource());
        int count = jdbcTemplate.queryForObject("SELECT COUNT(*) FROM circle",Integer.class);

        return count;
    }

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;   // for M-1
        this.jdbcTemplate = new JdbcTemplate(dataSource);   // for M-2
    }


}
