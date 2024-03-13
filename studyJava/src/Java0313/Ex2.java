package Java0313;

import javax.lang.model.element.NestingKind;
import java.util.Arrays;

public class Ex2 {
    public static void main(String[] args) {
        // 아래 문자열의 글자수를 카운트
        // 스페이스는 카운트하지 마시오
        String string = "The best of both worlds";
        int count = 0;
        char[] ar = string.toCharArray();
        for (int i = 0; i < ar.length; i++) {
            if (string.charAt(i) != ' ') {
                count++;
            }
        }
            System.out.println(count);
        }
    }


