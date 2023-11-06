package com.ichwan.basic;

import com.ichwan.basic.data.Bar;
import com.ichwan.basic.data.Foo;
import com.ichwan.basic.data.FooBar;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DIConfiguration {

    @Bean
    public Foo foo() {
        return new Foo();
    }

    @Bean
    public Bar bar(){
        return new Bar();
    }

    //tambahkan @Qualifier("namaBean") pada parameter jika ingin memilih dependency
    @Bean
    public FooBar fooBar(@Qualifier("foo") Foo foo, Bar bar){
        return new FooBar(foo, bar);
    }
}
