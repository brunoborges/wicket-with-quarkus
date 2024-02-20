package org.acme;

import org.jboss.logging.Logger;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@ApplicationScoped
@Named
public class MyComponent {

    @Inject
    Logger logger;

    public String sayHello(final String name) {
        logger.infov("sayHello(name={0})", name);

        return String.format("Hello %s!", name);
    }

}
