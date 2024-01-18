package aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectLogin {
    // @Before("execution(public void addClient())") // pointcut expression
    // @Before("execution(public void aop.ClientDao.addClient())") // pointcut expression
    // @Before("execution(public void add*())") // pointcut expression
    // @Before("execution(void add*())") // pointcut expression
    // @Before("execution(* add*())") // pointcut expression
    // @Before("execution(* add*(aop))") // pointcut expression
    // execute only for aop.ClientDao.addClient()
    // @Before("execution(public void aop.ClientDao.addClient(aop.Client, String))") // pointcut expression
    @Before("execution(public void addClient*(aop.Client, ..))")
    public void beforeAddClientAdvice() {
        System.out.println("[*] =====>>> Executing @Before advice on addClient()");
    }

    // execute only for aop.ClientDao.existsClient()
    @Before("execution(public * existsClient(..))") // pointcut expression
    public void beforeExistsClientAdvice() {
        System.out.println("[*] =====>>> Executing @Before advice on existsClient()");
    }
}
