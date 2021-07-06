package Part4.io.summer.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Component;

import Part4.io.summer.model.Circle;

/**
 * @implNote : Data Access Object (DAO)
 */

@Component
public class JdbcDaoImplementation {

    private JdbcTemplate jdbcTemplate;
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

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
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public String getCircleName(int circleID) {
        return jdbcTemplate.queryForObject("SELECT name FROM circle WHERE ID=?", String.class,
                new Object[] { circleID });

        // String query = "SELECT name FROM circle WHERE ID=:id";
        // SqlParameterSource paramSource = new MapSqlParameterSource("id", circleID);
        // namedParameterJdbcTemplate.update(query, paramSource);
    }

    public void insertCircle(Circle circle) {

        String query = "INSERT INTO circle (id,name) VALUES (:id,:name)";
        SqlParameterSource paramSource = new MapSqlParameterSource("id", circle.getId())
        .addValue("name", circle.getName());

        namedParameterJdbcTemplate.update(query, paramSource);
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
}