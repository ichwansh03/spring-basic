package com.ichwan.basic.application;

import com.ichwan.basic.data.Bar;
import com.ichwan.basic.data.Foo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FooApplication {

    //error, delete parameter Bar
    @Bean
    public Foo foo(){
        return new Foo();
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(FooApplication.class, args);

        Foo foo = applicationContext.getBean(Foo.class);
        System.out.println(foo);
    }
}
