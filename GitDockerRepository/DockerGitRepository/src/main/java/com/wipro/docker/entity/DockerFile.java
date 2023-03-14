package com.wipro.docker.entity;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class DockerFile {
	
	@Id
	public int dockerID;
	public String dockerEnvironmentImageName;
	public int portNumber;
	public String applicationJarName;
	public String dockerImageName;
	
	public DockerFile() {
		
	}

	public DockerFile(int dockerID, String dockerEnvironmentImageName, int portNumber, String applicationJarName,
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
	public int hashCode() {
		return Objects.hash(applicationJarName, dockerEnvironmentImageName, dockerID, dockerImageName, portNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DockerFile other = (DockerFile) obj;
		return Objects.equals(applicationJarName, other.applicationJarName)
				&& Objects.equals(dockerEnvironmentImageName, other.dockerEnvironmentImageName)
				&& dockerID == other.dockerID && Objects.equals(dockerImageName, other.dockerImageName)
				&& portNumber == other.portNumber;
	}

	@Override
	public String toString() {
		return "DockerFile [dockerID=" + dockerID + ", dockerEnvironmentImageName=" + dockerEnvironmentImageName
				+ ", portNumber=" + portNumber + ", applicationJarName=" + applicationJarName + ", dockerImageName="
				+ dockerImageName + "]";
	}
	
	

}
