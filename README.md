# DCP QA Quiz

## Dependencies

- Java
- Maven
- TestNG
- Allure


## Installation

1. Clone the repository

```shell
git clone https://github.com/aycil-gazi/MercedesCaseStudy
```

2. Setup the maven dependencies.

```shell
mvn compile
```

3. Configure the data.json file for test data.


## Running Test Scripts

**For Chrome Browser;**
```shell
DRIVER=chrome mvn test
```

**For Firefox Browser;**

```shell
DRIVER=firefox mvn test
```


If the browser not selected, the test is set to run in the "Chrome" browser.


## Reports


After running the tests the reports will be generated in the `./allure-results` directory.

To be able to see reports as html format please follow the installation instructions for yor local OS from the link (https://docs.qameta.io/allure/)

After installation allure fw for your local OS you can see the reports by running the `allure serve` command.
