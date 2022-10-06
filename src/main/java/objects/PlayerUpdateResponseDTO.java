package objects;

public class PlayerUpdateResponseDTO {

    public Integer age;
    public String gender;
    public Integer id;
    public String login;
    public String role;
    public String screenName;

    public PlayerUpdateResponseDTO(Integer age, String gender, Integer id, String login, String role, String screenName) {
        this.age = age;
        this.gender = gender;
        this.id = id;
        this.login = login;
        this.role = role;
        this.screenName = screenName;
    }

    public PlayerUpdateResponseDTO() {
    }

    public Integer getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public Integer getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getRole() {
        return role;
    }

    public String getScreenName() {
        return screenName;
    }
}
