package api;

import enums.Gender;
import enums.Role;
import objects.PlayerCreateResponseDTO;
import objects.PlayerIdRequestDTO;
import org.testng.annotations.Test;
import utils.PropertyProvider;
import utils.RandomUtils;
import utils.Specification;

import static io.restassured.RestAssured.given;

public class DeletePlayerTests {
    int age = RandomUtils.getRandomNumber(17, 59);
    String login = RandomUtils.getRandomString(8);
    String password = RandomUtils.getRandomString(8);
    String screenName = RandomUtils.getRandomString(8);

    @Test(description = "Delete player")
    public void deletePlayerTest() {

        Specification.installSpecification(Specification.requestSpec(PropertyProvider.getConfigData("url")), Specification.responseSpecStatusCode(200));

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

        Specification.installSpecification(Specification.requestSpec(PropertyProvider.getConfigData("url")), Specification.responseSpecStatusCode(204));

        PlayerIdRequestDTO playerIdDTO = new PlayerIdRequestDTO(player.getId());
        given().body(playerIdDTO)
               .delete("player/delete/{editor}", PropertyProvider.getConfigData("supervisorLogin"))
               .then().log().all();
    }
}
