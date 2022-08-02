package com.cybertek.utilities;

import org.junit.jupiter.api.BeforeAll;
import static io.restassured.RestAssured.baseURI;

public abstract class SpartanAuthTestBase {


    @BeforeAll
    public static void init(){
        //save baseurl inside this variable so that we dont need to type each http method.
        baseURI = "http://3.85.205.189:7000";

    }


}
