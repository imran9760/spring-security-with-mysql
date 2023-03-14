package com.wipro.docker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.docker.entity.DockerFile;

public interface DockerRepository extends JpaRepository<DockerFile, Integer>{
	
}
