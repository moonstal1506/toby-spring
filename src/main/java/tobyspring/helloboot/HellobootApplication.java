package tobyspring.helloboot;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import tobyspring.config.MySpringBootApplication;

import javax.annotation.PostConstruct;


/*
매핑과 바인딩
매핑: 웹요청 정보 활용해서 어떤 로직을 수행하는 코드를 호출할 것인가
바인딩: 헬로 컨트롤러 파라미터로 넘어온 name울 String타입으로 인자값을 넘겨줌 타입 변경
 */
@MySpringBootApplication
public class HellobootApplication {

    private final JdbcTemplate jdbcTemplate;

    public HellobootApplication(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @PostConstruct
    void init() {
        jdbcTemplate.execute("create table if not exists hello(name varchar(50) primary key , count int)");
    }

    public static void main(String[] args) {
//        MySpringApplication.run(HellobootApplication.class,args);
        SpringApplication.run(HellobootApplication.class, args);
    }

}
