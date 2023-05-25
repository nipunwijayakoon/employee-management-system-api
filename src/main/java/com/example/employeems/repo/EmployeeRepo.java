package com.example.employeems.repo;

import com.example.employeems.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
    @Query(value = "SELECT * FROM EMPLOYEE WHERE empId = ?1",nativeQuery = true)
    Employee  getEmpByEmpID(String empId);
}
