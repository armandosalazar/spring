package aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectLogin {
    @Before("execution(public void addClient())")
    public void beforeAddClientAdvice() {
        System.out.println("\n=====>>> Executing @Before advice on addClient()");
    }
}
