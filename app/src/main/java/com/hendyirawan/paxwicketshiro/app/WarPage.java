package com.hendyirawan.paxwicketshiro.app;

import org.apache.wicket.markup.html.WebPage;
import org.wicketstuff.shiro.ShiroConstraint;
import org.wicketstuff.shiro.annotation.ShiroSecurityConstraint;

@ShiroSecurityConstraint(constraint=ShiroConstraint.HasRole, value="president")
public class WarPage extends WebPage {

	private static final long serialVersionUID = 1L;

	public WarPage() {
		
	}
	
}
