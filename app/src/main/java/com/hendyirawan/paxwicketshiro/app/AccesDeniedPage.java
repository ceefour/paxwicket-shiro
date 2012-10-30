package com.hendyirawan.paxwicketshiro.app;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.markup.html.panel.FeedbackPanel;

public class AccesDeniedPage extends WebPage {

	private static final long serialVersionUID = 1L;

	public AccesDeniedPage() {
		add(new FeedbackPanel("feedback"));
		add(new BookmarkablePageLink<Void>("loginLink", LoginPage.class));
	}
	
}
