package org.chain.study.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author 17032651
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
        Greet greet = applicationContext.getBean("greetImpl", GreetImpl.class);
        greet.sayHello();
    }
}
