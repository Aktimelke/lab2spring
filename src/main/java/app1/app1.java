package app1;

import app1.animals.Cat;
import app1.animals.Dog;
import app1.animals.Parrot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class app1 {
    public static void main(String[] args) {
        SpringApplication.run(app1.class, args);
        ApplicationContext context = new AnnotationConfigApplicationContext("app1.animals");
        Cat cat = (Cat) context.getBean("getCat");
        Dog dog = (Dog) context.getBean("getDog");
        Parrot parrot = (Parrot) context.getBean("getParrot");
        System.out.println(cat.getName());
        System.out.println(dog.getName());
        System.out.println(parrot.getName());
    }
}
