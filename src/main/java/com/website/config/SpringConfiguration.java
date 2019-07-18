package com.website.config;

import com.github.pagehelper.PageHelper;
import org.apache.commons.dbcp.BasicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.assertj.core.util.Lists;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * Created by yujingyang on 2019/3/26.
 */
@Configuration
@EnableTransactionManagement
public class SpringConfiguration {

    @Value("${jdbc.driver}")
    private String jdbcDriver;

    @Value("${jdbc.url}")
    private String jdbcUrl;

    @Value("${jdbc.username}")
    private String username;

    @Value("${jdbc.password}")
    private String password;

    @Value("${mybatis.typeAliasesPackage}")
    private String typeAliasesPackage;

    @Value("${mybatis.mapperLocations}")
    private String mapperLocations;

    @Bean("dataSource")
    public DataSource dataSource() {
        BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setDriverClassName(jdbcDriver);
        basicDataSource.setUrl(jdbcUrl);
        basicDataSource.setUsername(username);
        basicDataSource.setPassword(password);
        basicDataSource.setInitialSize(0);
        basicDataSource.setMaxActive(20);
        basicDataSource.setMaxWait(60000);
        basicDataSource.setMaxIdle(20);
        basicDataSource.setMinIdle(1);
        basicDataSource.setTestOnBorrow(true);
        basicDataSource.setValidationQuery("SELECT 1");
        return basicDataSource;
    }

    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource ds) throws Exception {
        SqlSessionFactoryBean sqlSFB = new SqlSessionFactoryBean();
        sqlSFB.setDataSource(ds);
        //指定自定义的数据源,这个必须用

        sqlSFB.setTypeAliasesPackage(typeAliasesPackage);
        //指定对应的实体包,多个包之间逗号隔开,配置信息见application.properties

//        Resource configLocationResource = new PathMatchingResourcePatternResolver().getResource(
//                mapperLocations);
//        sqlSFB.setConfigLocation(configLocationResource);
//        //指定mybatis的本地配置文件资源,目的是定义实体等别名,可以不用,如果不用对应配置文件应注释掉
//
//        Resource[] mapperLocationResources = new PathMatchingResourcePatternResolver().getResources(mapperLocations);
//        sqlSFB.setMapperLocations(mapperLocationResources);
        //指定mybatis的库表到实体的映射xml文件的mapper资源

        return sqlSFB.getObject();
    }

    @Bean
    public PlatformTransactionManager platformTransactionManager(
            @Qualifier("dataSource") DataSource myDataSource) {
        return new DataSourceTransactionManager(myDataSource);
    }

    @Bean
    public PageHelper pageHelper(){
        PageHelper pageHelper = new PageHelper();
        Properties properties = new Properties();
        properties.setProperty("offsetAsPageNum","true");
        properties.setProperty("rowBoundsWithCount","true");
        properties.setProperty("reasonable","true");
        properties.setProperty("dialect","mysql");    //配置mysql数据库的方言
        pageHelper.setProperties(properties);
        return pageHelper;
    }

    @Bean
    public CommonsMultipartResolver commonsMultipartResolver(){
        CommonsMultipartResolver commonsMultipartResolver = new CommonsMultipartResolver();
        commonsMultipartResolver.setDefaultEncoding("utf-8");
        commonsMultipartResolver.setMaxUploadSize(10485760000L);
        commonsMultipartResolver.setMaxInMemorySize(4096);
        return commonsMultipartResolver;
    }

}
