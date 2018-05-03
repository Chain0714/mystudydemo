package org.chain.study.binary;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author 17032651
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public enum Feature {
    feature0,
    feature1,
    feature2,
    feature3,
    feature4,
    feature5,
    feature6,
    feature7;

    private int mask;

    Feature() {
        this.mask = 1 << ordinal();
    }

    public int getMask() {
        return mask;
    }
}
