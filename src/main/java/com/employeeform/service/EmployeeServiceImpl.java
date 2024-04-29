package com.employeeform.service;

import com.employeeform.model.Country;
import com.employeeform.model.Employee;
import com.employeeform.model.State;
import com.employeeform.repository.CountryRepository;
import com.employeeform.repository.EmployeeRepository;
import com.employeeform.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private CountryRepository countryRepository;

    @Autowired
    private StateRepository stateRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<State> getStatesByCountry(Long countryId) {
        return stateRepository.findByCountry(countryRepository.findById(countryId).get());
    }

    @Override
    public Country saveCountry(Country country) {
        return  countryRepository.save(country);
    }

    @Override
    public State saveState(State state) {
        return stateRepository.save(state);
    }

}