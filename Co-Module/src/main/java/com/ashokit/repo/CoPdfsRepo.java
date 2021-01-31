package com.ashokit.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.entities.CoPdfs;

public interface CoPdfsRepo extends JpaRepository<CoPdfs, Serializable> {

}
