package com.ichwan.basic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SingletonTest {

    @Test
    void testSingleton() {

        var singleton1 = Singleton.getInstance();
        var singleton2 = Singleton.getInstance();

        //pastikan bahwa singleton mengembalikan object yg sama
        Assertions.assertSame(singleton1, singleton2);
    }
}