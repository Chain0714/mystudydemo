package org.chain.study.aop.programmatic;

import org.chain.study.aop.Apology;
import org.chain.study.aop.Greet;
import org.chain.study.aop.GreetImpl;
import org.springframework.aop.framework.ProxyFactory;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author 17032651
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class ProgrammaticClient {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setTarget(new GreetImpl());
        proxyFactory.addAdvice(new GreetBeforeAdvice());
        proxyFactory.addAdvice(new GreetAroundAdvice());
        proxyFactory.addAdvice(new GreetAfterAdvice());
//        Greet greet = (Greet) proxyFactory.getProxy();
//        greet.sayHello();
        proxyFactory.addAdvice(new GreetIntroAdvice());
        Apology apology = (Apology) proxyFactory.getProxy();
        apology.saySorry();

    }
}
