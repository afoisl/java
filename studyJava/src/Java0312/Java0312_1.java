package Java0312;

import java.util.Arrays;

public class Java0312_1 {
    public static void main(String[] args) {
        int [] arr = new int [] {1, 2, 8, 3, 2, 2, 2, 5, 1}; // 숫자배열은 반드시 양의 정수다
        int [] fr = new int [arr.length];
        int visited = -1; // 배열에서 볼 수 없는 숫자여야함
        for(int i = 0; i < arr.length; i++){
            int count = 1; // 내가 들고 있는 숫자부터 카운트
            if (fr[i] == visited) {
                continue;
            }
            for(int j = i+1; j < arr.length; j++){ // 내 오른쪽 다음 것부터 체크
                if(arr[i] == arr[j]){
                    count++;
                    fr[j] = visited; //
                }
            }
            if(fr[i] != visited)
                fr[i] = count;
            System.out.println(Arrays.toString(fr));
        }
        for(int i = 0; i < fr.length; i++){
            if(fr[i] != visited)
                System.out.println("    " + arr[i] + "    |    " + fr[i]);
        }
    }
}
