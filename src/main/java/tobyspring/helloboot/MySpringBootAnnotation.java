package tobyspring.helloboot;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)//자바 애노테이션 기본은 class
@Target(ElementType.TYPE)//클래스,인터페이스,enum
@Configuration
@ComponentScan//컴포넌트 빈등록
public @interface MySpringBootAnnotation {
}
