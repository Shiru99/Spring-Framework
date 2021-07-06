/**
 * @author Shiru99
 */

package Part4.io.summer;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Part4.io.summer.dao.JdbcDaoImplementation;
import Part4.io.summer.model.Circle;

public class JDBCdemo {
    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("Part4/io/summer/spring.xml");
        JdbcDaoImplementation dao = ctx.getBean("jdbcDaoImplementation", JdbcDaoImplementation.class);

        System.out.println(dao.getCircleName(2));       // वर्तुलम्   
        // System.out.println(dao.getCircle(3).getName());

        // List<Circle> circles = dao.getAllCircles();
        // for (Circle circle : circles) {
        //     System.out.println(circle.getId()+" - "+circle.getName());
        // }

        ((AbstractApplicationContext) ctx).close();
    }
}
