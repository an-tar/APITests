package objects;

public class PlayerGetAllResponseDTO {
    public Integer id;
    public String screenName;
    public String gender;
    public Integer age;

    public PlayerGetAllResponseDTO(Integer id, String screenName, String gender, Integer age) {
        this.id = id;
        this.screenName = screenName;
        this.gender = gender;
        this.age = age;
    }

    public PlayerGetAllResponseDTO() {}

    public Integer getId() {
        return id;
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
}
