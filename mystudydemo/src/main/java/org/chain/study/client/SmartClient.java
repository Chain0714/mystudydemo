package org.chain.study.client;

import org.chain.smart4j.framework.HelperLoader;
import org.chain.smart4j.framework.helper.BeanHelper;
import org.chain.study.smart.SmartController;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author 17032651
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class SmartClient {
    public static void main(String[] args) {
//        String appBasePackage = ConfigHelper.getAppBasePackage();
//        System.out.println(appBasePackage);
//
//        Set<Class<?>> classSet = ClassHelper.getClassSet();
//        System.out.println(classSet);
        HelperLoader.init();
        BeanHelper.getBean(SmartController.class).doSomething();


    }
}
