package March.Java0314;

class A {
    A() {
        this(3);
        System.out.println("A 생성자 1");
    }
    A(int a) {
        System.out.println("A 생성자 2");
    }
}
class B extends A {
    B() {
        this(3);
        System.out.println("B 생성자 1");
    }
    B(int a) {
        System.out.println("B 생성자 2");
    }
}
public class Super0314 {
    public static void main(String[] args) {
        A a1 = new A();
        System.out.println();
        A a2 = new A(3);
        System.out.println();

        B b1 = new B();
        System.out.println();
        B b2 = new B(3);
    }
}