package Model;

import java.awt.*;
import java.util.ArrayList;
import java.util.Date;

public class Idea {
    private int commits;
    private String title;
    private String content;
    private Date dateCreated;
    private ArrayList<Comment> comments;
    private ArrayList<Idea> connections;
    private ArrayList<Image> images;
    private User owner;


    public Idea(int commits, String title, String content, Date dateCreated, ArrayList<Comment> comments, ArrayList<Idea> connections, ArrayList<Image> images, User owner){
        this.commits = commits;
        this.title = title;
        this.dateCreated = dateCreated;
        this.comments = comments;
        this.connections = connections;
        this.images = images;
        this.owner = owner;
    }

    public int getCommits() {
        return commits;
    }

    public void setCommits(int commits) {
        this.commits = commits;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public ArrayList<Comment> getComments() {
        return comments;
    }

    public void setComments(ArrayList<Comment> comments) {
        this.comments = comments;
    }

    public ArrayList<Idea> getConnections() {
        return connections;
    }

    public void setConnections(ArrayList<Idea> connections) {
        this.connections = connections;
    }

    public ArrayList<Image> getImages() {
        return images;
    }

    public void setImages(ArrayList<Image> images) {
        this.images = images;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }
}
