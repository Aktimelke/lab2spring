package app1.animals;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component("cat")
public class Cat {
    private String name = "gorden";

    @Bean
    public Cat getCat(@Qualifier("getParrot") Parrot n) {
        Cat cat = new Cat();
        cat.setName(n.getName() + "-killer");
        return cat;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
