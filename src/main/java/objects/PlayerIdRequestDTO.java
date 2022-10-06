package objects;

public class PlayerIdRequestDTO {

    private Integer playerId;

    public PlayerIdRequestDTO(Integer playerId) {
        this.playerId = playerId;
    }

    public PlayerIdRequestDTO() {
    }

    public Integer getPlayerId() {
        return playerId;
    }
}
