package com.rest;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class AutomateGet {
	
	@Test
	public void validate_get_status_code() {
		given().
		baseUri("https://api.postman.com/").
		header("x-api-key","PMAK-632c0c35e51ebd06db535ce2-7f5bffca3551dfc218a18e145739304bc7").
		
		when().
		get("workspaces").
		
		then().
		log().all().
		assertThat().
		statusCode(200);
		
		
	}

}
