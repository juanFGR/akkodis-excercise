### Akkodis exercise
This repo contains a basic example to resolve the Akkodis exercise.

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



### How to Install
- Using a simple command:
```sh
mvn install #to generate the jar quickly
java -jar target/shop-0.0.1-SNAPSHOT.jar #(OR shop.0.0.1.jar)
```
```sh
#OR using the java.jar uploaded to dist folder for this example
java -jar dist/shop-0.0.1.jar

```
- Using docker:
```sh
  docker build -t demo-spring-app .
  docker run -p 8080:8080 -d demo-spring-app:latest
```
- using compose command:   [View File](tools/compose/docker-compose.yml)

```sh
  docker-compose up -d
```

### How to check
- To execute the test
```sh
mvn clean test
```
- To verify the coverage


### How to use
Api information here: http://localhost:8080/swagger-ui/index.html (Swagger)

Api Postman Collection [View File](tools/postman/)

- Example http://localhost:8080/api/price/product/35455?date=2020-06-14-10.00.00
```json
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
}
```

- Example http://localhost:8080/api/price/1
```json
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
}
```
- Example http://localhost:8080/api/brand
```json
[
  {
    "id": 1,
    "name": "Akkodis Brand premium"
  },
  {
    "id": 2,
    "name": "Akkodis Brand normal"
  },
  {
    "id": 3,
    "name": "Akkodis Brand low-cost"
  }
]
```
### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.1.3/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.1.3/maven-plugin/reference/html/#build-image)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/3.1.3/reference/htmlsingle/index.html#using.devtools)
