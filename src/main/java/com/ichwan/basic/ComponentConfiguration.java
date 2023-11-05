package com.ichwan.basic;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "com.ichwan.basic.repository",
        "com.ichwan.basic.service"
})
public class ComponentConfiguration {
}
