package tobyspring.helloboot;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary//빈이 두개 존재할 때 먼저
public class HelloDecorator implements HelloService {

    private final HelloService helloService;

    //자신 제외한 HelloService 하나 남음->simpleHelloService
    public HelloDecorator(HelloService helloService) {
        this.helloService = helloService;
    }

    @Override
    public String sayHello(String name) {
        return "*" + helloService.sayHello(name) + "*";
    }
}
