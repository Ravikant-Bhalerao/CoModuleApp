package com.ashokit.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.entities.BatchSummary;

public interface BatchSummaryRepo extends JpaRepository<BatchSummary, Serializable> {

}
