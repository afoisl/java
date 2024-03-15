package March.Java0313;

public class Ex1 {
    public static void main(String[] args) {
        // 아래 배열중에 짝수만 출력
        int[] arr = new int[] {1, 2, 3, 4, 5};
        int[] even = new int[arr.length];
        for (int i=0; i< arr.length; i++) {
            if (i % 2 != 0) {
                even[i] = arr[i];
            } if (even[i] != 0) {
                System.out.print(even[i] + " ");
            }
        }
    }
}
