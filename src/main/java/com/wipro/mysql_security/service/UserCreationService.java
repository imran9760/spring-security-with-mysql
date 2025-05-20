package com.wipro.mysql_security.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.wipro.mysql_security.entity.Roles;
import com.wipro.mysql_security.entity.Users;
import com.wipro.mysql_security.model.UserRequest;
import com.wipro.mysql_security.repository.RolesRepository;
import com.wipro.mysql_security.repository.UserRepository;

@Service
public class UserCreationService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RolesRepository roleRepository;

	@Autowired
	private BCryptPasswordEncoder encoder;

	@Autowired
	private AuthenticationManager authenticationManager;

	public void saveUser(UserRequest userRequest) throws Exception {
		// create new user
		if (userRepository.findByUsername(userRequest.getUsername()) != null) {
			throw new Exception("Username already exists");
		}
		Users user = new Users();
		String encodedPassword = encoder.encode(userRequest.getPassword());
		user.setUsername(userRequest.getUsername());
		user.setPassword(encodedPassword);
		user.setEnabled(userRequest.isEnabled());
		userRepository.save(user);

		// assign role for user i.e save entry in user_roles table
		Roles role = roleRepository.findByName("ROLE_" + userRequest.getRole().toUpperCase());
		if (role == null) {
			throw new Exception("Role not found");
		}
		user = userRepository.findByUsername(userRequest.getUsername());
		user.getRoles().add(role);
		userRepository.save(user);
	}

	public List<Users> getAllUsers() {
		return userRepository.findAll();
	}

	// Manual validate user authentication to pass username and password
	public String verifyUser(UserRequest userRequest) {
		Authentication authentication = authenticationManager.authenticate(
				new UsernamePasswordAuthenticationToken(userRequest.getUsername(), userRequest.getPassword()));
		if (authentication.isAuthenticated()) {
			return "Success";
		}
		return null;
	}
}
