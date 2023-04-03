package org.acme;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.jboss.logging.Logger;

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
