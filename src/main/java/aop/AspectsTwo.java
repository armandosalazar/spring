package aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
// @Order(1)
public class AspectsTwo {
    @Before("aop.Aspects.forClient()")
    public void beforeAddClient() {
        System.out.println("AspectsTwo.beforeAddClient(): first advice");
    }
}
