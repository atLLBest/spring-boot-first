package com.atguigu.config;

import com.atguigu.bean.DataSourceProperties3;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author ：Shine
 * @description：TODO
 * @date ：2020/11/26 16:56
 */

@SpringBootConfiguration
public class JdbcConfig {
    @Bean
    @ConfigurationProperties("spring.jdbc.datasource")
    public DataSourceProperties3 createDataSourceProperties3(){
        return new DataSourceProperties3();
    }
}
