package tobyspring.config;

import org.springframework.context.annotation.Configuration;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Configuration(proxyBeanMethods = false)//어떤의미?
// 우리가 직접 유저 구성정보를 작성하는 중에도 사용할 일이 있음, 원하는 빈 주입
public @interface MyAutoConfiguration {
}
