package March.Java0315;

class Food {
    void price() {
    }
}
class Pizza extends Food {
    void price() {
        System.out.println("15,000원");
    }
}
class Pasta extends Food {
    void price() {
        System.out.println("13,000원");
    }
}
public class A {
    public static void main(String[] args) {
        Food[] f = new Food[]{new Pizza(), new Pasta()};
        for (Food food : f) {
            food.price();
        }
    }
}