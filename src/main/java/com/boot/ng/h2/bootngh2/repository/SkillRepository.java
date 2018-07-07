package com.boot.ng.h2.bootngh2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.boot.ng.h2.bootngh2.entity.Skill;

/**
 * 
 * @author vickey
 *
 */
@Repository
public interface SkillRepository extends JpaRepository<Skill, Integer> {
}
