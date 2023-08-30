import java.util.Scanner;

/**
 * @author feng
 * @since 2023/8/30 15:32
 * 1.加密功能：用户输入一个字符串，系统根据规则对字符串进行加密：
 *   	（1）将每个字符的ASCII码加上它在字符串中的位置(1开始)和偏移值3
 *   	（2）将字符串的第一位和最后一位调换顺序
 *   	（3）将字符串反转
 */
public class Demo01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入密码：");
        String password = scanner.nextLine();

        String encryptedPassword = encryptPassword(password);
        System.out.println("加密后的密码：" + encryptedPassword);

       // String openPassword=decryptPassword(password);
       // System.out.println("解密后的密码："+openPassword);
    }

    public static String encryptPassword(String password) {

        char[] chars = password.toCharArray();

        // 步骤1：将每个字符的ASCII码加上它在字符串中的位置(1开始)和偏移值3
        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) (chars[i] + i + 1 + 3);
        }
        //（2）将字符串的第一位和最后一位调换顺序
        char temp=chars[0];
        chars[0]=chars[chars.length-1];
        chars[chars.length-1]=temp;
        //将字符串反转
        for(int i=0;i<chars.length/2;i++){
            char temp1=chars[i];
            chars[i]=chars[chars.length-i-1];
            chars[chars.length-i-1]=temp1;
        }
        String lockPassword=String.valueOf(chars);
        return lockPassword;

    }

    public static String decryptPassword (String password){
        char[] chars = password.toCharArray();
      //解密
        //1.将字符串反转
        for(int i=0;i<chars.length/2;i++){
            char temp1=chars[i];
            chars[i]=chars[chars.length-i-1];
            chars[chars.length-i-1]=temp1;
        }
        //（2）将字符串的第一位和最后一位调换顺序
        char temp=chars[0];
        chars[0]=chars[chars.length-1];
        chars[chars.length-1]=temp;
        // 3.将每个字符的ASCII码减去它在字符串中的位置(1开始)和偏移值3  解密
        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) (chars[i] - i - 1 - 3);
        }
        String lockPassword=String.valueOf(chars);
        return lockPassword;
    }
}
