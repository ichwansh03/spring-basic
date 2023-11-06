package com.ichwan.basic;

import com.ichwan.basic.application.FooApplication;
import com.ichwan.basic.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = FooApplication.class)
class FooApplicationTest {

    @Autowired
    Foo foo;

    @Test
    void fooTest() {
        Assertions.assertNotNull(foo);
    }
}