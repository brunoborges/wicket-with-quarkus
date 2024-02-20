package com.mycompany;

import org.acme.MyComponent;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

import io.quarkus.runtime.annotations.RegisterForReflection;
import jakarta.inject.Inject;

@RegisterForReflection
public class HomePage extends WebPage {

	private static final long serialVersionUID = 1L;

	@Inject
	private MyComponent myComponent;

	public HomePage() {
		final var version = getApplication().getFrameworkSettings().getVersion();
		final var versionLabel = new Label("version", version);

		add(versionLabel);

		final var hello = new Label("hello", myComponent.sayHello("Bruno"));
		add(hello);
	}

}
