/**
 * @author Shiru99
 */

package JDBC.io.summer;

import JDBC.io.summer.dao.JdbcDaoImplementation;
import JDBC.io.summer.model.Circle;

public class JDBCdemo {
    public static void main(String[] args) {

        Circle circle = new JdbcDaoImplementation().getCircle(2);
        System.out.println(circle.getName());
    }
}
