# Karate-based integration tests

This small application demonstrates the approach to test `Spring Boot`-based
REST API using a test automation engine named [Karate](https://github.com/intuit/karate).

### What is Karate

Karate is test automation engine that allows to write BDD-tests, integration tests
and other types of tests. It allows testing end-to-end scenarios especially REST and
SOAP APIs.

### How this application works

This application starts as a simple API microservice on `localhost:8080`.
It exposes one endpoint by address `GET /bankproducts/{id}`. It returns 404 by any 
ID except 1. For ID 1 it will return you a simple object:

    {"id":1,"title":"My product"}

### Steps to run the tests

* First start the application itself, the microservice should be up and running
* Next run the tests from the application. There are [many ways](https://github.com/intuit/karate#test-suites)
to run them but the easiest one is to launch them from IntelliJ IDEA if you have it (launch your microservice
  first and then launch the task `Gradle > verification > test`).