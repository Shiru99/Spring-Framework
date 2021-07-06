/**
 * @author Shiru99
 */

package Part5.io.summer;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Part5.io.summer.dao.JdbcDaoImplSupport;
import Part5.io.summer.model.Circle;

public class JDBCdemo {
    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("Part5/io/summer/spring.xml");
        JdbcDaoImplSupport dao = ctx.getBean("jdbcDaoImplSupport", JdbcDaoImplSupport.class);

        List<Circle> circles = dao.getAllCircles();
        for (Circle circle : circles) {
            System.out.println(circle.getId()+" - "+circle.getName());
        }

        ((AbstractApplicationContext) ctx).close();
    }
}
