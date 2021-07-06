package Part5.io.summer.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import Part5.io.summer.model.Circle;

public class JdbcDaoImplSupport extends JdbcDaoSupport {

    public List<Circle> getAllCircles() {
        return this.getJdbcTemplate().query("SELECT * FROM circle", new CircleMapper());
    }

    private static final class CircleMapper implements RowMapper<Circle> {
        @Override
        public Circle mapRow(ResultSet rs, int rowNum) throws SQLException {
            return new Circle(rs.getInt("id"), rs.getString("name"));
        }
    }
}
