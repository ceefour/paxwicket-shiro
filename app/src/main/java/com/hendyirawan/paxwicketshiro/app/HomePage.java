package com.hendyirawan.paxwicketshiro.app;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;

public class HomePage extends WebPage {
    
    private static final long serialVersionUID = 1L;

	public HomePage() {

        add(new Label("oneComponent", "Welcome to the most simple pax-wicket application based on springdm"));
        add(new BookmarkablePageLink<Void>("securedPageLink", SecuredPage.class));
    }
}
