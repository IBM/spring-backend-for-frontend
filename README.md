[![](https://img.shields.io/badge/IBM%20Cloud-powered-blue.svg)](https://bluemix.net)
[![Platform](https://img.shields.io/badge/platform-java-lightgrey.svg?style=flat)](https://www.ibm.com/developerworks/learn/java/)

# Create and deploy a Java Backend For Frontend (BFF) using Spring

> We have similar patterns available for [Node.js](https://github.com/IBM/nodejs-backend-for-frontend), [Swift](https://github.com/IBM/swift-backend-for-frontend), and [Java Liberty](https://github.com/IBM/java-liberty-backend-for-frontend) as well!

In this code pattern, you will create a Backend for Frontend (BFF) web service using [Spring](https://spring.io/) in Java, matching a RESTful API documented in [Swagger](http://swagger.io).

A BFF can be used to elegantly expose complex backend systems to multiple client-facing platforms, such as iOS and the web, without building a monolothic API that attempts to serve all clients equally. Different types of clients require different types of user experiences, and having a backend API tightly coupled to each specific user experience actually makes for a much more loosely coupled system overall. This pattern helps frontend teams iterate on features faster by giving them more control over the APIs they interact with, without affecting the user experience or development team driving a sister frontend.

When you have completed this code pattern, you will understand how to:

* Build out the Backend for Frontend (BFF) architecture pattern
* Deploy to Kubernetes, Cloud Foundry or a DevOps Pipeline
* Operate an application with monitoring and distributed trace
* Connect to provisioned services

![](doc/source/images/architecture.png)

## Video

Learn more about the Backend for Frontend pattern in this tech talk:

[![BFFs and GraphQL, terms you should know and why](https://img.youtube.com/vi/B5OdK21ZevI/maxresdefault.jpg)](https://www.youtube.com/watch?v=B5OdK21ZevI)

## Steps

> As an alternative to the steps below, you can [create this project as a starter kit](https://cloud.ibm.com/developer/appservice/apps/e19cb723-8e98-406c-b934-ed9ebd8caab5) on IBM Cloud, which automatically provisions required services, and injects service credentials into a custom fork of this pattern. Then, you can skip directly to step 3 below.

1. [Install development tools](#1-install-development-tools)
1. [Project contents](#2-project-contents)
1. [Run](#3-run)

### 1. Install development tools

Ensure you have the required development tools installed:

* [Maven](https://maven.apache.org/install.html)
* Java 8: Any compliant JVM should work.
  * [Java 8 JDK from Oracle](http://www.oracle.com/technetwork/java/javase/downloads/index.html)
  * [Java 8 JDK from IBM (AIX, Linux, z/OS, IBM i)](http://www.ibm.com/developerworks/java/jdk/)

### 2. Project contents

The BFF application has a health endpoint which is accessible at `<host>:<port>/health`. The ports are set to the defaults of `8080` for HTTP and `8443` for HTTPS and are exposed to the CLI in the `cli-config.yml` file.

The project contains IBM Cloud specific files that are used to deploy the application as part of a IBM Cloud DevOps flow. The `.bluemix` directory contains files used to define the IBM Cloud toolchain and pipeline for your application. The `manifest.yml` file specifies the name of your application in IBM Cloud, the timeout value during deployment and which services to bind to.

Credentials are either taken from the `VCAP_SERVICES` environment variable that IBM Cloud provides or from environment variables passed in by the config file `src/main/resources/application-local.properties`.

### 3. Run

To build and run the application:

1. `mvn install`
1. `java -jar ./target/springbackendforfrontend-1.0-SNAPSHOT.jar`

To run the application in Docker use the Docker file called `Dockerfile`. If you do not want to install Maven locally you can use `Dockerfile-tools` to build a container with Maven installed.

The application exposes the following endpoints:

* Health endpoint: `<host>:<port>/health` (for example, `http://localhost:8080/health`).

The ports are set in the `pom.xml` file and exposed to the CLI in the `cli-config.yml` file.

## License

This code pattern is licensed under the Apache License, Version 2. Separate third-party code objects invoked within this code pattern are licensed by their respective providers pursuant to their own separate licenses. Contributions are subject to the [Developer Certificate of Origin, Version 1.1](https://developercertificate.org/) and the [Apache License, Version 2](https://www.apache.org/licenses/LICENSE-2.0.txt).

[Apache License FAQ](https://www.apache.org/foundation/license-faq.html#WhatDoesItMEAN)
