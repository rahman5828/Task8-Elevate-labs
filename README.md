# hello-java-maven

Advanced-ready Hello World Java project for Jenkins + Maven demos.

## Build locally
```bash
mvn -B -ntp clean verify
java -jar target/hello-java-maven-1.0.0.jar
```

## What this project demonstrates
- Reproducible JAR (`project.build.outputTimestamp`)
- JUnit 5 tests (Surefire)
- Code coverage (JaCoCo) — see `target/site/jacoco/index.html`
- Static analysis (Checkstyle, SpotBugs) — does not fail the build, only reports
- Java 8–11 compatibility via profiles
