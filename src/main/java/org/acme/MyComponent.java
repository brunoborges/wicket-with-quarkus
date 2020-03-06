package org.acme;

import javax.validation.constraints.NotNull;

/**
 * MyComponent
 */
public class MyComponent {

    public String sayHello(@NotNull String name) {
        return String.format("Hello %s!", name);
    }
}
