package app2;

import app2.days.WeekDay;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class app2 {
    public static void main(String[] args) {
        SpringApplication.run(app2.class, args);
        ApplicationContext context = new AnnotationConfigApplicationContext("config", "app2.days");

        WeekDay weekDay = context.getBean(WeekDay.class);
        System.out.println("It's " + weekDay.getWeekDayName() + " today!");
    }
}
