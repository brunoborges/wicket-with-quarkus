package com.mycompany;

import io.quarkus.runtime.annotations.RegisterForReflection;

import org.apache.wicket.markup.html.basic.Label;

import org.acme.MyComponent;
import org.apache.wicket.markup.html.WebPage;

@RegisterForReflection
public class HomePage extends WebPage {

	private static final long serialVersionUID = 1L;

	@Inject
	private MyComponent myComponent;

	public HomePage() {
		var version = getApplication().getFrameworkSettings().getVersion();
		var versionLabel = new Label("version", version);

		add(versionLabel);

		var hello = new Label("hello", myComponent.sayHello("Bruno"));
		add(hello);
	}

}
