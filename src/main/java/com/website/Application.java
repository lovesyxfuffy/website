package com.website;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by yujingyang on 2019/3/25.
 */
@SpringBootApplication(exclude = {
        //禁止数据源自动配置
        DataSourceAutoConfiguration.class,
        //禁止事务管理器自动配置
        DataSourceTransactionManagerAutoConfiguration.class,
        //禁止JPA自动配置
        HibernateJpaAutoConfiguration.class},scanBasePackages = {"com.website"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


}
