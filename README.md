# code-with-quarkus project

This project uses Quarkus and Apache Wicket.

If you want to learn more, visit https://quarkus.io/ and https://wicket.apache.org .

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```
./mvnw quarkus:dev
```

Visit the Wicket page at http://localhost:8080

Visit the Quarkus REST endpoint at http://localhost:8080/api/hello

## Packaging and running the application

The application is packageable using `./mvnw package`.
It produces the executable `code-with-quarkus-1.0.0-SNAPSHOT-runner.jar` file in `/target` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/lib` directory.

The application is now runnable using `java -jar target/code-with-quarkus-1.0.0-SNAPSHOT-runner.jar`.

## Creating a native executable (NOT TESTED WITH WICKET)

You can create a native executable using: `./mvnw package -Pnative`.

Or you can use Docker to build the native executable using: `./mvnw package -Pnative -Dquarkus.native.container-build=true`.

You can then execute your binary: `./target/code-with-quarkus-1.0.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult https://quarkus.io/guides/building-native-image-guide .# wicket-with-quarkus
