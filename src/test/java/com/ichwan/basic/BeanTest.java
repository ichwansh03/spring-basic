package com.ichwan.basic;

import com.ichwan.basic.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanTest {

    @Test
    void beanTest() {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);

        //walaupun bean blm diinisialisasi, dia akan terlebih dahulu dipanggil diawal.
        Assertions.assertNotNull(context);
    }

    @Test
    void getBeanTest() {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);

        Foo foo1 = context.getBean(Foo.class);
        Foo foo2 = context.getBean(Foo.class);

        //object bean tetap dibuat sekali
        Assertions.assertSame(foo1, foo2);
    }
}
