package tobyspring.helloboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.WebServer;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;


/*
매핑과 바인딩
매핑: 웹요청 정보 활용해서 어떤 로직을 수행하는 코드를 호출할 것인가
바인딩: 헬로 컨트롤러 파라미터로 넘어온 name울 String타입으로 인자값을 넘겨줌 타입 변경
 */
@Configuration
@ComponentScan//컴포넌트 빈등록
public class HellobootApplication {

    @Bean
    public ServletWebServerFactory servletWebServerFactory(){
        return new TomcatServletWebServerFactory();
    }

    // 스프링이 applicationContext 알아서 넣어줌
    @Bean
    public DispatcherServlet dispatcherServlet(){
        return new DispatcherServlet();
    }

    public static void main(String[] args) {
//        MySpringApplication.run(HellobootApplication.class,args);
        SpringApplication.run(HellobootApplication.class, args);
    }

}
