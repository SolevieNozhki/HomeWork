package org.example.Serializators;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import org.example.Employee;

import java.lang.reflect.Type;

public class EmployeeSerializer implements JsonSerializer<Employee> {
    @Override
    public JsonElement serialize(Employee employee, Type type, JsonSerializationContext context) {
        JsonObject employeeObject = new JsonObject();
        employeeObject.addProperty("name", employee.getEmployeeName());
        employeeObject.addProperty("position", employee.getPosition());
        employeeObject.add("cases", context.serialize(employee.getCases()));

        return employeeObject;

    }
}
