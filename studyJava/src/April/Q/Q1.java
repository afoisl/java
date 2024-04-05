package April.Q;

public class Q1 {
    public static void main(String[] args) {
        // String 문자열의 소문자는 대문자로, 대문자는 소문자로 변경시킨
        // String 문자열을 리턴하는 메서드(changeCase)를 완성하시오
        String str = "cHanGe CasE";
        String result = changeCase(str);
        System.out.println(result); // ChANgE cASe
    }

    public static String changeCase(String str) {
        String mmm = "";
        for (int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {  // 메서드는 인터넷 참고 했습니다!
                mmm += Character.toLowerCase(ch);
            } else {
                mmm += Character.toUpperCase(ch);
            }
        }
        return mmm;
    }
}
