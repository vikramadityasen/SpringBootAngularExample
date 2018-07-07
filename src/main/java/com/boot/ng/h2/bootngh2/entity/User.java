package com.boot.ng.h2.bootngh2.entity;

import javax.persistence.*;
import java.util.LinkedList;
import java.util.List;

/**
 * 
 * @author vickey
 *
 */
@Entity
public class User{

	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Integer userId;
	@Column
	private String userName;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Skill> skills = new LinkedList<>();

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public List<Skill> getSkills() {
		return skills;
	}

	public void setSkills(List<Skill> skills) {
		this.skills = skills;
	}

	public User() {
	}

	public User(String userName, List<Skill> skills) {
		this.userName = userName;
		this.skills = skills;
	}
}
