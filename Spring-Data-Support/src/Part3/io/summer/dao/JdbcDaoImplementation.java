package Part3.io.summer.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import Part3.io.summer.model.Circle;

/**
 * @implNote : Data Access Object (DAO)
 */

@Component
public class JdbcDaoImplementation {

    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    private DataSource dataSource;

    public DataSource getDataSource() {
        return dataSource;
    }

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public boolean insertCircle(Circle circle) {

        int rowUpdated = jdbcTemplate.update("INSERT INTO circle (id,name) VALUES (?,?)",
                new Object[] { circle.getId(), circle.getName() });

        if (rowUpdated > 0)
            return true;
        return false;
    }

    public List<Circle> getAllCircles() {
        return jdbcTemplate.query("SELECT * FROM circle", new CircleMapper());
    }

    private static final class CircleMapper implements RowMapper<Circle> {
        @Override
        public Circle mapRow(ResultSet rs, int rowNum) throws SQLException {
            return new Circle(rs.getInt("id"), rs.getString("name"));
        }
    }

    public void createTriangleTable(){
        String query = "CREATE TABLE triangle (ID INT, NAME CHAR(50))";
        jdbcTemplate.execute(query);
    }

}