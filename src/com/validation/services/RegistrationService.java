package com.validation.services;

import com.validation.dao.EmployeeDAO;
import com.validation.model.Employee;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {
    private final EmployeeDAO employeeDAO;

    public RegistrationService(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    public void save(Employee employee) {
        employeeDAO.insert(employee);
    }
}
