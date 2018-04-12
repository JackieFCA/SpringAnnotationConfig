package hcmus.fetel.nhnhan.annotation.service;

import java.util.List;

import hcmus.fetel.nhnhan.annotation.model.Employee;

public interface EmployeeService {

    void saveEmployee(Employee employee);
    
    List<Employee> findAllEmployees();
 
    void deleteEmployeeBySsn(String ssn);
 
    Employee findBySsn(String ssn);
 
    void updateEmployee(Employee employee);
}
