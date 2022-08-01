# SysInfo Microservice

This is a microservice that collects basic system properties and makes them accessible through and endpoint.

The goal of this project is to get started with [Open Liberty](https://openliberty.io/) framework.<br>
It is based on [this](https://openliberty.io/guides/getting-started.html) guide.

## Getting Started

<br>Prerequisites: JDK and [Maven](https://maven.apache.org/).<br><br>

1. Clone this repo:
    ```
    git clone https://github.com/guilherme-nsr/sysinfo-ms
    ```

2. cd into the repo:
    ```
    cd sysinfo-ms
    ```

3. Start the development server:
    ```
    mvn liberty:dev
    ```
4. Make requests to the endpoints:
    ```
    curl --location --request GET 'localhost:9080/health'

    curl --location --request GET 'localhost:9080/system/properties'
    ```