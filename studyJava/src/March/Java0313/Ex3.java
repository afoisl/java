package March.Java0313;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};  // int 형 'arr' 배열 선언

        Scanner a = new Scanner(System.in);
        System.out.print("1~5에서 하나의 숫자를 입력해주세요 : " );
        int inNum = a.nextInt();
        for (int i = 0; i < inNum; i++) {
            int j, first;

            first = arr[0];  // 포인트 1
            for (j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[j] = first;  // 포인트 2
        }
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
