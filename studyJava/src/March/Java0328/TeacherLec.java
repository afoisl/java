package March.Java0328;

public class TeacherLec {
    String teacherID;
    String lecName;

    public TeacherLec() {
    }

    public TeacherLec(String teacherID, String lecName) {
        this.teacherID = teacherID;
        this.lecName = lecName;
    }

    public String getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(String teacherID) {
        this.teacherID = teacherID;
    }

    public String getLecName() {
        return lecName;
    }

    public void setLecName(String lecName) {
        this.lecName = lecName;
    }

    @Override
    public String toString() {
        return "TeacherLec{" +
                "teacherID='" + teacherID + '\'' +
                ", lecName='" + lecName + '\'' +
                '}';
    }
}
