package com.anlov;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;

class PostmanTest extends BaseTest {

    @Test
    @DisplayName("Check uri")
    public void checkGet() {
        baseUri
                .when().get("/get")
                .then()
                .spec(statusCode);
    }

    @Test
    @DisplayName("Check Post")
    public void checkPost() {
        baseUri
                .contentType("application/json").body(michail)
                .when().post("/post")
                .then()
                .body("json.name", equalTo(michail.getName()))
                .body("json.work", equalTo(michail.getWork()))
                .spec(statusCode);
    }

    @Test
    @DisplayName("Check Put")
    public void checkPut() {
        baseUri
                .contentType("application/json").body(michail.toJson())
                .when().put("/put")
                .then()
                .body("json.name", equalTo(michail.getName()))
                .body("json.work", equalTo(michail.getWork()))
                .spec(statusCode);
    }

    @Test
    @DisplayName("Check Patch")
    public void checkPath() {
        baseUri
                .contentType("application/json").body(michail.toJson())
                .when().patch("/patch")
                .then()
                .body("json.name", equalTo(michail.getName()))
                .body("json.work", equalTo(michail.getWork()))
                .spec(statusCode);

    }

    @Test
    @DisplayName("Check Delete")
    public void checkDel() {
        baseUri
                .contentType("application/json").body(michail.toJson())
                .when().delete("/delete")
                .then()
                .body("json.name", equalTo(michail.getName()))
                .body("json.work", equalTo(michail.getWork()))
                .spec(statusCode);
    }
}
