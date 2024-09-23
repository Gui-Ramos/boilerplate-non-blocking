# Non Blocking Application
This project was developed with the intention of experimenting with Spring's support for reactive applications and testing reactive Hibernate.

### Project Stack:

- ☕ Java 21
- 🌱 Spring 3.3.3
- ⚡ Hibernate Reactive 2.3
- 📚 Lombok
- 📖 OpenAPI
- 🧪 JUnit
- 🏛️ JPA
- 🚀 Gradle


### Observations
The support to reactive application and non-blocking transactions to database using r2dbc is terrible.
Low documentation, low articles updated articles, and unfortunataly without support to mock repositories in unit tests.
If you need a service to make non-blocking requests to another service or to a database, I do not recommend using a Java project to do this.