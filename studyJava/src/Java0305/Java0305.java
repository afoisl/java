package Java0305;

public class Java0305 {
    public static void main(String[] args) {
        // break = 제어문의 중괄호를 탙출시키는 키워드
        // 자신을 싸고 있는 가장 가까운 중괄호 하나
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (i > 5) {
                break;
            }
        }

        // 이중 for문에서의 break 사용법
        out: // out이 예약어는 아님
        /*for (int i = 0; i < 10; i++) {
            if (i % 2 == 1) {
                continue;
            }
                System.out.println(i);
            }*/

        for (int i=0; i<5; i++) {
            for (int j=0; j<5; j++) {
                if (j == 3) {
                    continue;
                }
                System.out.println(i + ", " + j);
            }
        }
    }
}

