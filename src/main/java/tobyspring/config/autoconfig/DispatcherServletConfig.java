package tobyspring.config.autoconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.DispatcherServlet;
import tobyspring.config.MyAutoConfiguration;


@MyAutoConfiguration
public class DispatcherServletConfig {

    // 스프링이 applicationContext 알아서 넣어줌
    @Bean
    public DispatcherServlet dispatcherServlet(){
        return new DispatcherServlet();
    }

}
