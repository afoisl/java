package March.Java0328;

public class Reply {
    String replyID;
    String reContent;
    String userID;

    public Reply() {
    }

    public Reply(String replyID, String reContent, String userID) {
        this.replyID = replyID;
        this.reContent = reContent;
        this.userID = userID;
    }

    public String getReplyID() {
        return replyID;
    }

    public void setReplyID(String replyID) {
        this.replyID = replyID;
    }

    public String getReContent() {
        return reContent;
    }

    public void setReContent(String reContent) {
        this.reContent = reContent;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }



    @Override
    public String toString() {
        return "Reply{" +
                "replyID='" + replyID + '\'' +
                ", reContent='" + reContent + '\'' +
                ", userID='" + userID + '\'' +
                '}';
    }
}
