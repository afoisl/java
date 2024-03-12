import java.rmi.ServerRuntimeException;
import java.util.Arrays;

public class Java0305String {
    public static void main(String[] args) {
        // String 클래스의 첫번째 특징
        // 객체의 값을 변경하면 새로운 객체를 생성 (주소값이 새로운 주소로 변경)
        // String 객체 변수는 값이 수정되지 않고 항상 새로운 값을 만듬 !
        String str1 = new String("Start");
        String str2 = str1;
        System.out.println(str1);
        System.out.println(str2);
        str1 = "end";
        System.out.println(str1);
        System.out.println(str2);

        // String 클래스의 두번째 특징
        // 리터럴로 입력하는 경우, 해당 문자열을 재사용(=공유)함
        // 리터럴로 입력되는 값은 런타임 이전에 이미 메모리에 만들어짐
        String str5 = new String("Start");
        String str3 = "Start";
        String str4 = "Start";
        System.out.println(str3 == str4);
        System.out.println(str3 == str5);

        // 문자열의 '+' 연산
        String a1 = "Hello";
        String a2 = "World";
        System.out.println(a1 + " " + a2);
        String a3 = a1 + " " + a2;
        System.out.println(a3);


        // 문자열과 숫자열의 '+' 연산
        System.out.println(1 + "Hi"); // 1Hi
        System.out.println(1 + 2 + "Hi"); // 3Hi
        System.out.println("Hi" + 1 + 2); // Hi12

        //문자열 + 문자행
        String s1 = "안녕" + "하세요" + "!";
        System.out.println(s1);

        String s2 = "반갑";
        s2 += "습니다";
        s2 += "!";
        System.out.println(s2);
        System.out.println();

        // 문자열 + 기본 자료형 또는 기본 자료형 + 문자열
        String s3 = "안녕" + 1;
        String s4 = "안녕" + String.valueOf(1);
        String s5 = "안녕" + "1";

        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println();

        // 문자열과 기본 자료형 혼용
        // 앞에서부터 차례대로 '+' 연산 수행
        System.out.println(1 + "안녕");
        System.out.println(1 + "안녕" + 2);
        System.out.println("안녕" + 1 + 2);
        System.out.println(1 + 2 + "안녕");

        String m = "Hello World";
        String n = "안녕하세요! 반갑습니다1";
        System.out.println(m.charAt(3));

        String z1 = "안녕" + 3;
        String z2 = "안녕".concat(String.valueOf(3));

        String z3 = "Hello Java!";
        String z4 = "안녕하세요";

        byte[] array1 = z3.getBytes();
        byte[] array2 = z4.getBytes();
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
    }
}
