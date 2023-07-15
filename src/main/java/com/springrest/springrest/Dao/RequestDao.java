package com.springrest.springrest.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.springrest.entities.Request;

public interface RequestDao extends JpaRepository<Request, Long>{

}
