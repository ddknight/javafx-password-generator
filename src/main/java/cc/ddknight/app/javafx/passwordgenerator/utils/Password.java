package cc.ddknight.app.javafx.passwordgenerator.utils;

import java.util.Random;

/**
 * 生成随机密码算法
 * @author ddknight (Create on:2016年11月18日)
 */
public class Password {

	/**
	 * 生成随机密码
	 * @param passwordLength password's length
	 * @return
	 */
	public static String genRandomNum(int passwordLength) {
        int i; // 生成的随机数
        int count = 0;
        /** 是否使用特殊字符 **/
        Boolean isUseSpecialCharStr = Boolean.TRUE;
        /** 是否使用英文字符 **/
        Boolean isUseEnglishCharStr = Boolean.TRUE;
        /** 是否使用数字字符 **/
        Boolean isUseNumberCharStr = Boolean.TRUE;
        /** 定义所有需要用到的特殊字符 **/
        char[] specialCharStr = { '!', '@', '#', '$' };
        /** 定义所有需要用到的英文字符 **/
        char[] englishCharStr = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', /*'l',*/ 'm', 'n', /*'o',*/ 'p', 'q', 'r', 's', 't', /*'u', 'v',*/ 'w', 'x', 'y', 'z' };
        /** 定义所有需要用到的数字字符 **/
        char[] numberCharStr = { /*'0', '1',*/ '2', '3', '4', '5', '6', '7', '8', '9' };
        char[] str = new char[0];
        if (isUseSpecialCharStr) {
            int oldLength = str.length;
            str = new char[oldLength + specialCharStr.length];
            for (int j = 0 ; j < specialCharStr.length ; j++) {
                str[oldLength + j] = specialCharStr[j];
            }
        }
        if (isUseEnglishCharStr) {
            int oldLength = str.length;
            char[] tempCharStr = str;
            str = new char[oldLength + englishCharStr.length];
            for (int j = 0 ; j < tempCharStr.length ; j++) {
                str[j] = tempCharStr[j];
            }
            for (int j = 0 ; j < englishCharStr.length ; j++) {
                str[oldLength + j] = englishCharStr[j];
            }
        }
        if (isUseNumberCharStr) {
            int oldLength = str.length;
            char[] tempCharStr = str;
            str = new char[oldLength + numberCharStr.length];
            for (int j = 0 ; j < tempCharStr.length ; j++) {
                str[j] = tempCharStr[j];
            }
            for (int j = 0 ; j < numberCharStr.length ; j++) {
                str[oldLength + j] = numberCharStr[j];
            }
        }
        // 生成的密码的长度
        final int maxNum = str.length;
        StringBuffer pwd = new StringBuffer();
        Random r = new Random();
        while (count < passwordLength) {
            // 生成随机数，取绝对值，防止生成负数，
            i = Math.abs(r.nextInt(maxNum));
            if (i >= 0 && i < str.length) {
                pwd.append(str[i]);
                count++;
            }
        }
        return pwd.toString();
    }

    //    public static void main(String[] args) {
    //        //        char[] str = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', /*'l',*/ 'm', 'n', /*'o',*/ 'p', 'q', 'r', 's', 't', /*'u', 'v',*/ 'w', 'x', 'y', 'z', /*'0', '1',*/ '2', '3', '4', '5', '6', '7', '8', '9' };
    //        //        System.out.println(str.length);
    //        for (int i = 0 ; i < 5 ; i++) {
    //            System.out.println(genRandomNum(8));
    //        }
    //
    //    }
}
