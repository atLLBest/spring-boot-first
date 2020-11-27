package com.atguigu.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.lang.model.element.NestingKind;

/**
 * @author ：Shine
 * @description：TODO
 * @date ：2020/11/26 16:58
 */
@Component
@ConfigurationProperties(prefix = "spring.jdbc")
public class JdbcProperties {
     DataSourceProperties3 dataSource;
     String type;

    @Override
    public String toString() {
        return "JdbcProperties{" +
                "dataSource=" + dataSource +
                ", type='" + type + '\'' +
                '}';
    }

    public DataSourceProperties3 getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSourceProperties3 dataSource) {
        this.dataSource = dataSource;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
