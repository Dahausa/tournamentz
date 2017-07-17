package com.dahausa.tournamentz.team.ui;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dahausa.tournamentz.team.api.TeamService;
import com.dahausa.tournamentz.team.domain.exceptions.CannotCreateTeamException;
import com.vaadin.data.Binder;
import com.vaadin.event.ShortcutAction.KeyCode;
import com.vaadin.spring.annotation.SpringComponent;
import com.vaadin.spring.annotation.UIScope;
import com.vaadin.ui.Button;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Notification;
import com.vaadin.ui.TextField;

@SpringComponent
@UIScope
public class AddTeamForm extends FormLayout {

	private static final long serialVersionUID = 3782993902233101805L;
	

	private TeamService service;
	
	private Binder<TeamFormDto> binder = new Binder<>(TeamFormDto.class);
	private TeamFormDto team;
	
	private List<TextField> allFields = new ArrayList<>();
	
	private TextField teamName = new TextField("Name");
	private TextField remarks = new TextField("Remarks");
	private TextField contact = new TextField("Contact");
	private Button save = new Button("Save");
	private Button clear = new Button("Clear");
	
	@Autowired
	public AddTeamForm(TeamService service) {
		
		this.service = service;
		
		clear.setClickShortcut(KeyCode.DELETE);
		save.setClickShortcut(KeyCode.ENTER);
		
		allFields.add(teamName);
		allFields.add(remarks);
		allFields.add(contact);
		
		HorizontalLayout buttons = new HorizontalLayout(save, clear);
		addComponents(teamName,remarks,contact,buttons);
		
		binder.bind(teamName, TeamFormDto::getName,TeamFormDto::setName);
		binder.bind(remarks,TeamFormDto::getRemark,TeamFormDto::setRemark);
		binder.bind(contact, TeamFormDto::getContact,TeamFormDto::setContact);
		
		TeamFormDto team = new TeamFormDto();
		binder.setBean(team);
		
		
		save.addClickListener(e -> this.save());
		clear.addClickListener(e -> this.clear());
		
	}
	
	public void setTeam(TeamFormDto team) {
	    this.team = team;
	    binder.setBean(team);

	    setVisible(true);
	    teamName.selectAll();
	}
	
	private void clear() {
	    
	    for(TextField field : allFields) {
	    	field.clear();
	    }
	}

	private void save() {
		this.team = binder.getBean();
	    try {
			service.addTeam(team.convertToTeam());
			Notification.show("Team " + team.getName() +" has been saved!");
			binder.readBean(null);
		} catch (CannotCreateTeamException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
