package aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class Aspects {
    @Pointcut("execution(* aop.dao.*.add*(..))")
    public void forClient() {
    }

    @Before("forClient()")
    public void beforeAddClient2() {
        System.out.println("Aspects.beforeAddClient2(): second advice");
    }
}
