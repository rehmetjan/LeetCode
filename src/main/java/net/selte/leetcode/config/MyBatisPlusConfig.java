package net.selte.leetcode.config;

import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author rt
 * Copyright (c) 2022 by rt
 * All rights reserved.
 */
//@MapperScan("net.selte.leetcode.mapper")
@Configuration
public class MyBatisPlusConfig {
    @Bean
    public PaginationInnerInterceptor paginationInnerInterceptor() {
        PaginationInnerInterceptor paginationInnerInterceptor = new PaginationInnerInterceptor();

        return paginationInnerInterceptor;
    }
}
