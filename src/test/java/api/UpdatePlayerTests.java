package api;

import enums.Gender;
import enums.Role;
import objects.PlayerUpdateRequestDTO;
import objects.PlayerUpdateResponseDTO;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.PropertyProvider;
import utils.RandomUtils;
import utils.Specification;

import static io.restassured.RestAssured.given;

public class UpdatePlayerTests {

    int playerId = 1;
    int age  = RandomUtils.getRandomNumber(17, 59);
    String screenName = RandomUtils.getRandomString(7);

    @Test(description = "Update player")
    public void updatePlayerTest() {
        Specification.installSpecification(Specification.requestSpec(PropertyProvider.getConfigData("url")), Specification.responseSpecStatusCode(200));

        PlayerUpdateRequestDTO requestDTO = new PlayerUpdateRequestDTO(age, Gender.MALE.getValue(), PropertyProvider.getConfigData("supervisorLogin"),
                                                        PropertyProvider.getConfigData("supervisorPassword"), Role.SUPERVISOR.getValue(), screenName);
        PlayerUpdateResponseDTO responseDTO = given()
                .when()
                .body(requestDTO)
                .patch("player/update/{editor}/{id}", PropertyProvider.getConfigData("supervisorLogin"), playerId)
                .then().log().all()
                .extract().as(PlayerUpdateResponseDTO.class);

        Assert.assertEquals(responseDTO.getAge(), age);
        Assert.assertEquals(responseDTO.getScreenName(), screenName);
    }
}
