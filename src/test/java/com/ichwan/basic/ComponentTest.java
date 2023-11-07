package com.ichwan.basic;

import com.ichwan.basic.repository.CategoryRepository;
import com.ichwan.basic.repository.ProductRepository;
import com.ichwan.basic.service.CategoryService;
import com.ichwan.basic.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j
public class ComponentTest {

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(ComponentConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testConstructorDI(){
        ProductService service = applicationContext.getBean(ProductService.class);
        ProductRepository repository = applicationContext.getBean(ProductRepository.class);

        log.info("call product service");
        Assertions.assertSame(repository, service.getProductRepository());
    }

    @Test
    void testSetterDI() {
        CategoryService categoryService = applicationContext.getBean(CategoryService.class);
        CategoryRepository categoryRepository = applicationContext.getBean(CategoryRepository.class);

        log.info("call category service");
        Assertions.assertSame(categoryRepository, categoryService.getCategoryRepository());
    }
}
