package Utils;

import org.json.JSONObject;

public class APIPayloadConstants {
    //we will pass the body in multiple formats, for this we have created this class

    public static String createEmployeePayload() {
        String createEmployeePayload = "{\n" +
                "  \"emp_firstname\": \"Jason\",\n" +
                "  \"emp_lastname\": \"Mike\",\n" +
                "  \"emp_middle_name\": \"Petro\",\n" +
                "  \"emp_gender\": \"M\",\n" +
                "  \"emp_birthday\": \"1997-05-20\",\n" +
                "  \"emp_status\": \"Employeed\",\n" +
                "  \"emp_job_title\": \"Doctor\"\n" +
                "}";
        return createEmployeePayload;
    }

    public static String createEmployeePayloadJson() {
        JSONObject obj = new JSONObject();
        obj.put("emp_firstname", "Jason");
        obj.put("emp_lastname", "Mike");
        obj.put("emp_middle_name", "Petro");
        obj.put("emp_gender", "M");
        obj.put("emp_birthday", "1997-05-20");
        obj.put("emp_status", "Employeed");
        obj.put("emp_job_title", "Doctor");
        return obj.toString();
    }

    public static String createEmployeePayloadDynamic
            (String emp_firstname, String emp_lastname,
             String emp_middle_name, String emp_gender, String emp_birthday,
             String emp_status, String emp_job_title) {
        JSONObject obj = new JSONObject();
        obj.put("emp_firstname", emp_firstname);
        obj.put("emp_lastname", emp_lastname);
        obj.put("emp_middle_name", emp_middle_name);
        obj.put("emp_gender", emp_gender);
        obj.put("emp_birthday", emp_birthday);
        obj.put("emp_status", emp_status);
        obj.put("emp_job_title", emp_job_title);
        return obj.toString();
    }

    public static String updateEmployeePayloadJson() {
        JSONObject obj = new JSONObject();
        obj.put("employee_id", "53150A");
        obj.put("emp_firstname", "Christine");
        obj.put("emp_lastname", "Peter");
        obj.put("emp_middle_name", "Roshdy");
        obj.put("emp_gender", "F");
        obj.put("emp_birthday", "1989-05-20");
        obj.put("emp_status", "Employeed");
        obj.put("emp_job_title", "CEO");
        return obj.toString();
    }
}