package API;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class HardCodedExamples {

    String baseURI = RestAssured.baseURI = "http://hrm.syntaxtechs.net/syntaxapi/api";
    String token = "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE2ODQ4ODc4NDEsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTY4NDkzMTA0MSwidXNlcklkIjoiNTI5MiJ9.3nC89VfAVDnMU_k8TattfN_1fNV-1NxGZGJUrdHs7ug";

    @Test
    public void createEmployee() {
        //prepare the request
        RequestSpecification preparedRequest = given().
                header("Content-Type", "application/json").
                header("Authorization", token).body("{\n" +
                        "  \"emp_firstname\": \"Jason\",\n" +
                        "  \"emp_lastname\": \"Mike\",\n" +
                        "  \"emp_middle_name\": \"Petro\",\n" +
                        "  \"emp_gender\": \"M\",\n" +
                        "  \"emp_birthday\": \"1997-05-20\",\n" +
                        "  \"emp_status\": \"Employeed\",\n" +
                        "  \"emp_job_title\": \"Doctor\"\n" +
                        "}");

        //hitting the endpoint / send the request
        Response response = preparedRequest.when().post("/createEmployee.php");
        //it will print the output in the console
        response.prettyPrint();
        //verifying the assertions / get response
        response.then().assertThat().statusCode(201);

        //verifying the firstname in the response body
        response.then().assertThat().
                body("Employee.emp_firstname", equalTo("Jason"));
        System.out.println("My test case is passed");

    }

}
