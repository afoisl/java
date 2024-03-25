package March.Java0325;

// Java0325의 구현체
public class JavaChild extends Java0325{
    public JavaChild() {
    }

    public JavaChild(int a, String b) {
        super(a, b);
    }

    // 증요 !!
    @Override
    public String getString() {
        return super.b; // this와 super를 구분해두는 습관
    }

    public void setValue(int a) {
        super.setValue(a); // 자바는 세터와 게터 사용을 추천 (자바스타일)
//        super.a = a; // 가능은 하나 비추천 (자바스타일이 아님)
    }

    public void setString(String b) {
        super.setString(b);
    }
}
