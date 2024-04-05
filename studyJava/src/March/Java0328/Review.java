package March.Java0328;

public class Review extends ReLecture {
    private int reviewID;
    private int rating;
    private String text;

    public Review() {
    }

    public Review(int reviewID, int rating, String text, String userID, int lectureID) {
        this.reviewID = reviewID;
        this.rating = rating;
        this.text = text;
        super.userID = userID;
        super.lectureID = lectureID;
    }

    public int getReviewID() {
        return reviewID;
    }

    public void setReviewID(int reviewID) {
        this.reviewID = reviewID;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
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
