public class Test20 {
    public static void main(String[] args) {
        String s = "(){}[]";
        boolean flag = false;
        char left1 = '(';
        char right1 = ')';
        char left2 = '{';
        char right2 = '}';
        char left3 = '[';
        char right3 = ']';

        for (int i = 0; i < s.length(); i++) {
            for (int j = s.length(); j > i; j--) {
                if(s.charAt(i) == left1 && s.charAt(j) == right1){
//                    s.charAt(i) = ' ';
                }
            }
        }
    }
}
