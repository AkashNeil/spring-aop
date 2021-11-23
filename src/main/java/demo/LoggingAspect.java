package demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* demo.Cart.checkout(..))")
    public void beforeLogger(JoinPoint joinPoint) {
        System.out.println(joinPoint.getArgs()[0].toString());
        System.out.println("Logged before");
    }

    @After("execution(* *.*.checkout(..))")
    public void afterLogger() {
        System.out.println("Logged after");
    }

    @Pointcut("execution(* demo.Cart.qty())")
    public void afterReturningPointCut() {

    }

    @AfterReturning(pointcut ="afterReturningPointCut()", returning = "returnValue")
    public void afterReturning(String returnValue){
        System.out.println("After returning " + returnValue);
    }

}
