package com.wipro.docker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.docker.model.DockerModel;
import com.wipro.docker.repository.DockerDao;

@RestController
public class DockerController {
	
	@Autowired
	DockerDao dao;
	
	@PostMapping("/save-dockerfile")
	public void saveDockerFile(@RequestBody DockerModel dockerModel) {
		dao.createDockerFile(dockerModel);
	}
	@GetMapping("/dockerfile")
	public DockerModel getName(@RequestParam int id) {
		
		return dao.getDockerInfo(id);
	}

}
