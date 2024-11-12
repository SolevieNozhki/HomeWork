package org.example.Deserializators;

import com.google.gson.*;
import org.example.Case;
import org.example.Employee;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDeserializer implements JsonDeserializer<Employee> {
    @Override
    public Employee deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context) throws JsonParseException {
        JsonObject employeeObject = jsonElement.getAsJsonObject();
        Employee employee = new Employee();
        employee.setEmployeeName(employeeObject.get("name").getAsString());
        employee.setPosition(employeeObject.get("position").getAsString());

        List<Case> cases = new ArrayList<>();
        JsonArray caseArray = employeeObject.get("cases").getAsJsonArray();
        for(JsonElement jsonCase : caseArray ){
            cases.add(context.deserialize(jsonCase, Case.class));
        }
        employee.setCases(cases);
        return employee;
    }
}
