package March.Java0328;

import java.util.ArrayList;
import java.util.List;

public class FreeBoard {
    String freeBoardID;
    String content;
    String userID;
    List<Reply> replies = new ArrayList<>();

    public FreeBoard() {
    }

    public FreeBoard(String freeBoardID, String content, String userID, List<Reply> replies) {
        this.freeBoardID = freeBoardID;
        this.content = content;
        this.userID = userID;
        this.replies = replies;
    }

    public String getFreeBoardID() {
        return freeBoardID;
    }

    public void setFreeBoardID(String freeBoardID) {
        this.freeBoardID = freeBoardID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public List<Reply> getReplies() {
        return replies;
    }

    public void setReplies(List<Reply> replies) {
        this.replies.add(new Reply());
    }

    @Override
    public String toString() {
        return "FreeBoard{" +
                "freeBoardID='" + freeBoardID + '\'' +
                ", content='" + content + '\'' +
                ", userID='" + userID + '\'' +
                '}';
    }
}
