package com.guoMgr;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.servlet.ErrorPage;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by guoconglin on 2017/9/21 12:24.
 */
@EnableTransactionManagement
@MapperScan("com.guoMgr.*.dao")
@SpringBootApplication
public class MgrApplication {
    public static void main(String[] args){
        SpringApplication.run(MgrApplication.class,args);
        System.out.println("*****************************");
        System.out.println("*****************************");
        System.out.println("*******后台管理系统启动成功**********");
        System.out.println("*****************************");
        System.out.println("*****************************");
    }
    @Bean
    public EmbeddedServletContainerCustomizer containerCustomizer() {
        return (container -> {
            ErrorPage error401Page = new ErrorPage(HttpStatus.UNAUTHORIZED, "/401.html");
            ErrorPage error404Page = new ErrorPage(HttpStatus.NOT_FOUND, "/404.html");
            ErrorPage error500Page = new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR, "/500.html");
            container.addErrorPages(error401Page, error404Page, error500Page);
            container.setSessionTimeout(1800);// 单位为S
        });

    }
}
