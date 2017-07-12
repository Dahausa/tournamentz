package com.dahausa.tournamentz.ui;

import com.dahausa.tournamentz.team.ui.AddTeamForm;
import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Layout;
import com.vaadin.ui.UI;

@SpringUI
@Theme("valo")
public class IndexUI extends UI {

	private static final long serialVersionUID = 4678450338860450088L;

	@Override
    protected void init(VaadinRequest request) {
		
		Layout frame = new GridLayout(1,3);
		frame.setSizeFull();
		
		FormLayout addTeamForm = new AddTeamForm(this);
		frame.addComponent(addTeamForm);
		
	    setContent(frame);
    }
}
