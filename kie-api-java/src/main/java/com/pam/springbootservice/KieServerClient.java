package com.pam.springbootservice;

import java.util.HashMap;
import java.util.Map;
import org.kie.server.client.KieServicesClient;
import org.kie.server.client.ProcessServicesClient;
//import com.projects.testempproj.Employee;
import com.trainingspace.testempproj.Employee;

public class KieServerClient {

  public static Long invokeWorkFlowWithEmployee() {
    Map<String, Object> map = new HashMap<String, Object>();
    Employee employee = new Employee();
   employee.setId(1);
   employee.setName("sindhu");
   map.put("emp", employee);
   KieServerConfiguration serverClient =new KieServerConfiguration();
   KieServicesClient kieServicesClient=null;
   kieServicesClient = serverClient.getKieClient();
  ProcessServicesClient processClient = kieServicesClient.getServicesClient(ProcessServicesClient.class);
  //UserTaskServicesClient userTaskClient=kieServicesClient.getServicesClient(UserTaskServicesClient.class);
  Long processInstanceId = processClient.startProcess("testEmpProj_1.0.0-SNAPSHOT","testEmpProj.empTask",map);
System.out.println("***process instance id is::::****"+processInstanceId);
return processInstanceId;
}
public static void main(String args[]) {
invokeWorkFlowWithEmployee();
}
}