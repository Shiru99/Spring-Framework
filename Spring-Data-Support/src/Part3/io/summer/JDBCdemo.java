/**
 * @author Shiru99
 */

package Part3.io.summer;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Part3.io.summer.dao.JdbcDaoImplementation;
import Part3.io.summer.model.Circle;

public class JDBCdemo {
    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("Part3/io/summer/spring.xml");
        JdbcDaoImplementation dao = ctx.getBean("jdbcDaoImplementation",JdbcDaoImplementation.class);

        dao.insertCircle(new Circle(3, "परिकर्षण"));

        List<Circle> circles = dao.getAllCircles();
        for (Circle circle : circles) {
            System.out.println(circle.getId()+" - "+circle.getName());
        }

        dao.createTriangleTable();
        

        ((AbstractApplicationContext) ctx).close();
    }
}
