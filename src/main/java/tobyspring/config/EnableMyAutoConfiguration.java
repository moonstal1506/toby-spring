package tobyspring.config;

import org.springframework.context.annotation.Import;
import tobyspring.config.autoconfig.DispatcherServletConfig;
import tobyspring.config.autoconfig.TomcatWebServerConfig;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)//자바 애노테이션 기본은 class
@Target(ElementType.TYPE)//클래스,인터페이스,enum
<<<<<<< HEAD
@Import(MyAutoConfigImportSelector.class)//컴포넌트가 붙은 애들 넣을 수 있음,
=======
@Import({DispatcherServletConfig.class, TomcatWebServerConfig.class})//컴포넌트가 붙은 애들 넣을 수 있음,
>>>>>>> origin/main
// import HellobootApplication 패키지 밖에 있는 애들 가져옴
public @interface EnableMyAutoConfiguration {
}
