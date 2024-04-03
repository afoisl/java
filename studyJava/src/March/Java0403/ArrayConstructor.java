package March.Java0403;

interface AC {
    int[] methodAc(int length);
}
public class ArrayConstructor {
    public static void main(String[] args) {
        // 함수형 인터페이스 메서드가 입력된 갯수만큼의 정수 배열을 리턴하는 경우
        AC a0 = new AC() {  // 익명 이너 클래스
            @Override
            public int[] methodAc(int length) {
                return new int[length];
            }
        };
        AC a1 = (int length) -> {return new int[length];};  // 리턴과 중괄호 생략 가능
        AC a2 = int[]::new;
        int[] array1 = a2.methodAc(10);
        System.out.println(array1.length);
    }
}
