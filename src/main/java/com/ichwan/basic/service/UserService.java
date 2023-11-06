package com.ichwan.basic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class UserService implements ApplicationEventPublisherAware {

    @Override
    @Autowired
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
    }

    public boolean loginUser(String username, String password) {
        return isLoginSuccess("ichwansh03", "123");
    }

    private boolean isLoginSuccess(String username, String password) {
        return "ichwansh03".equals(username) && "123".equals(password);
    }

}
