package com.opzpy123.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 整合mybatis-plus
 * 1.导入依赖
 * 2.配置
 *  1.配置数据源
 *      1.数据库驱动(所有模块都要用，放到common里)
 *      2.yml中配置数据源相关信息
 *  2.配置mybatis-plus
 *      1.mapperScan
 *      2.xml-sql映射文件
 */
@SpringBootApplication
@MapperScan("com.opzpy123.product.dao")
public class MallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallProductApplication.class, args);
    }

}
