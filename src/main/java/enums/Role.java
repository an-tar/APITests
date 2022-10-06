package enums;

public enum Role {

    ADMIN("admin"),
    USER("user"),
    SUPERVISOR("supervisor");

    private final String value;

    Role(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
