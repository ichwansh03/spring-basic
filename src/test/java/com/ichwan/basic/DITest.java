package com.ichwan.basic;

import com.ichwan.basic.data.Bar;
import com.ichwan.basic.data.Foo;
import com.ichwan.basic.data.FooBar;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DITest {

    private ApplicationContext context;

    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(DIConfiguration.class);
    }

    @Test
    void testDI() {

        Foo foo = context.getBean(Foo.class);
        Bar bar = context.getBean(Bar.class);

        FooBar fooBar = context.getBean(FooBar.class);

        Assertions.assertSame(foo, fooBar.getFoo());
        Assertions.assertSame(bar, fooBar.getBar());
    }
}
