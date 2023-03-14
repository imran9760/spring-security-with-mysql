package com.wipro.docker.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DockerModel {

	@JsonProperty("dockerID")
	public int dockerID;
	
	@JsonProperty("dockerEnvironment")
	public String dockerEnvironmentImageName;
	
	@JsonProperty("portNumber")
	public int portNumber;
	
	@JsonProperty("applicationJarName")
	public String applicationJarName;
	
	@JsonProperty("applicationDockerImageName")
	public String dockerImageName;
	
	public DockerModel() {
		
	}

	public DockerModel(int dockerID, String dockerEnvironmentImageName, int portNumber, String applicationJarName,
			String dockerImageName) {
		super();
		this.dockerID = dockerID;
		this.dockerEnvironmentImageName = dockerEnvironmentImageName;
		this.portNumber = portNumber;
		this.applicationJarName = applicationJarName;
		this.dockerImageName = dockerImageName;
	}

	public int getDockerID() {
		return dockerID;
	}

	public void setDockerID(int dockerID) {
		this.dockerID = dockerID;
	}

	public String getDockerEnvironmentImageName() {
		return dockerEnvironmentImageName;
	}

	public void setDockerEnvironmentImageName(String dockerEnvironmentImageName) {
		this.dockerEnvironmentImageName = dockerEnvironmentImageName;
	}

	public int getPortNumber() {
		return portNumber;
	}

	public void setPortNumber(int portNumber) {
		this.portNumber = portNumber;
	}

	public String getApplicationJarName() {
		return applicationJarName;
	}

	public void setApplicationJarName(String applicationJarName) {
		this.applicationJarName = applicationJarName;
	}

	public String getDockerImageName() {
		return dockerImageName;
	}

	public void setDockerImageName(String dockerImageName) {
		this.dockerImageName = dockerImageName;
	}

	@Override
	public String toString() {
		return "DockerFile [dockerID=" + dockerID + ", dockerEnvironmentImageName=" + dockerEnvironmentImageName
				+ ", portNumber=" + portNumber + ", applicationJarName=" + applicationJarName + ", dockerImageName="
				+ dockerImageName + "]";
	}
	
}
