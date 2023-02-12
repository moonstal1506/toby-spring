package tobyspring.helloboot;

import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.WebServer;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.GenericWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/*
매핑과 바인딩
매핑: 웹요청 정보 활용해서 어떤 로직을 수행하는 코드를 호출할 것인가
바인딩: 헬로 컨트롤러 파라미터로 넘어온 name울 String타입으로 인자값을 넘겨줌 타입 변경
 */
@Configuration
@ComponentScan//컴포넌트 빈등록
public class HellobootApplication {

    public static void main(String[] args) {
        //스프링 컨테이너 생성
        AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext() {
            @Override
            protected void onRefresh() {
                super.onRefresh();
                //dispatcherServlet 초기화
                ServletWebServerFactory serverFactory = new TomcatServletWebServerFactory();
                WebServer webServer = serverFactory.getWebServer(servletContext -> {
                    servletContext.addServlet("dispatcherServlet",
                            new DispatcherServlet(this)
                    ).addMapping("/*");
                });
                webServer.start();
            }
        };
        //자바코드로된 구성정보 여기있다고 등록
        applicationContext.register(HellobootApplication.class);
        applicationContext.refresh();
    }

}
