# School Management Application
This is a school management application which will provide complete solutions for all the software needs for a school. It is a pilot project with aim to learn various aspects of software development and try out new technologies. Complete software will be using java 8 and java technologies.

## How to run the tests

```bash
mvn clean build
```

## How to run the application locally

You can deploy into an application server which has a JNDI datasource configured as "jdbc/futuristic", or (easier), you can
run the application in standalone mode (on port 8000 by default) with:

```bash
SPRING_PROFILES_ACTIVE=local mvnw spring-boot:run
```

(this will expect to find a SRIMS database running on port 1551 with username "system" and password "oracle"; this can
be configured in application-local.yml)


## Configuring IDEs

### Eclipse / STS

Install Maven and Checkstyle tooling:

1. Help -> Eclipse Marketplace
2. Search for Gradle and install "Buildship Gradle Integration"
3. Search for Checkstyle and install "Checkstyle Plug-in"
4. Restart eclipse

Install Lombok tooling:

1. Close eclipse
2. Download the Lombok JAR from https://projectlombok.org/download
3. Run the jar file; it should discover your Eclipse installation
4. Open eclipse

Import the project:

1. Right-click in the Package Explorer space and select "Import..."
2. Select Maven -> Existing Maven Project
3. Follow the wizard and select the project when prompted

## Syncing GitHub code 

You will need a computer which can access github.com.
