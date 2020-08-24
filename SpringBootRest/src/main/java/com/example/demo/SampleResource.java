package com.example.demo;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleResource {
//@RequestMapping("/emps")
@GetMapping("/emps")
public List<Emp> getEmps(){
List<Emp> emps = new ArrayList<>();

Emp e1 = new Emp(101,"vivan","Electrical", null);
emps.add(e1);
Emp e2 = new Emp(102,"Himanshu","Mechanical", null);
emps.add(e2);
Emp e3 = new Emp(103,"sravya","Civil", null);
emps.add(e3);

return emps;
}

Map<Long, Emp> empData = new HashMap<>();

@PostMapping("/emps")
public @ResponseBody Emp newEmployee(@RequestBody Emp newEmployee){
System.out.println("Start createEmployee.");
newEmployee.setCreatedDate(new Date());
empData.put(newEmployee.geteID(), newEmployee);
return newEmployee;
}
}