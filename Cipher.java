public class Cipher {
    public String plaintext;
    public String ciphertext;

    //加密（修改后）
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

    //解密（修改后）
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
}
