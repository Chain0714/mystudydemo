package org.chain.study.aop;

import org.springframework.stereotype.Component;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author 17032651
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
@Component("greetImpl")
public class GreetImpl implements Greet {
    public void sayHello() {
        System.out.println("hello guys!");
    }
}
