package com.boot.ng.h2.bootngh2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.boot.ng.h2.bootngh2.entity.User;

/**
 * 
 * @author vickey
 *
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
