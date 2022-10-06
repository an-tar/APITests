package api;

import enums.Gender;
import enums.Role;
import objects.PlayerCreateResponseDTO;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.PropertyProvider;
import utils.RandomUtils;
import utils.Specification;

import static io.restassured.RestAssured.given;

public class CreatePlayerTests {

    int age = RandomUtils.getRandomNumber(17, 59);
    String login = RandomUtils.getRandomString(12);
    String password = RandomUtils.getRandomString(10);
    String screenName = RandomUtils.getRandomString(12);

    @Test(description = "Create new player")
    public void createNewPlayerTest() {
        Specification.installSpecification(Specification. requestSpec(PropertyProvider.getConfigData("url")), Specification.responseSpecStatusCode(200));

        PlayerCreateResponseDTO player = given()
                .param("age", age)
                .param("gender", Gender.MALE.getValue())
                .param("login", login)
                .param("password", password)
                .param("role", Role.USER.getValue())
                .param("screenName", screenName)
                .get("/player/create/{editor}", PropertyProvider.getConfigData("supervisorLogin"))
                .then().log().all()
                .extract().as(PlayerCreateResponseDTO.class);

        Assert.assertEquals(player.getLogin(), login);
    }
}
