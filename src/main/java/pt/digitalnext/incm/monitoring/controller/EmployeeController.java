package pt.digitalnext.incm.monitoring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import pt.digitalnext.incm.monitoring.models.Employee;
 
@RestController
public class EmployeeController 
{
   @GetMapping("/employees")
    public List<Employee> getEmployees() 
    {
      List<Employee> employeesList = new ArrayList<Employee>();
      employeesList.add(new Employee(1,"lokesh","gupta","howtodoinjava@gmail.com"));
      return employeesList;
    }
   
   @GetMapping("/hello")
   public String hello() {
	   return "Hello world!";
   }
}