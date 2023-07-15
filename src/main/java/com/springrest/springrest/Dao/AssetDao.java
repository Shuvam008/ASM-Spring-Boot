package com.springrest.springrest.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.springrest.entities.Asset;

public interface AssetDao extends JpaRepository<Asset, Long>{

}
