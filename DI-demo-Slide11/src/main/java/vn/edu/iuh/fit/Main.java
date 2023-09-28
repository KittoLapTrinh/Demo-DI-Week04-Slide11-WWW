package vn.edu.iuh.fit;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import vn.edu.iuh.fit.models.Student;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
        Student st1 = ctx.getBean("st1", Student.class);
        st1.show();

        Student st2 = ctx.getBean("st2", Student.class);
        st2.show();

        Student st3 = ctx.getBean("st3", Student.class);
        st3.show();


    }
}