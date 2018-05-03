package org.chain.study.aop.proxy;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author 17032651
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class Client {
    public static void main(String[] args) {
        Hello hello = new DynamicProxy(new HelloImpl()).getProxy();
        hello.say();
        System.out.println("--------我是分割线------");
        Hello hello1 = CGLibProxy.getInstance().getProxy(HelloImpl.class);
        hello1.say();
    }
}
