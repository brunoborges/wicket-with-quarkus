package org.acme;

import javax.inject.Named;

@Named
public class MyComponent {

    public String sayHello(String name) {
        return String.format("Hello %s!", name);
    }

}
