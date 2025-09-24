# Automation-Framework-Java-Selenium-Cucumber-
Automation Framework 

This project is a Selenium + Java + Cucumber + Maven automation framework for automating the e-commerce website.
This framework is written for the website.

URL:- https://tutorialsninja.com/demo/index.php?route=common/home  

Below is the flow by which framework executes:

Login → Homepage → Search → Select Product → Add to Cart → Shopping Cart → Checkout

---

**Features**

- Page Object Model (POM) design pattern
- Explicit waits for dynamic elements
- Cucumber BDD for readable feature files
- Maven project structure for easy dependency management
- JUnit runner for executing tests
- Generates HTML reports after test execution.

---

**Prerequisites**

- Java JDK 8 or higher
- Maven
- Chrome Browser
- Internet connection
- IDE (Eclipse, IntelliJ, or VS Code recommended)

---

## **Project Structure**

Practice
├── pom.xml
├── src/
│   ├── main/test/ 
│       ├── java/
│       │   └── pages/
│       │       ├── HomePage.java
│       │       ├── LoginPage.java
│       │       ├── ProductPage.java
│       │       └── CheckoutPage.java
│       │   └── stepdefinations/
│       │       ├── LoginSteps.java
│       │       └── ProductSteps.java
│       │   └── runners/
│       │       └── TestRunner.java
│       └── resources/
│           └── features/
│               └── All.feature




