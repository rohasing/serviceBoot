package com.cg.ems.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.ems.entity.EmployeeBean;

@Repository
public interface IEmployeeRepository extends JpaRepository<EmployeeBean, Integer> {

}
