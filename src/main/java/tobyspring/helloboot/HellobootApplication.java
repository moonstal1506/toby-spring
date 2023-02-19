package tobyspring.helloboot;

import org.springframework.boot.SpringApplication;
import tobyspring.config.MySpringBootApplication;


/*
매핑과 바인딩
매핑: 웹요청 정보 활용해서 어떤 로직을 수행하는 코드를 호출할 것인가
바인딩: 헬로 컨트롤러 파라미터로 넘어온 name울 String타입으로 인자값을 넘겨줌 타입 변경
 */
@MySpringBootApplication
public class HellobootApplication {

    public static void main(String[] args) {
//        MySpringApplication.run(HellobootApplication.class,args);
        SpringApplication.run(HellobootApplication.class, args);
    }

}
