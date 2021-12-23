package com.bezkoder.springjwt.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bezkoder.springjwt.models.User;
import com.bezkoder.springjwt.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;

	public List<User> getUsersProj(Integer id) {
		return userRepository.findByProjetId(id);
	}

	public Optional<User> getUserById(Long id) {
		return userRepository.findById(id);
	}
}
