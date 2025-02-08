# Example Java Project

Simple JVM project for SonarQube Scanning.

## Prerequisites

- JDK installed
- Maven installed

## Build

```bash
mvn clean compile
```

## Run

```bash
mvn exec:java
```

## Tests

```bash
mvn test
```

## SonarQube Scan

```bash
mvn -B verify org.sonarsource.scanner.maven:sonar-maven-plugin:sonar -Dsonar. projectKey=Example-Java-Project -Dsonar.projectName='Example Java Project' -Dsonar.host. url="http://localhost:9000" -Dsonar.token="<TOKEN>"
```