package com.anlov;

import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.RestAssured.expect;
import static io.restassured.RestAssured.given;

public class BaseTest {

    People michail = new People("Michail", "Driver");

    RequestSpecification baseUri = given()
            .log().body()
            .baseUri("https://postman-echo.com");

    ResponseSpecification statusCode = expect()
            .statusCode(200);
}

