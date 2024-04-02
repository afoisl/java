package March.Java0328;

public class Teacher {
    String teacherID;
    String lecName;
    String tName;

    public Teacher(String teacherID, String lecName, String tName) {
        this.teacherID = teacherID;
        this.lecName = lecName;
        this.tName = tName;
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

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherID='" + teacherID + '\'' +
                ", lecName='" + lecName + '\'' +
                ", tName='" + tName + '\'' +
                '}';
    }
}
