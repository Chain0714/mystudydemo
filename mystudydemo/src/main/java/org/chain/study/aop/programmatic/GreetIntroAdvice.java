package org.chain.study.aop.programmatic;

import org.aopalliance.intercept.MethodInvocation;
import org.chain.study.aop.Apology;
import org.springframework.aop.support.DelegatingIntroductionInterceptor;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author 17032651
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class GreetIntroAdvice extends DelegatingIntroductionInterceptor implements Apology {

    @Override
    public Object invoke(MethodInvocation mi) throws Throwable {
        return super.invoke(mi);
    }

    public void saySorry() {
        System.out.println("say sorry!");
    }
}
