package March.Java0315;

class A1 {
    int a = 3;
    final int b = 5;
    A1() {

    }
}
class A2 {
    int a;
    final int b;
    A2() {
        a = 3;
        b = 5;
    }
}
class A3 {
    int a = 3;
    final int b = 5;
    A3() {
        a = 5;
//        b = 9;
    }
}
public class Java0315 {
    public static void main(String[] args) {

        A1 a1 = new A1();
        A2 a2 = new A2();

        // 필드값 변경
        a1.a = 7;
//        a1.b = 9;
        a2.a = 7;
//        a2.b = 9;
    }
}
