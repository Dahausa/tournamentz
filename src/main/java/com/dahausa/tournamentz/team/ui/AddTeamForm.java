package com.dahausa.tournamentz.team.ui;

import org.springframework.beans.factory.annotation.Autowired;

import com.dahausa.tournamentz.team.api.TeamService;
import com.dahausa.tournamentz.team.domain.Team;
import com.vaadin.data.Binder;
import com.vaadin.event.ShortcutAction.KeyCode;
import com.vaadin.spring.annotation.SpringComponent;
import com.vaadin.spring.annotation.UIScope;
import com.vaadin.ui.Button;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;

@SpringComponent
@UIScope
public class AddTeamForm extends FormLayout {

	private static final long serialVersionUID = 3782993902233101805L;
	

	private UI parent;
	
	@Autowired
	private TeamService service;
	
	private Binder<Team> binder = new Binder<>(Team.class);
	private Team team;
	
	private TextField teamName = new TextField("Name");
	private TextField remarks = new TextField("Remarks");
	private TextField contact = new TextField("Contact");
	private Button save = new Button("Save");
	private Button clear = new Button("Clear");
	
	public AddTeamForm(UI parent) {
		
		this.parent = parent;
		
		clear.setClickShortcut(KeyCode.DELETE);
		save.setClickShortcut(KeyCode.ENTER);
		
		HorizontalLayout buttons = new HorizontalLayout(save, clear);
		addComponents(teamName,remarks,contact,buttons);
		
		binder.bindInstanceFields(this);
		
		save.addClickListener(e -> this.save());
		clear.addClickListener(e -> this.clear());
		
	}
	
	public void setTeam(Team team) {
	    this.team = team;
	    binder.setBean(team);

	    setVisible(true);
	    teamName.selectAll();
	}
	
	private void clear() {
	    
	    setVisible(false);
	}

	private void save() {
	    service.addTeam(team);
	    setVisible(false);
	}

}
