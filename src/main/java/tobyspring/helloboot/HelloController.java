package tobyspring.helloboot;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;
//메타애노테이션: 애노테이션 위에 붙은 애노테이션
//@MyComponent
@RestController
@RequestMapping
public class HelloController {

    private final HelloService helloService;

    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping("/hello")
    public String hello(String name){
        return helloService.sayHello(Objects.requireNonNull(name));
    }
}
