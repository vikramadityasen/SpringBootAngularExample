package com.boot.ng.h2.bootngh2.converter;

import com.boot.ng.h2.bootngh2.dto.SkillDto;
import com.boot.ng.h2.bootngh2.entity.Skill;

/**
 * 
 * @author vickey
 *
 */
public class SkillConverter {
	
	private SkillConverter() {
	}
	
	public static Skill dtoToEntity(SkillDto skillDto) {
		Skill skill = new Skill(skillDto.getskillName(), null);
		skill.setSkillId(skillDto.getSkillId());
		return skill;
	}

	public static SkillDto entityToDto(Skill skill) {
		return new SkillDto(skill.getSkillId(), skill.getSkillName());
	}
}
