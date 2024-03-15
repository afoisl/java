package March.Java0307;

import java.util.Scanner;

public class Java0307Scanner {
    public static void main(String[] args) {

        // 자바에서 입력값을 받는 방법
        Scanner sc = new Scanner(System.in);
        System.out.print("0~6까지 숫자를 입력해주세요 : ");
        int inputNumber = sc.nextInt();
        if (inputNumber >= 0 && inputNumber <=6) {
            System.out.println(inputNumber);
        }else {
            System.out.println("잘못입력하셨습니다.");
        }

        // 자바에서 문자열을 입력 받는 방법
        Scanner scn = new Scanner(System.in);
        System.out.print("이름을 입력해주세요 : ");
        String inputStr = scn.nextLine();
        System.out.println(inputStr);
    }
}
