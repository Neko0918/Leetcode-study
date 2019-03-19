/**
 * Copyright (C), 2015-2018
 * FileName: Multiply
 * Author:   kritio
 * Date:     2018/12/8 18:00
 * Description: 字符串相乘
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Collection;

/**
 * 〈一句话功能简述〉<br>
 * 〈字符串相乘〉
 *
 * @author kritio
 * @create 2018/12/8
 * @since 1.0.0
 */

//未解决
public class Multiply {
    public static String multiply(String num1, String num2) {

        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);
        int n3 = n1 * n2;
        if (n3 > Integer.MAX_VALUE) {
            throw new IllegalArgumentException();
        }
        String num3 = String.valueOf(n3);
        return num3;
    }

    public static void main(String[] args) {
        String num1="6913259244";

        String num2= "71103343";
        System.out.println(multiply(num1,num2).toString());
    }
}