public class Main {
    public static void main(String[] args) {

        // 관계가 없는 조건을 if else로 설정하면 안됨
        int num = 4;
        if (num > 0) {
            System.out.println("num은 양수");
        } else if (num % 2 == 0) {
            System.out.println("num은 짝수");
        }
        // 독립적인 if문으로 만드는 것이 좋다
        if (num > 0) {
            System.out.println("num은 양수");
        }
        if (num % 2 == 0) {
            System.out.println("num은 짝수");
        }
        // if문 속에 if문
        if (true) {
            if (true) {
                if (true) {
                    System.out.println("if문 속에 if문");
                }
            }
        }
        // switch case
        int number = 2;
        switch (number) {
            case 1:
                System.out.println("A");
                break; // 항상 break 키워드와 함께 쓰자 !!
            case 2:
                System.out.println("B");
                break;
            case 3:
                System.out.println("C");
                break;
            default:
                System.out.println("D");
                break;
        }

        int myScore = 75;

        if (myScore >= 70 && myScore < 80) {
            System.out.println("더 열심히 공부하세요");
        } else if (myScore >= 90) {
            System.out.println("참 잘했어요");
        } else if (myScore >= 80 && myScore < 90) {
            System.out.println("조금만 더 열심히!!");
        } else {
            System.out.println("쿄쿄");
        }

        int a = 8;
        switch(a) {
            case 10:
            case 9:
            case 8:
            case 7:
                System.out.println("Pass"); break;

            default:
                System.out.println("Fail");
        }
    }
}