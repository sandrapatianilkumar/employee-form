package com.employeeform.service;

import com.employeeform.model.Country;
import com.employeeform.model.Employee;
import com.employeeform.model.State;

import java.util.List;

public interface EmployeeService {
    List<Country> getAllCountries();
    Employee saveEmployee(Employee employee);
    List<State> getStatesByCountry(Long countryId);

    Country saveCountry(Country country);

    State saveState(State state);

    Employee updateEmployee(Employee employee,Long employeeId);
}
