package aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.List;

@Aspect
@Component
// @Order(2)
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

//    @AfterReturning(pointcut = "forClient()", returning = "result")
//    public void afterReturningAddClient(JoinPoint joinPoint, Object result) {
//        System.out.println("Aspects.afterReturningAddClient(): second advice");
//        System.out.println("Result: " + result);
//    }

    @AfterReturning(pointcut = "execution(* aop.dao.ClientDaoAspects.getClients(..))", returning = "clients")
    public void afterReturningGetClients(List<Client> clients) {
        System.out.println("Aspects.afterReturningGetClients(): second advice");
        for (Client client : clients) {
            if (client.getType().equals("VIP"))
                System.out.println("VIP client: " + client.getFullName());
            client.setFullName(client.getFullName().toUpperCase());
        }
    }
}
