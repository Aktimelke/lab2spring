package app1.animals;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component("parrot")
public class Parrot {
    private String name = "kesha";

    @Bean("getParrot")
    public Parrot getParrot() {
        return new Parrot();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
