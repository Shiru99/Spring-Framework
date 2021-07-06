/**
 * @author Shiru99
 */

package Part3.io.summer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Part3.io.summer.dao.JdbcDaoImplementation;
import Part3.io.summer.model.Circle;

public class JDBCdemo {
    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("Part3/io/summer/spring.xml");
        JdbcDaoImplementation dao = ctx.getBean("jdbcDaoImplementation",JdbcDaoImplementation.class);

        // Using JDBC template - requires datasource & Query
        System.out.println(dao.getCircleCount());

        ((AbstractApplicationContext) ctx).close();
    }
}
