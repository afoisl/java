package March.Java0328;

import March.Java0326.A;

import java.util.ArrayList;
import java.util.Objects;

public class Edu {
    static ArrayList<User> users;
    static ArrayList<Lecture> lectures;
    static ArrayList<ReLecture> reLectures;
    static ArrayList<Review> reviews;

    public static void main(String[] args) {
        // 정보 초기화
        InfoCreate.createInfo();

        // 강의 ID로 수강하는 학생의 loginId 찾기
        getLoginIdByLectureId(1);
        // 유저의 loginId로 강의명 찾기
        getTitleByLoginId("나는유리");
        // 강의명으로 수강생들의 이메일 찾기
        getEmailByLectureTitle("Python");

        createReview(8, "재밌어요", "나는짱구", 1);
    }

    public static void getLoginIdByLectureId(int lectureID) {
        for (int i = 0; i < reLectures.size(); i++) {
            if (reLectures.get(i).getLectureID() == lectureID) {
                System.out.println(reLectures.get(i).getUserID());
            }
        }
    }

    public static void getTitleByLoginId(String userID) {
        for (int i = 0; i < reLectures.size(); i++) {
            if (reLectures.get(i).getUserID().equals(userID)) {
                int lectureID = reLectures.get(i).lectureID;
                for (int j = 0; j < lectures.size(); j++) {
                    if (lectures.get(j).lectureID == lectureID) {
                        String lectureTitle = lectures.get(j).getTitle();
                        System.out.println(lectureTitle);
                    }
                }
            }
        }
    }

    public static void getEmailByLectureTitle(String lectureTitle) {
        int lectureID = -1;
        for (int i = 0; i < lectures.size(); i++) {
            if (lectures.get(i).getTitle() == lectureTitle) {
                lectureID = lectures.get(i).getLectureID();
                break;
            }
        }
        if (lectureID < 0) {
            return;
        }
        for (int i = 0; i < reLectures.size(); i++) {
            if (reLectures.get(i).getLectureID() == lectureID) {
                String userID = reLectures.get(i).getUserID();
                for (int j = 0; j < users.size(); j++) {
                    if (users.get(j).getUserID().equals(userID)) {
                        String email = users.get(j).getEmail();
                        System.out.println(email);
                    }
                }
            }
        }
    }

    public static boolean createReview(int rating, String text, String userID, int lectureID) {
        if (rating < 1 || rating > 10) {
            System.out.println("1에서 10사이의 숫자를 입력하세요.");
            return false;
        }

            for (int i = 0; i < reviews.size(); i++) {
                if (Objects.equals(reviews.get(i).getUserID(), userID)) {
                    System.out.println("하나의 강의에만 리뷰를 남길 수 있습니다.");
                    return false;
                }
            }

            for (int i = 0; i < reLectures.size(); i++) {
                if (reLectures.get(i).lectureID == lectureID) {
                    String uID = reLectures.get(i).getUserID();
                    if (userID == uID) {
                        break;
                    }
                    System.out.println("본인이 수강한 강의만 리뷰할 수 있습니다.");
                    return false;
                }
            }
            return true;
        }
    }

