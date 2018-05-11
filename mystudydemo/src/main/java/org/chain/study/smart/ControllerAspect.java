package org.chain.study.smart;

import org.chain.smart4j.framework.annotation.Aspect;
import org.chain.smart4j.framework.annotation.Controller;
import org.chain.smart4j.framework.proxy.AspectProxy;

import java.lang.reflect.Method;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author 17032651
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
@Aspect(Controller.class)
public class ControllerAspect extends AspectProxy {
    @Override
    public void before(Class<?> cls, Method method, Object[] params) throws Throwable {
        System.out.println("smart framework aspect proxy before...");
        System.out.println(cls.getName());
        System.out.println(method.getName());
    }
}
