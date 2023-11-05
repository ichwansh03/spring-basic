package com.ichwan.basic;

import com.ichwan.basic.service.MerchantService;
import com.ichwan.basic.service.MerchantServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class InheritanceTest {

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(MerchantImplConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testInheritance() {

        MerchantService merchantService = applicationContext.getBean(MerchantService.class);
        MerchantServiceImpl serviceImpl = applicationContext.getBean(MerchantServiceImpl.class);

        Assertions.assertSame(merchantService, serviceImpl);
    }
}
