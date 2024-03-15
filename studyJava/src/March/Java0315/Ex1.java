package March.Java0315;

public class Ex1 {
    public static void main(String[] args) {
        // 아래 문자열의 모음과 자음의 갯수를 각각 count 하시오
        // 모음 a e i o u
        // 스페이스는 문자 아님

        String str = "This is a really simple sentence";
        char[] gather = {'a', 'e', 'i', 'o', 'u'};
        int count = 0;
        int not = 0;
        for (int i = 0; i < gather.length; i++) {
            for (int j = 0; j < str.length(); j++) {
                if (gather[i] == str.charAt(j)) {
                    count = count + 1;
                }
            }
        }
        System.out.println("모음 : " + count);

//        for (int i = 0; i < str.length() - 24; i++) {
//                if (gather[i] != str.charAt(i)) {
//                    not = not + 1;
//                } if (' ' == str.charAt(i)) {
//                    not = not - 1;
//            }
//        }
        System.out.println("자음 : " + not);
    }
}

