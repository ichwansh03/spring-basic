package com.ichwan.basic;

import com.ichwan.basic.listener.LoginSuccessListener;
import com.ichwan.basic.listener.UserListener;
import com.ichwan.basic.service.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

public class EventListenerTest {

    @Configuration
    @Import({UserService.class,
            UserListener.class,
            LoginSuccessListener.class
    })
    public static class TestConfiguration {

    }

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(TestConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testLoginSuccess() {
        UserService userService = applicationContext.getBean(UserService.class);
        userService.loginUser("ichwansh03","123");
    }
}
