package March.Java0304;

public class Java0304 {

    public static void main(String[] args) {

            /* 무한루프
             조건식이 false가 될 수 있는지 여부를 반드시 확인!!!*//*
            for (int i = 0;; i++) {
                System.out.println(i);*/

        // for 문 기본 문법 구조
        int a;
        for (a = 0; a < 3; a++) {
            System.out.println(a + "");
        }
        System.out.println();

        for(int i = 0; i < 3; i++) {
            System.out.println(i + "");
        }
        System.out.println();

        for (int i = 0; i <100; i++) {
            System.out.println(i + "");
        }
        System.out.println();

        for (int i = 10; i > 0; i--) {
            System.out.println(i + "");
        }
        System.out.println();

        for (int i = 0; i < 10; i +=2) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0, j = 0; i < 10; i++, j++) {
            System.out.print(i + j + " ");
        }

        System.out.println();

        for(int i = 0; ; i++) {
            if(i > 10) {
                break;
            }
            System.out.print(i + " ");
        }
        System.out.println("무한 루프 탈출");

//                for문 변형하기
        int i = 0;
        for(; ; ) {
            if (i < 5) {
                System.out.print(i + " ");
                i++;
            } else {
                break;
            }
        }
        System.out.println();

        // 멀티 조건식
        for (int c = 0, b= 0; c < 5 || b < 5; c++, b++) {
            System.out.print(c + "_" + b + " ");
        }
        System.out.println();
        System.out.println();

        // while 문
        int count = 0;  // 초기식
        while (count < 5) {  // 조건식
            System.out.print(count + " ");
            count++;  // 증감식
        }
        // 의도적인 무한루프에서 while문은 자주 쓰임
        /*while (true) {
            // 무한루프
            // 유저가 버튼 클릭할때까지 대기
            // if (esc버튼 클릭)
            // break;
        }*/
        System.out.println();

        // do ~ while 문
        int cnt = 5;  // 초기식
        do {
            System.out.print(cnt + " ");
            cnt++;
        }while (cnt < 5);
        // 아래 while문과 비교하면,
        // 반복문의 조건이 처음부터 false인 경우,
        // do ~ while문은 실행코드가 1회 실행되는 반면.
        // while문은 실행되지 않음 !!
        int cnt1 = 5;
        while (cnt1 < 5) {
            System.out.print(cnt1 + " ");
            cnt1++;
        }
        System.out.println();

        // 이중루프, 이중반복문
        for (int o=0; o<3; o++) {
            for (int j=0; j<5; j++) {
                System.out.println("[i=" + o + ", j=" + j + "]");
            }
        }
    }
}
