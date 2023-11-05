package com.ichwan.basic;

import com.ichwan.basic.data.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Slf4j
@Configuration
public class BeanConfiguration {

    @Primary
    @Bean(value = "fooFirst")
    public Foo foo1(){
        Foo foo = new Foo();
        log.info("created new foo1");
        return foo;
    }

    @Bean(value = "fooSecond")
    public Foo foo2(){
        Foo foo = new Foo();
        log.info("created new foo2");
        return foo;
    }
}
