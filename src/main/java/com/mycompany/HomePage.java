package com.mycompany;

import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.markup.html.basic.Label;

import org.acme.MyComponent;
import org.apache.wicket.markup.html.WebPage;

public class HomePage extends WebPage {

	private static final long serialVersionUID = 1L;

	public HomePage(final PageParameters parameters) {
		super(parameters);

		var version = getApplication().getFrameworkSettings().getVersion();
		var versionLabel = new Label("version", version);

		add(versionLabel);

		var hello = new Label("hello", new MyComponent().sayHello("Bruno"));
		add(hello);
	}

}
