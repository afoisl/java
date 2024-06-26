package March.Java0328;

public class Teacher {
    String teacherID;
    String tName;

    public Teacher(String teacherID, String tName) {
        this.teacherID = teacherID;
        this.tName = tName;
    }

    public String getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(String teacherID) {
        this.teacherID = teacherID;
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
                ", tName='" + tName + '\'' +
                '}';
    }
}
