package com.wipro.docker.repository;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wipro.docker.entity.DockerFile;
import com.wipro.docker.model.DockerModel;

@Repository
public class DockerDao {
	
	@Autowired
	DockerRepository repo;
	
	public void createDockerFile(DockerModel dockerModel) {
		
		DockerFile dockerFile = new DockerFile();
		dockerFile.setDockerID(dockerModel.getDockerID());
		dockerFile.setApplicationJarName(dockerModel.getApplicationJarName());
		dockerFile.setDockerEnvironmentImageName(dockerModel.getDockerEnvironmentImageName());
		dockerFile.setDockerImageName(dockerModel.getDockerImageName());
		dockerFile.setPortNumber(dockerModel.getPortNumber());
		
		repo.save(dockerFile);
	}
	
	public DockerModel getDockerInfo(int dockerID) {
		DockerModel dockerModel = new DockerModel();
		Optional<DockerFile> optional = repo.findById(dockerID);
		if(optional.isPresent()) {
			DockerFile dockerFile = optional.get();
			dockerModel.setApplicationJarName(dockerFile.getApplicationJarName());
			dockerModel.setDockerEnvironmentImageName(dockerFile.getDockerEnvironmentImageName());
			dockerModel.setDockerID(dockerFile.getDockerID());
			dockerModel.setDockerImageName(dockerFile.getDockerImageName());
			dockerModel.setPortNumber(dockerFile.getPortNumber());
		}
		return dockerModel;
	}

}
