package org.chain.study.aop.programmatic;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author 17032651
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class GreetAfterAdvice implements AfterReturningAdvice{
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("after enhancement!");
    }
}
