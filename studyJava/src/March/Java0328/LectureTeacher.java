package March.Java0328;

public class LectureTeacher {
    String tName;
    int lectureID;

    public LectureTeacher() {
    }

    public LectureTeacher(String tName, int lectureID) {
        this.tName = tName;
        this.lectureID = lectureID;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public int getLectureID() {
        return lectureID;
    }

    public void setLectureID(int lectureID) {
        this.lectureID = lectureID;
    }

    @Override
    public String toString() {
        return "LectureTeacher{" +
                "tName='" + tName + '\'' +
                ", lectureID='" + lectureID + '\'' +
                '}';
    }
}
