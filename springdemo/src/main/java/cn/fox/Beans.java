package cn.fox;

import cn.fox.internal.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Beans {
    @Bean(name="person")
    public Person buildPerson(){
        return new Person();
    }
}
