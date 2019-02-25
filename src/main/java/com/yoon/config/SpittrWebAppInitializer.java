package com.yoon.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * 서블릿 컨테이너에서 배포될 때 자동적으로 발견되어 서블릿 컨텍스트를 자동 초기화한다.
 *
 * DispatcherServlet이 시작되면서 스프링 애플리케이션 컨텍스트를 생성하고 이를 클래스나 설정파일로 선언된
 * 빈으로 로딩하기 시작한다.
 * AbstractAnnotationConfigDispatcherServletInitializer는 DispatcherServlet과 ContextLoaderListner를 생성한다.
 */
public class SpittrWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    /**
     * 여기서 리턴된 @Configuration 클래스들은 ContextLoaderListner가 생성한 애플리케이션 컨텍스트를 설정하는데 사용된다.
     */
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] { RootConfig.class };
    }

    /**
     * DispatcherServlet이 애플리케이션 컨텍스트를 WebConfig.class에서 정의된 빈으로 로딩하기를 요청하고 있다.
     * 여기서 리턴된 @Configuration 클래스들은 DispatcherServlet의 애플리케이션 컨텍스트에 대한 빈들을 정의한다.
     */
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] { WebConfig.class };
    }

    /**
     * DispatcherServlet을 /에 맵핑
     */
    protected String[] getServletMappings() {
        return new String[] {"/"};
    }
}
