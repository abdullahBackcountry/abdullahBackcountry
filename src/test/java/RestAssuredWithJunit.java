import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseBuilder;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.codehaus.groovy.util.ListHashMap;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

@RunWith(DataProviderRunner.class)
public class RestAssuredWithJunit {
    private static Response response;
    private static String jsonString;

    private static RequestSpecification requestSpec = new RequestSpecBuilder().setBaseUri("http://api.zippopotam.us").build();

    @DataProvider
    public static Object[][] zipCodesAndPlaces(){
        return new Object[][] {
                { "us", "90210", "Beverly Hills" },
                { "us", "12345", "Schenectady" },
                { "ca", "B2R", "Waverley"},
                {"nl", "1001", "Amsterdam"}
        };
    }

    @Test
    @UseDataProvider("zipCodesAndPlaces")
    public void apiTest(String countryCode, String zipCode, String expectedPlaceName){

        Location location =
                given().spec(requestSpec).
                pathParams("contryCode",countryCode).pathParams("zipCode",zipCode)
                .when()
                .get("{contryCode}/{zipCode}").as(Location.class);

        Assert.assertEquals(expectedPlaceName,location.getPlaces().get(0).getPlaceName());

    }

    @Test
    public void aNewAPI(){
        RequestSpecification reqspec = new RequestSpecBuilder().setBaseUri("https://hotels4.p.rapidapi.com/")
                .addHeader("x-rapidapi-host","hotels4.p.rapidapi.com")
                .addHeader("x-rapidapi-key","8bfb90dc5bmsh2cf1eccf53dd524p15c6fejsn752d6021bb1a")
        .build();

        Example example =
                given().spec(reqspec).pathParams("location","locations").pathParams("version","v2").pathParams("search","search")
                .queryParam("query", "new york").queryParam("locale", "en_US").queryParam("currency", "USD")
                .when().log().all().get("{location}/{version}/{search}").as(Example.class);


        Assert.assertEquals(example.getSuggestions().get(0).getEntities().get(0).getGeoId(),"2621");
//                .then().assertThat().body("suggestions[0].entities[0].geoId",equalTo("2621"))

    }
}
