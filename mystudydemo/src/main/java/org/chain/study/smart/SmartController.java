package org.chain.study.smart;

import org.chain.smart4j.framework.annotation.Action;
import org.chain.smart4j.framework.annotation.Controller;
import org.chain.smart4j.framework.annotation.Inject;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author 17032651
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
@Controller
public class SmartController {
    @Inject
    private SmartService smartService;

    @Action(value = "GET:/test")
    public void doSomthing() {
        System.out.println("smart controller do sth...");
        smartService.doSomthing();
    }
}
