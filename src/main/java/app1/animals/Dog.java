package app1.animals;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component("dog")
public class Dog {
    private String name = "osupob";

    @Bean("getDog")
    public Dog getDog() {
        return new Dog();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
