package com.cybertek.utilities;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import static io.restassured.RestAssured.baseURI;

public class SpartanTestBase {


    @BeforeAll
    public static void init(){
        //save baseurl inside this variable so that we dont need to type each http method.
        baseURI = "http://3.85.205.189:8000";

        String dbUrl = "jdbc:oracle:thin:@3.85.205.189:1521:xe";
        String dbUsername = "SP";
        String dbPassword = "SP";

        //DBUtils.createConnection(dbUrl,dbUsername,dbPassword);

    }
    @AfterAll
    public static void teardown(){

        //DBUtils.destroy();
    }

}
