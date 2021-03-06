package com.example.projectservice;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ProjectDao extends JpaRepository<Project, Integer>, JpaSpecificationExecutor<Project> {

}

