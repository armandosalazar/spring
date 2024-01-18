package aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectLogin {
    // @Pointcut("execution(public * addClient*(..))") // pointcut declaration
    @Pointcut("execution(* aop.dao.*.*(..)))") // pointcut declaration for package aop.dao for all methods
    public void forDaoPackage() {
    }

    @Pointcut("execution(* aop.dao.*.get*(..))") // pointcut declaration for package aop.dao for all getters
    public void forGetter() {
    }

    @Pointcut("execution(* aop.dao.*.set*(..))") // pointcut declaration for package aop.dao for all setters
    public void forSetter() {
    }

    @Pointcut("forDaoPackage() && !(forGetter() || forSetter())") // pointcut declaration for package aop.dao for all methods except getters and setters
    public void forDaoPackageNoGetterSetter() {
    }

    // @Before("execution(public void addClient())") // pointcut expression
    // @Before("execution(public void aop.dao.ClientDao.addClient())") // pointcut expression
    // @Before("execution(public void add*())") // pointcut expression
    // @Before("execution(void add*())") // pointcut expression
    // @Before("execution(* add*())") // pointcut expression
    // @Before("execution(* add*(aop))") // pointcut expression
    // execute only for aop.dao.ClientDao.addClient()
    // @Before("execution(public void aop.dao.ClientDao.addClient(aop.Client, String))") // pointcut expression
    @Before("execution(public void addClient*(aop.Client, ..))")
    public void beforeAddClientAdvice() {
        System.out.println("[*] =====>>> Executing @Before advice on addClient*()");
    }

    // execute only for aop.dao.ClientDao.existsClient()
    @Before("execution(public * existsClient(..))") // pointcut expression
    public void beforeExistsClientAdvice() {
        System.out.println("[*] =====>>> Executing @Before advice on existsClient()");
    }

    @Before("forDaoPackage()")
    public void requireLogin() {
        System.out.println("[*] =====>>> Checking if user is logged in...");
    }

    @Before("forDaoPackage()")
    public void requireAdmin() {
        System.out.println("[*] =====>>> Checking if user is admin...");
    }

    @Before("forGetter()")
    public void logGetter() {
        System.out.println("[*] =====>>> Logging getter...");
    }
}
