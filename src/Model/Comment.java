package Model;

public class Comment {
    private String content;
    private int commentId;
    private int ideaId;
    private int userId;
    private int taggedUserIds;

    public Comment(String content, int commentId, int ideaId, int userId, int taggedUserIds) {
        this.content = content;
        this.commentId = commentId;
        this.ideaId = ideaId;
        this.userId = userId;
        this.taggedUserIds = taggedUserIds;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public int getIdeaId() {
        return ideaId;
    }

    public void setIdeaId(int ideaId) {
        this.ideaId = ideaId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getTaggedUserIds() {
        return taggedUserIds;
    }

    public void setTaggedUserIds(int taggedUserIds) {
        this.taggedUserIds = taggedUserIds;
    }
}
