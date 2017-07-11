package com.dahausa.tournamentz.ui;

import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;
import com.vaadin.ui.UI;

@SpringUI
@Theme("valo")
public class IndexUI extends UI {

	private static final long serialVersionUID = 4678450338860450088L;

	@Override
    protected void init(VaadinRequest request) {
	    setContent(new Button("Click me", e -> Notification.show("Hello Spring+Vaadin user!")));
    }
}
