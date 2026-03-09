import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class PostmanTest {

    @Test
    public void postmanTesting() {
        Account account = new Account(1, "Текущий счёт", 1668, 992821429, "RUB");

        // Given - When - Then
        given()
                .baseUri("https://postman-echo.com")
                .contentType("application/json")
                .body(account)
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("json.balance", equalTo(882821429));
    }
}
