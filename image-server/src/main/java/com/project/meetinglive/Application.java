package com.project.meetinglive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.project.meetinglive.core.Filter.BodyReaderFilter;

@SpringBootApplication
@EnableScheduling
@ComponentScan("com.project.*")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public FilterRegistrationBean<BodyReaderFilter> Filters() {
        FilterRegistrationBean<BodyReaderFilter> registrationBean = new FilterRegistrationBean<BodyReaderFilter>();
        registrationBean.setFilter(new BodyReaderFilter());
        registrationBean.addUrlPatterns("/*");
        registrationBean.setName("meetingliveFilter");
        return registrationBean;
    }

}
