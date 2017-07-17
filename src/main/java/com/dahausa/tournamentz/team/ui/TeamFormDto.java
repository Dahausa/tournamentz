package com.dahausa.tournamentz.team.ui;

import com.dahausa.tournamentz.team.domain.Team;
import com.dahausa.tournamentz.team.domain.exceptions.CannotCreateTeamException;

/**
 * UI data class for a team
 * @author dahausa
 *
 */
public class TeamFormDto {
	
	private String name;
	private String remark;
	private String contact;
	
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Team convertToTeam() throws CannotCreateTeamException {
		Team team = Team.create(getName());
		team.setContact(this.getContact());
		team.setLabel(this.getRemark());
		return team;
	}
}
