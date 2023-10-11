import java.util.*;

public class Cipher {
    public String plaintext;
    public String ciphertext;

    //加密
    public String encode(String text) {
        if (text.matches("^[a-zA-Z0-9]{1,16}$")){
            char[] ch = text.toCharArray();
            for (int i = 0; i < ch.length; i++) {
                ch[i] = (char)(ch[i] + i - 2);
            }
            //交换第一个后最后一个字符的位置
            char temp = ch[ch.length - 1];
            ch[ch.length - 1] = ch[0];
            ch[0] = temp;
            StringBuilder sb = new StringBuilder(new String(ch));
            return sb.reverse().toString();
        }
        return null;
    }

    //解密
    public String decode(String text) {
        if (text == null)
            return null;
        StringBuilder sb = new StringBuilder(text);
        char[] ch = sb.reverse().toString().toCharArray();
        char temp = ch[ch.length - 1];
        ch[ch.length - 1] = ch[0];
        ch[0] = temp;
        for (int i = 0; i < ch.length; i++) {
            ch[i] = (char)(ch[i] - i + 2);
        }
        return new String(ch);
    }

    // 判断密码强度 弱强度1，中强度2，高强度3
    public static int strength(String str) {
        if (str.length() < 8)
            return 1;
        boolean typeNum = false;
        boolean typeLowercase = false;
        boolean typeCapital = false;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9')
                typeNum = true;
            else if (ch >= 'A' && ch <= 'Z')
                typeCapital = true;
            else if (ch >= 'a' && ch <= 'z')
                typeLowercase true;
        }
        if (typeNum) {
            if (typeCapital && typeLowercase)
                return 3;
            else if (typeCapital || typeLowercase)
                return 2;
            return 1;
        }
        return 1;
    }
    //随机密码生成
    public static String randomPassword(int len) {
        if (len < 8)
            len = 8;
        char[] arr = new char[len];
        int random;
        char[] table = {'0','1','2','3','4','5','6','7','8','9'
        ,'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'
        ,'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

        //先随机生成三种字符，随机放置
        arr[randomIndex()] = (char)((int)(random() * 10) + 48);
        arr[randomIndex()] = (char)((int)(random() * 26) + 65);
        arr[randomIndex()] = (char)((int)(random() * 26) + 97);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != '\u0000')
                continue;
            random = (int)(Math.random() * 62);
            arr[i] = table[random];
        }
        return new String(arr)
    }
    private int randomIndex(int len, char[] arr) {
        int index = (int)(random() * len);
        while (arr[index] != '\u0000') {
            index = (int)(random() * len);
        }
        return index;

        //new
    }
}