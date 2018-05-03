package org.chain.study.aop.aspectj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author 17032651
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
@Aspect
@Component
public class GreetAspect {
    @Around("execution(* org.chain.study.aop.GreetImpl.say*(..))")
    public Object doArount(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("aspect before");
        Object o = pjp.proceed();
        System.out.println("aspect after");
        return o;
    }
}
