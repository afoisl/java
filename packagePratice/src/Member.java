public class Member {
    static String name;
    int age;

    static {
        name = "홍길동";
    }

    public Member() {  // Heap 영역에 해당요소를 생성할 때 사용
    }

    public Member(int age) {
        this.age = age;
    }
}
