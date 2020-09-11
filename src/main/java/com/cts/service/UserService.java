package com.cts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.bean.User;
import com.cts.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository repo;


	public User find(String userName) {
		return repo.findByUsername(userName);
	}

}