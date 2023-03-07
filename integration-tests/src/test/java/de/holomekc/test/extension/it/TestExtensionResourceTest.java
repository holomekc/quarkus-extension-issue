package de.holomekc.test.extension.it;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class TestExtensionResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
                .when().get("/test-extension")
                .then()
                .statusCode(200)
                .body(is("Hello test-extension"));
    }
}
