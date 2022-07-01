package utils;

import org.json.JSONObject;

public class APIPayloadConstants {

    public static String createEmployeePayload() {
        String createEmployee = "{\n" +
                "  \"emp_firstname\": \"Tom\",\n" +
                "  \"emp_lastname\": \"Green\",\n" +
                "  \"emp_middle_name\": \"John\",\n" +
                "  \"emp_gender\": \"M\",\n" +
                "  \"emp_birthday\": \"2000-06-20\",\n" +
                "  \"emp_status\": \"Probation\",\n" +
                "  \"emp_job_title\": \"QA\"\n" +
                "}";
        return createEmployee;
    }

public static String createEmployeePayloadViaJson() {
    JSONObject obj = new JSONObject();
    obj.put("emp_firstname","Tom");
    obj.put("emp_lastname","Green");
    obj.put("emp_middle_name","John");
    obj.put("emp_gender","M");
    obj.put("emp_birthday","2000-06-20");
    obj.put("emp_status","Probation");
    obj.put("emp_job_title","QA");
    return obj.toString();

}

public static String createEmployeeDynamic(String firstName,String lastName,String middleName,
                                           String gender, String dob, String status, String jobTitle) {
    JSONObject obj = new JSONObject();
    obj.put("emp_firstname",firstName);
    obj.put("emp_lastname",lastName);
    obj.put("emp_middle_name",middleName);
    obj.put("emp_gender",gender);
    obj.put("emp_birthday",dob);
    obj.put("emp_status",status);
    obj.put("emp_job_title",jobTitle);
    return obj.toString();
}

}
