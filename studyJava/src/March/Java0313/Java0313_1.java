package March.Java0313;
class A {
    int m = 3;
    void abc() {
        System.out.println("A 클래스");
    }
}
class B extends A {
    int n = 4;
    void bcd() {
        System.out.println("B 클래스");
    }
}
public class Java0313_1 {
    public static void main(String[] args) {
        A aa = new A();
        System.out.println(aa.m);
        aa.abc();

        B bb = new B();
        System.out.println(bb.m);
        System.out.println(bb.n);
        bb.abc();
        bb.bcd();

        A ab = new B();
        System.out.println(ab.m);
        ab.abc();
    }
}