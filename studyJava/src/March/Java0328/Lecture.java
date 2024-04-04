package March.Java0328;

public class Lecture {
    private int lectureID;
    private String title;
    private int numOfStu;
    private int playTime;
    private Category Category;

    public Lecture() {
    }

    public Lecture(int lectureID, String title, int numOfStu, int playTime, March.Java0328.Category category) {
        this.lectureID = lectureID;
        this.title = title;
        this.numOfStu = numOfStu;
        this.playTime = playTime;
        Category = category;
    }

    public int getLectureID() {
        return lectureID;
    }

    public void setLectureID(int lectureID) {
        this.lectureID = lectureID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumOfStu() {
        return numOfStu;
    }

    public void setNumOfStu(int numOfStu) {
        this.numOfStu = numOfStu;
    }

    public int getPlayTime() {
        return playTime;
    }

    public void setPlayTime(int playTime) {
        this.playTime = playTime;
    }

    public March.Java0328.Category getCategory() {
        return Category;
    }

    public void setCategory(March.Java0328.Category category) {
        Category = category;
    }

    @Override
    public String toString() {
        return "Lecture{" +
                "lectureID=" + lectureID +
                ", title='" + title + '\'' +
                ", numOfStu=" + numOfStu +
                ", playTime=" + playTime + "분" +
                ", Category=" + Category +
                '}';
    }
}


