### Akkodis excercise
This repo contains a basic example to resolve the Akkodis excercise.

| STAR_DATE | END_DATE |
| ------ | ------ |
| 12/09/2023|14/09/2023|
---

### Tech
- Spring Boot https://start.spring.io/
- Jdk 17 
- Spring Api Docs - swagger https://swagger.io/solutions/api-documentation/
-Unit test && coverage:
  - Jacoco 
  - JUnit 5 
- Git Actions
  [CI implemented](.github/workflows/ci.yml)
- Sonar Lint https://www.sonarsource.com/products/sonarlint/

- Docker
  [Dockerfile](Dockerfile)
```sh
  docker build -t demo-spring-app .
  docker run -p 8080:8080 -d demo-spring-app:latest
```
You can use compose command:   [View File](tools/compose/docker-compose.yml)
```sh
  docker-compose up -d
```


### How to Install
- Using a simple command:
```sh
java -jar shop.jar (OR shop-0.0.1-SNAPSHOT.jar)
```
- Using docker:
```sh
  docker build -t demo-spring-app .
  docker run -p 8080:8080 -d demo-spring-app:latest
```

- To execute the test
```sh
mvn clean test
```

### How to use
Api information here: http://localhost:8080/swagger-ui/index.html (Swagger)
- Examples:
```json
// --> http://localhost:8080/api/product
[
  {
    "id": 1,
    "startDate": "2020-06-14T00:00:00.000+00:00",
    "endDate": "2020-12-31T23:59:59.000+00:00",
    "product": {
      "id": 35455,
      "name": "Akkodis Product premium A",
      "brand": {
        "id": 1,
        "name": "Akkodis Brand premium"
      }
    },
    "priority": 0,
    "cost": 36,
    "current": "EUR"
  }, 
  .....
]
```

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.1.3/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.1.3/maven-plugin/reference/html/#build-image)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/3.1.3/reference/htmlsingle/index.html#using.devtools)
