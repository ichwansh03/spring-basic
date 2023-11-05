package com.ichwan.basic;

import com.ichwan.basic.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanTest {

    private ApplicationContext context;

    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(BeanConfiguration.class);
    }

    @Test
    void beanTest() {

        //walaupun bean blm diinisialisasi, dia akan terlebih dahulu dipanggil diawal.
        Assertions.assertNotNull(context);
    }

    //jika object bean hanya 1/singleton
    @Test
    void getBeanTest() {

        Foo foo1 = context.getBean(Foo.class);
        Foo foo2 = context.getBean(Foo.class);

        //object bean tetap dibuat sekali
        Assertions.assertSame(foo1, foo2);
    }

    //jika terdapat object bean dgn tipe yg sama, inject nama methodnya
    @Test
    void getDuplicateBeanTest(){

        Foo foo1 = context.getBean("fooFirst",Foo.class);
        Foo foo2 = context.getBean("fooSecond",Foo.class);

        //object bean tetap dibuat sekali
        Assertions.assertNotSame(foo1, foo2);
    }

    @Test
    void getPrimaryBean() {
        Foo foo = context.getBean(Foo.class);

        Foo foo1 = context.getBean("fooFirst",Foo.class);
        Foo foo2 = context.getBean("fooSecond",Foo.class);

        Assertions.assertSame(foo, foo1);

        Assertions.assertNotSame(foo, foo2);
    }
}
