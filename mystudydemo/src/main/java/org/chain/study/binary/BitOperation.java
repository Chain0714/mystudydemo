package org.chain.study.binary;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author 17032651
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class BitOperation {
    public static void main(String[] args) {
        int a = 170;//10101010
        int b = 204;//11001100
        int c = -5;//11111111111111111111111111111011
        int d = 240;//11110000

        //负数以其正值的补码（反码+1）形式表示
        //Ingeger.valueOf方法解析 "+/- 正值二进制码"
        System.out.println(Integer.valueOf("-0000000000000000000000000000101", 2));//-5  ==  c
        System.out.println(Integer.valueOf("11110000", 2));

        //跟0异或不变，跟1异或取反
        System.out.println(Integer.toBinaryString(a ^ d));//01011010
        System.out.println(Integer.toBinaryString(b ^ d));//00111100

        //跟0与置零，跟1或置一
        System.out.println(Integer.toBinaryString(a & d));//10100000
        System.out.println(Integer.toBinaryString(a | d));//11111010

        //向左位移 << 移动几位相当于乘以2的几次方
        System.out.println(a << 1); //340
        System.out.println(Integer.toBinaryString(a << 1));//101010100
        System.out.println(a << 2); //680

        //向右位移 >> 正数左补0，负数左补1，右边丢弃
        System.out.println(a >> 1); //85
        System.out.println(Integer.toBinaryString(a >> 1));//1010101
        System.out.println(a >> 2); //42

        System.out.println(c >> 1); //-3
        System.out.println(Integer.toBinaryString(c >> 1));//11111111111111111111111111111101
        System.out.println(c >> 2); //-2
        System.out.println(Integer.toBinaryString(c >> 2));//11111111111111111111111111111110

        //无符号右移运算>>>：各个位向右移指定的位数，右移后左边空出来的位用0填充，移出右边的位被丢弃
        System.out.println(a >>> 1); //85
        System.out.println(Integer.toBinaryString(a >>> 1));//1010101
        System.out.println(a >>> 2); //42

        System.out.println(c >>> 1); //2147483645
        System.out.println(Integer.toBinaryString(c >>> 1));//01111111111111111111111111111101
        System.out.println(c >>> 2); //1073741822
        System.out.println(Integer.toBinaryString(c >>> 2));//00111111111111111111111111111110
    }
}
