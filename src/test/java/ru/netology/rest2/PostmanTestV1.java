package ru.netology.rest2;

import io.restassured.http.ContentType;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class PostmanTestV1 {
    @Test
    public void shouldReturnDemoAccounts() {
        given()
            .baseUri("https://postman-echo.com")
            .contentType("text/plain; charset=UTF-8")
            .body("some data")
       .when()
            .post("/post")
       .then()
            .statusCode(200)
            .body("data", equalTo("some data"))
        ;
    }
}
