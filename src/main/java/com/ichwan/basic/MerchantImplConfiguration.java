package com.ichwan.basic;

import com.ichwan.basic.service.MerchantServiceImpl;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(MerchantServiceImpl.class)
public class MerchantImplConfiguration {

}
