package com.boot.ng.h2.bootngh2.dto;

/**
 * 
 * @author vickey
 *
 */
public class SkillDto {
	Integer skillId;
	String skillName;

	public SkillDto(Integer skillId, String skillName) {
		this.skillId = skillId;
		this.skillName = skillName;
	}

	public SkillDto() {
	}

	public Integer getSkillId() {
		return skillId;
	}

	public void setSkillId(Integer skillId) {
		this.skillId = skillId;
	}

	public String getskillName() {
		return skillName;
	}

	public void setskillName(String skillName) {
		this.skillName = skillName;
	}
}
