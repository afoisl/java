import java.util.Arrays;
import java.util.Random;

public class Java0307Test {
    public static void main(String[] args) {

//        int[] intList1 = {1,2,3,4,5,6,7,8,9,10};
//        Scanner scan = new Scanner(System.in);
//        System.out.print("0~10까지 숫자를 입력해주세요 : ");
//        int num = scan.nextInt();
//        for(int i=0; i< intList1.length; i++) {
//            if(num < intList1[i]) {
//                System.out.print(intList1[i] + " ");
//            }
//        }

//      새로운 배열에 담기 : ArrayList 사용하기
        // 고정된 배열의 형태를 받아서 양을 가감할때 사용
//        ArrayList<Integer> intList3 = new ArrayList<Integer>();
//        for(int i=0; i< intList1.length; i++) {
//            if (intList1[i] > num) {
//                intList3.add(intList1[i]);
//            }
//        }
//        System.out.println(intList3.toString());

        // 7. 아래 배열의 총합과 평균을 출력
//        int[] numberList = {12, 34, 56, 32, 84, 99, 73, 69};
//        int sum = 0;
//        for (int i = 0; i< numberList.length; i++) {
//            sum += numberList[i];
//        }
//
//        double average = 0;
//        average = (double)sum / (numberList.length);
//
//        System.out.println("총합 : " + sum);
//        System.out.println("평균 : " + average);

        // 8. 사용자로부터 문자열을 입력받아서 입력받은 문자열을 거꾸로 출력
        // ex) hello를 입력하면 olleh를 출력
//        Scanner scan = new Scanner(System.in);
//        System.out.print("입력하세요 : ");
//        String inputstr = scan.nextLine();
//
//        char[] charList1 = inputstr.toCharArray();
//        char[] charList2 = new char[charList1.length];
//        int index = charList2.length - 1;
//        for (int i = 0; i< charList1.length; i++) {
//            charList2[index] = charList1[i];
//            index = index - 1;
//        }for (int i=0; i< charList2.length; i++) {
//            System.out.print(charList2[i]);
//        }

        // 난수생성법, Random 숫자 만드는 법
//        Random rd = new Random();
//        int randNum = rd.nextInt(10); // 0 부터 입력한 (정수값-1) 범위에서 랜덤
//        System.out.println(randNum);

        // 9. 1~45까지 랜덤한 정수를 length가 6인 배열에 넣으시오.
        // 단, 중복 숫자는 허용하지 않음
        int[] lotto = new int[6];
        Random lt = new Random();

        for (int i=0; i< lotto.length; i++) {
            lotto[i] = lt.nextInt(45) + 1;
            for (int j=0; j < i; j++) {
                if(lotto[i]==lotto[j]) {
                    i = i - 1; // i로 다시 가게하기 위한 코드
                }
            }
        }
        System.out.print(Arrays.toString(lotto));

//        for(int i=0; i<5; i++) {
//            System.out.print(i);
//        }
//        System.out.println(i);
    }
}
