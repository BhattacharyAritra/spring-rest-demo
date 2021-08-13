package com.example.demo.util;

//import org.springframework.beans.BeanUtils;

import com.example.demo.dto.EmployeeDto;
import com.example.demo.entity.Employee;

import ch.qos.logback.core.joran.util.beans.BeanUtil;

public class EmployeeEntityDtoUtil {
	
	public static EmployeeDto entityToDto(Employee e) {
		return new EmployeeDto(e.getId(), e.getName(), e.getUsername(), e.getPassword());
	}
	
	public static Employee dtoToEntity(EmployeeDto e) {
		return new Employee(e.getId(), e.getName(), e.getUsername(), e.getPassword());
//		Employee emp = new Employee();
//		BeanUtils.copyProperties(e, new Employee());
//		return emp;
	}

}
