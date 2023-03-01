package tobyspring.config.autoconfig;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import tobyspring.config.ConditionalMyOnClass;
import tobyspring.config.MyAutoConfiguration;

@MyAutoConfiguration
@ConditionalMyOnClass("org.apache.catalina.startup.Tomcat")
public class TomcatWebServerConfig {

    @Bean("tomcatWebServerFactory")
    @ConditionalOnMissingBean //사용자가 등록한게 없으면 등록해라
    public ServletWebServerFactory servletWebServerFactory(Environment env) {
        //톰캣을 띄우는데 필요한 여러작업 지정
        //Tomcat started on port(s): 8080 (http) with context path '/app'
        TomcatServletWebServerFactory factory = new TomcatServletWebServerFactory();
//        factory.setContextPath("/app");
        factory.setContextPath(env.getProperty("contextPath"));
        return factory;
    }
}
