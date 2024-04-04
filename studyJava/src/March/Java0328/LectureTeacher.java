package March.Java0328;

public class LectureTeacher {
    String teacherID;
    int lectureID;

    public LectureTeacher() {
    }

    public LectureTeacher(String teacherID, int lectureID) {
        this.teacherID = teacherID;
        this.lectureID = lectureID;
    }

    public String getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(String teacherID) {
        this.teacherID = teacherID;
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
                "teacherID='" + teacherID + '\'' +
                ", lectureID=" + lectureID +
                '}';
    }
}