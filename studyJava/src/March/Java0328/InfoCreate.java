package March.Java0328;

import java.time.LocalDate;
import java.util.ArrayList;

public class InfoCreate {
    public static void createInfo() {

        Edu.users = new ArrayList<>();
        Edu.users.add(new User("짱구", LocalDate.of(2000, 1, 1), "나는짱구", "비밀번호"
                , 000101 - 311111, 010 - 1234 - 5678, "Daegu", "Wkdrn@gmail.com"));
        Edu.users.add(new User("철수", LocalDate.of(2000, 1, 2), "나는철수", "비밀번호"
                , 000102 - 3111112, 010 - 2345 - 5678, "Seoul", "cjftn@gmail.com"));
        Edu.users.add(new User("유리", LocalDate.of(2000, 1, 3), "나는유리", "비밀번호"
                , 000103 - 411111, 010 - 3456 - 7890, "Gumi", "dbfl@gmail.com"));
        Edu.users.add(new User("훈이", LocalDate.of(2000, 1, 4), "나는훈이", "비밀번호"
                , 000104 - 311113, 010 - 4567 - 8901, "Incheon", "gnsdl@gmail.com"));
        Edu.users.add(new User("맹구", LocalDate.of(2000, 1, 5), "나는맹구", "비밀번호"
                , 000105 - 311113, 010 - 5678 - 9012, "Busan", "aodrn@gmail.com"));

        Edu.lectures = new ArrayList<>();
        Edu.lectures.add(new Lecture(1, "JAVA", 20, 150, Category.IT));
        Edu.lectures.add(new Lecture(2, "Kotlin", 20, 140, Category.IT));
        Edu.lectures.add(new Lecture(3, "Python", 20, 145, Category.IT));

        Edu.reLectures = new ArrayList<>();
        Edu.reLectures.add(new ReLecture("나는짱구", 1));
        Edu.reLectures.add(new ReLecture("나는유리", 3));
        Edu.reLectures.add(new ReLecture("나는철수", 2));
        Edu.reLectures.add(new ReLecture("나는훈이", 1));
        Edu.reLectures.add(new ReLecture("나는맹구", 3));

        Edu.reviews = new ArrayList<>();
//        Edu.reviews.add(new Review(101, 9, "재밌어요", "나는짱구", 1));
        Edu.reviews.add(new Review(102, 8, "유익해요", "나는철수", 2));
        Edu.reviews.add(new Review(103, 5, "아쉬워요", "나는훈이", 1));
    }
}
