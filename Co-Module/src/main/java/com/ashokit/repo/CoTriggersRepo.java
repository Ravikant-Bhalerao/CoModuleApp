package com.ashokit.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.entities.CoTriggers;

public interface CoTriggersRepo extends JpaRepository<CoTriggers, Serializable> {

}
