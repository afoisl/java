package March.Java0325;

public class Main {
    public static void main(String[] args) {
//        Java0325 java0325 = new Java0325(); // 추상클래스는 인스턴스화 안됨
        JavaChild javaChild = new JavaChild(); javaChild = new JavaChild(); // 추상클래스를 상속한 클래스는 인스턴스화 가능
        System.out.println(javaChild.getValue());
        System.out.println(javaChild.getString());

        System.out.println();

        // 방법1 매개변수사용
        JavaChild javaChild1 = new JavaChild(20, "Apple");
        System.out.println(javaChild1.getValue());
        System.out.println(javaChild1.getString());

        System.out.println();

        // 방법2 세터사용
        JavaChild javaChild2 = new JavaChild();
        javaChild2.setValue(999);
        javaChild2.setString("Banana");
        System.out.println(javaChild2.getValue());
        System.out.println(javaChild2.getString());
    }
}
