package aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MeasurementAspects {
    @Around("execution(* aop.MeasurementService.getMeasurement(..))")
    public Object executeService(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aop.MeasurementAspects.executeService(): before sleep");
        Object result = proceedingJoinPoint.proceed();
        System.out.println("aop.MeasurementAspects.executeService(): after sleep");
        return result;
    }
}
