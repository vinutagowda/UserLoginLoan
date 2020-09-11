package com.cts.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cts.bean.User;
@Repository
public interface UserRepository extends JpaRepository<User,Long> {
	public User findByUsername(String username);

}
