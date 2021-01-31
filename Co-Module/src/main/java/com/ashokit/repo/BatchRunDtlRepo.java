package com.ashokit.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.entities.BatchRunDtl;

public interface BatchRunDtlRepo extends JpaRepository<BatchRunDtl, Serializable> {

}
