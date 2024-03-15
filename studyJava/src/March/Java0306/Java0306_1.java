package March.Java0306;

import java.util.Arrays;

public class Java0306_1 {
    public static void main(String[] args) {
        //문자열 수정
        // @toLowerCase(), @toUpperCase()
        String str1 = "Java Study";
        System.out.println(str1.toLowerCase());
        System.out.println(str1.toUpperCase());

        // @replace()
        // target을 찾지 못하면 변경하지 않고 원본 그대로 리턴
        System.out.println(str1.replace("Study", "공부"));

        // @substring()
        // (0 <= 범위 < 5)
        System.out.println(str1.substring(0,5));

        // @split()
        // 연산자를 이용하여 ':'와 '/'기준으로 분리시킴
        // split 메소드의 리턴형은 String[] 문자열의 배열이다 !!
        String[] strArray = "abc/def-dhi jkl".split("[/\\- ]");
        System.out.println(Arrays.toString(strArray));

        // @trim()
        System.out.println("   abc   ".trim());

        // 모든 공백 지우기
        System.out.println("  abc   def  ".replaceAll(" ", ""));

        // 문자열을 지울때 : "Tom" -> ""

        System.out.println();

        // 문자열의 내용 비교
        String str2 = new String("Java");
        String str3 = new String("Java");
        String str4 = new String("java");

        // @stack 메모리 비교(==): 위치(번지) 비교
        System.out.println(str2 == str3);
        System.out.println(str3 == str4);
        System.out.println(str4 == str2);

        // @equals(). equalsIgnoreCase(): 내용 비교
        System.out.println(str2.equals(str3));
        System.out.println(str3.equals(str4));
        System.out.println(str3.equalsIgnoreCase(str4));
    }
}
