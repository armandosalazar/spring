package aop;

import org.aspectj.lang.JoinPoint;
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
    public void beforeAddClient(JoinPoint joinPoint) {
        System.out.println("Aspects.beforeAddClient(): second advice");
        Object[] args = joinPoint.getArgs();
        for (Object arg : args) {
            if (arg instanceof Client client) {
                System.out.println("Client name: " + client.getFullName());
                System.out.println("Client type: " + client.getType());
            }
        }
    }
}
