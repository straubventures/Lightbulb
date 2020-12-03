package Model;



import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;

public class User {
    private String firstName;
    private String lastName;
    private String emailAddress;
    private Date dateOfBirth;
    private String username;
    private ArrayList<Idea> ideas; //lists the id of each idea owned by the user
    private int comments; // lists the ids of comments owned by the user
    private ArrayList<String> interests; //lists the interests of the user
    private String password;
    private int userId;

    public User(String fn, String ln, String ea, Date dOB, String un, ArrayList<Idea> ideas, int comments, ArrayList<String> interests, String pw, int uId){
        this.firstName = fn;
        this.lastName = ln;
        this.emailAddress = ea;
        this.dateOfBirth = dOB;
        this.username = un;
        this.ideas = ideas;
        this.comments = comments;
        this.interests = interests;
        this.password = pw;
        this.userId = uId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public ArrayList<Idea> getIdeas() {
        return ideas;
    }

    public void setIdeas(ArrayList<Idea> ideas) {
        this.ideas = ideas;
    }

    public int getComments() {
        return comments;
    }

    public void setComments(int comments) {
        this.comments = comments;
    }

    public ArrayList<String> getInterests() {
        return interests;
    }

    public void setInterests(ArrayList<String> interests) {
        this.interests = interests;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
