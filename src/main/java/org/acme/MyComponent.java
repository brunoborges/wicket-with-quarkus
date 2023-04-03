package org.acme;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@ApplicationScoped
@Named
public class MyComponent {

    public String sayHello(final String name) {
        return String.format("Hello %s!", name);
    }

}
