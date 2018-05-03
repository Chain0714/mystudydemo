package org.chain.study.aop.aspectj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.chain.study.aop.Apology;
import org.chain.study.aop.ApologyImpl;
import org.springframework.stereotype.Component;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author 17032651
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 * <p>
 * Before--前置增强
 * After--后置增强
 * AfterReturning--返回后增强
 * Around--环绕增强
 * AfterThrowing--抛出增强
 * DeclareParents--引入增强
 */
@Aspect
@Component
public class GreetAspect {

    /**
     * 引入增强
     */
    @DeclareParents(value = "org.chain.study.aop.GreetImpl", defaultImpl = ApologyImpl.class)
    private Apology apology;

    @Around("execution(* org.chain.study.aop.GreetImpl.say*(..))")
    public Object doArount(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("aspect before");
        Object o = pjp.proceed();
        System.out.println("aspect after");
        return o;
    }

    @Around("@annotation(org.chain.study.aop.annotation.Tag)")
    public Object doArount1(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("annotation aspect before");
        Object o = pjp.proceed();
        System.out.println("annotation aspect after");
        return o;
    }
}
