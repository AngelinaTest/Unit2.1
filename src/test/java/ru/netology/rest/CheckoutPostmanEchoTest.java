package ru.netology.rest;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class CheckoutPostmanEchoTest {
    @Test
    void shouldCheckoutPostmanEcho() {
        // Given - When - Then
        // Предусловия
        given()
            .baseUri("https://postman-echo.com")
            .contentType("text/plain; charset=UTF-8")
            .body("hello") // отправляемые данные (заголовки и query можно выставлять аналогично)
        // Выполняемые действия
        .when()
            .post("/post")
        // Проверки
        .then()
            .statusCode(200)
            .body("data", equalTo("hello"))
        ;
    }
}
