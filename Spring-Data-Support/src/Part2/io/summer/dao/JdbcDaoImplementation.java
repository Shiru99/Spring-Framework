package Part2.io.summer.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import Part2.io.summer.model.Circle;

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
        /* Using JDBC template - requires datasource & Query */
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    /* Using JDBC template - requires datasource & Query */
    public int getCircleCount() {
        int count = jdbcTemplate.queryForObject("SELECT COUNT(*) FROM circle", Integer.class);
        return count;
    }

    public String getCircleName(int circleID) {
        return jdbcTemplate.queryForObject("SELECT name FROM circle WHERE ID=?", String.class,
                new Object[] { circleID });
    }

    public Circle getCircle(int circleID) {
        return jdbcTemplate.queryForObject("SELECT * FROM circle WHERE ID=?", new CircleMapper(),
                new Object[] { circleID });
    }

    private static final class CircleMapper implements RowMapper<Circle> {
        @Override
        public Circle mapRow(ResultSet rs, int rowNum) throws SQLException {
            // rowNum is row number of the record in database
            Circle circle = new Circle(rs.getInt("id"),rs.getString("name"));
            return circle;
        }
    }

    public List<Circle> getAllCircles() {
        return jdbcTemplate.query("SELECT * FROM circle", new CircleMapper());
    }
}