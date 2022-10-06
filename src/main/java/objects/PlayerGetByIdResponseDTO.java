package objects;

public class PlayerGetByIdResponseDTO {

    public Integer id;
    public String login;
    public String password;
    public String screenName;
    public String gender;
    public Integer age;
    public String role;

    public PlayerGetByIdResponseDTO(Integer id, String login, String password, String screenName, String gender, Integer age, String role) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.screenName = screenName;
        this.gender = gender;
        this.age = age;
        this.role = role;
    }

    public PlayerGetByIdResponseDTO() {}

    public Integer getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getScreenName() {
        return screenName;
    }

    public String getGender() {
        return gender;
    }

    public Integer getAge() {
        return age;
    }

    public String getRole() {
        return role;
    }
}
