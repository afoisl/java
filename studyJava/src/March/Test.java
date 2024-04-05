package March;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /*int[] a = new int[10];
        int len = a.length;
        for (int i=0; i<a.length; i++) {
            a[i] = len;
            len = len - 1;
        }
        System.out.println(Arrays.toString(a));*/

//        int[] a = new int[10];
//        int len = a.length;
//        for (int i = 0; i < a.length; i++) {
//            a[i] = len;
//            len = len - 1;
//        }
//        System.out.println(Arrays.toString(a));
//
//
//        String[] fruitList = {"사과", "배", "사과", "바나나", "딸기", "사과", "수박"};
//        int count = 0;
//        for (int i = 0; i < fruitList.length; i++) {
//            if (fruitList[i] == "사과") {
//                count = count + 1;
//            }
//        }
//        System.out.println(count);
//
//        /*String str = "내 이름은 [홍길동]입니다. 나이는 [15]살 입니다";
//        String name;
//        int age;
//        name = str.substring(7,10);
//        age = str.indexOf(" ",14);
//        System.out.println(name);
//        System.out.println(age);*/
//
//        char[] week = {'월', '화', '수', '목', '금', '토', '일'};
//        Scanner scan = new Scanner(System.in);
//        System.out.print("0~6까지 숫자를 입력해주세요 : ");
//        int num = scan.nextInt();
//            if (num >= 0 && num <=6) {
//                System.out.println(week[num]);
//            }else {
//                System.out.println("잘못입력하셨습니다.");
//            }
//        }


//        String[] members = {"Steve", "Tom", "Michael", "Laura", "Jessica", "Annie"};
//        Scanner sc = new Scanner(System.in);
//        System.out.print("이름을 입력해주세요 : ");
//        String inputstr = sc.nextLine();
//        boolean found = false;
//        for (int i = 0; i < members.length; i++) {
//            if (members[i].equalsIgnoreCase(inputstr)) {
//                System.out.println(members[i] + "님 환영합니다");
//                found = true;
////                break;
//            }
//        }
//        if (!found)
////            if (i == members.length - 1) {
//            System.out.println("회원가입해주세요");
//    }
//}
//        int k = 0;
//        for ( ; k< members.length; k++)
//            if (members[k].equalsIgnoreCase(inputstr)) {
//                System.out.println(members[k] + "님 환영합니다");
//                break;
//        }
//        if (k == members.length) {
//            System.out.println("회원가입해주세요");
//        }

        int[] arr = new int[10];

        Scanner sc = new Scanner(System.in);
        System.out.print("양의 정수 10개를 입력하세요 : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt(); }   // nextInt는 값을 기다림
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 3 == 0) {
                    System.out.println(arr[i] + " ");

            }
        }
    }
}
