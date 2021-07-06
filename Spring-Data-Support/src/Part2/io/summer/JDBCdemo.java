/**
 * @author Shiru99
 */

package Part2.io.summer;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Part2.io.summer.dao.JdbcDaoImplementation;
import Part2.io.summer.model.Circle;

public class JDBCdemo {
    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("Part2/io/summer/spring.xml");
        JdbcDaoImplementation dao = ctx.getBean("jdbcDaoImplementation", JdbcDaoImplementation.class);

        // System.out.println(dao.getCircleCount());       // 2
        // System.out.println(dao.getCircleName(2));       // वर्तुलम्   
        // System.out.println(dao.getCircle(1).getName()); // First Circle

        List<Circle> circles = dao.getAllCircles();
        for (Circle circle : circles) {
            System.out.println(circle.getId()+" - "+circle.getName());
        }

        ((AbstractApplicationContext) ctx).close();
    }
}
