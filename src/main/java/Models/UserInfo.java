package Models;

public class UserInfo {
    private String FirstName;
    private String LastName;
    private int Age;
    private String Group;
    private String ImgSrc;
    private String GitLink;

    public String getGitLink() {
        return GitLink;
    }

    public void setGitLink(String gitLink) {
        GitLink = gitLink;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getGroup() {
        return Group;
    }

    public void setGroup(String group) {
        Group = group;
    }

    public String getImgSrc() {
        return ImgSrc;
    }

    public void setImgSrc(String imgSrc) {
        ImgSrc = imgSrc;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String name) {
        FirstName = name;
    }
}
