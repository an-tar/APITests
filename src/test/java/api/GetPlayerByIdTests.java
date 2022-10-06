package api;

import enums.Role;
import objects.PlayerIdRequestDTO;
import objects.PlayerGetByIdResponseDTO;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.PropertyProvider;
import utils.Specification;

import static io.restassured.RestAssured.given;

public class GetPlayerByIdTests {
    int supervisorID = 1;

    @Test(description = "Get player by Id")
    public void getPlayerByIdTest(){
        Specification.installSpecification(Specification.requestSpec(PropertyProvider.getConfigData("url")), Specification.responseSpecStatusCode(200));

        PlayerIdRequestDTO playerIdDTO = new PlayerIdRequestDTO(supervisorID);
        PlayerGetByIdResponseDTO player = given()
                .body(playerIdDTO)
                .post("player/get")
                .then().log().all()
                .extract().as(PlayerGetByIdResponseDTO.class);

        Assert.assertEquals(player.getRole(), Role.SUPERVISOR.getValue());
    }
}
