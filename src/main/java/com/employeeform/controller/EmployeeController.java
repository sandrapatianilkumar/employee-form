package com.employeeform.controller;

import com.employeeform.model.Country;
import com.employeeform.model.Employee;
import com.employeeform.model.State;
import com.employeeform.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/countries")
    public ResponseEntity<List<Country>> getAllCountries() {
        List<Country> countries = employeeService.getAllCountries();
        return ResponseEntity.ok(countries);
    }

    @PostMapping("/saveEmployee")
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {
        employeeService.saveEmployee(employee);
        return ResponseEntity.ok(employee);
    }

    @GetMapping("/{countryId}/states")
    public ResponseEntity<List<State>> getStatesByCountry(@PathVariable Long countryId) {
        List<State> states = employeeService.getStatesByCountry(countryId);
        return ResponseEntity.ok(states);
    }

    @PostMapping("/saveCountry")
    public ResponseEntity<Country> saveEmployee(@RequestBody Country country) {
        employeeService.saveCountry(country);
        return ResponseEntity.ok(country);
    }

    @PostMapping("/saveState")
    public ResponseEntity<State> saveState(@RequestBody State state) {
        employeeService.saveState(state);
        return ResponseEntity.ok(state);
    }


}
