package com.yoon.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc // 가장 간단한 MVC 설정 방법
@ComponentScan("com.yoon.web") // component-scanning 활성화
public class WebConfig extends WebMvcConfigurerAdapter {

    /**
     * jsp 뷰 리졸버 설정
     */
    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        resolver.setExposeContextBeansAsAttributes(true);
        return resolver;
    }

    /**
     * 정적 콘텐츠 처리 설정
     * DispatcherServlet이 고정적인 리소스들에 대한 요청을 자신이 직접 처리하지 않고
     * 서블릿 컨테이너의 디폴트 서블릿 전달을 요청한다.
     */
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

}
