package org.chain.study.binary;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author 17032651
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class Client {
    private static int features;

    static {
        features = 0;
        features |= Feature.feature0.getMask();
        features |= Feature.feature1.getMask();
        features |= Feature.feature2.getMask();
        features |= Feature.feature3.getMask();
        features |= Feature.feature4.getMask();
        features |= Feature.feature5.getMask();
        features |= Feature.feature6.getMask();
        features |= Feature.feature7.getMask();
    }

    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(features));

        subFeature(Feature.feature1);

        System.out.println(Integer.toBinaryString(features));

        subFeature(Feature.feature2);

        System.out.println(Integer.toBinaryString(features));

        addFeature(Feature.feature7);

        System.out.println(Integer.toBinaryString(features));

        addFeature(Feature.feature2);

        System.out.println(Integer.toBinaryString(features));
    }

    public static int addFeature(Feature feature) {
        return features |= feature.getMask();
    }

    public static int subFeature(Feature feature) {
        return features &= ~feature.getMask();
    }
}
