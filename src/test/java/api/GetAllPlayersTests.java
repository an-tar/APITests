package api;

import objects.PlayerGetAllResponseDTO;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.PropertyProvider;
import utils.Specification;
import java.util.List;

import static io.restassured.RestAssured.given;

public class GetAllPlayersTests {

    @Test(description = "Get all players")
    public void getAllPlayersTest(){
        Specification.installSpecification(Specification.requestSpec(PropertyProvider.getConfigData("url")), Specification.responseSpecStatusCode(200));

        List<PlayerGetAllResponseDTO> players = given()
                .when()
                .get("/player/get/all")
                .then().log().all()
                .extract().body().jsonPath().getList("players", PlayerGetAllResponseDTO.class);

        Assert.assertTrue(players.stream().allMatch(x -> x.getId() > 0));
    }
}
