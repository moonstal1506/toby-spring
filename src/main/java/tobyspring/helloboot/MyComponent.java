package tobyspring.helloboot;

import org.springframework.stereotype.Component;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//언제까지 살아있을 것인가
@Retention(RetentionPolicy.RUNTIME)
//클래스나 인터페이스 같은 타입에 적용할 것
@Target(ElementType.TYPE)
@Component//메타애노테이션
public @interface MyComponent {
}
