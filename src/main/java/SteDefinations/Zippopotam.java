package SteDefinations;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import io.cucumber.messages.internal.com.fasterxml.jackson.core.JsonProcessingException;
//import io.cucumber.messages.internal.com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Assert;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.runner.RunWith;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Zippopotam {

    private static Response response;
    private static String jsonString;

    @When("User hit US postal code API and gets response")
    public void gettingUSResponse()throws Throwable{
        RestAssured.baseURI="http://api.zippopotam.us";
        RequestSpecification request= RestAssured.given();
        response= request.log().all().get("/"+"us"+"/"+"90210");

        jsonString = response.asString();
        System.out.println(jsonString);
        List<Map<String, String>> place = JsonPath.from(jsonString).get("places");
        System.out.println(place.get(0).get("place name"));

        Assert.assertEquals(place.get(0).get("place name"),"Beverly Hills");
    }


    @Then("User hit PAK API")
    public void gettingPakResponse(){
        given().
       // api.zippopotam.us/PK/10010
        when().
                get("http://api.zippopotam.us/PK/10010").
        then().
                assertThat().
                statusCode(200);
    }
    @Then("User hit Turkey API")
    public void gettingTurkeyResponse(){
        given().when().get("http://api.zippopotam.us/TR/01000").
                then().log().body().
                assertThat().
                statusCode(200).
                body("places[0].longitude", equalTo("37.4987")).
                contentType("application/json");

    }

}
