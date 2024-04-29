package com.employeeform.repository;

import com.employeeform.model.Country;
import com.employeeform.model.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StateRepository extends JpaRepository<State, Long> {
    List<State> findByCountry(Country country);
}