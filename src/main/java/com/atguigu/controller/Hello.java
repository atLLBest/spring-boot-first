package com.atguigu.controller;

import com.atguigu.bean.DataSourceHH;
import com.atguigu.bean.DataSourcesHello;
import com.atguigu.bean.JdbcProperties;
import org.apache.naming.factory.DataSourceLinkFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：Shine
 * @description：TODO
 * @date ：2020/11/26 9:52
 */
@RestController
@EnableConfigurationProperties(JdbcProperties.class)
public class Hello {
    //   @Autowired
    //private  DataSourcesHello dataSourcesHello;
    // @Autowired
    // private DataSourceHH dataSourceHH;

    @Autowired
    JdbcProperties jdbcProperties;
    @RequestMapping("/hello")
    public String hello() {
        //System.out.println(dataSourcesHello);
        System.out.println(jdbcProperties);
        return "你好呀，新的一天，新的开始";
    }
}
