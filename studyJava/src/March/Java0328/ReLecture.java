package March.Java0328;

public class ReLecture {
    String userID;
    int lectureID;

    public ReLecture() {
    }

    public ReLecture(String userID, int lectureID) {
        this.userID = userID;
        this.lectureID = lectureID;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public int getLectureID() {
        return lectureID;
    }

    public void setLectureID(int lectureID) {
        this.lectureID = lectureID;
    }
}
