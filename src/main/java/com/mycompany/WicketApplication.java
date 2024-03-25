package com.mycompany;

import java.util.Arrays;
import java.util.logging.Logger;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.protocol.http.WebApplication;

import io.quarkus.runtime.annotations.RegisterForReflection;
import jakarta.enterprise.inject.spi.CDI;
import jakarta.inject.Inject;

@RegisterForReflection
public class WicketApplication extends WebApplication {

    @Override
    protected void init() {
        super.init();
        getComponentInstantiationListeners().add(component -> Arrays.stream(component.getClass().getDeclaredFields()).forEach(x-> {
		      if(x.isAnnotationPresent(Inject.class)) {
		          final var c = CDI.current().select(x.getType()).get();
		          final boolean canAccess = x.canAccess(component);
		          x.setAccessible(true);
		          try {
		              x.set(component, c);
		              Logger.getLogger("WicketApplication#init").info("injecting " + component.getClass().getSimpleName() + "#" + x.getName() + "::" + x.getType().getSimpleName());
		          } catch (final IllegalAccessException e) {
		              throw new RuntimeException(e);
		          }
		          x.setAccessible(canAccess);
		      }
		  }));

      getCspSettings().blocking().disabled();
	}

	@Override
	public Class<? extends WebPage> getHomePage() {
		return HomePage.class;
	}

}
