package com.netjstech.datarest.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.netjstech.datarest.entities.Employee;

@RepositoryRestResource(collectionResourceRel = "employee", path =
"employee")
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	@RestResource(path = "empname")
	List<Employee> findByEmpName(@Param("empName") String empName);
}
