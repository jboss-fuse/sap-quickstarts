# SAP Quick Starts for Spring Boot

**This directory contains a set of quick start projects to get you started with using the suite of Red Hat build of Apache Camel SAP components in a Spring Boot runtime.**  
![SAP Tool Suite](../sap_tool_suite.png "SAP Tool Suite")

---

**Author:** William Collins - Fuse Team  
**Level:** Beginner to Advanced  
**Technologies:** SAP, Camel, Spring Boot  
**Summary:** These quick starts demonstrate how to configure and use the suite of Red Hat build of Apache Camel SAP components to integrate Apache Camel with SAP.  
**Target Product:** Red Hat build of Apache Camel Spring Boot  
**Source:** <http://github.com/jboss-fuse/sap-quickstarts/>

---  

## Overview

It is recommended that you study and run the quick starts in the following order:

### Remote Function Call (RFC) Examples

#### [sap-srfc-destination-spring-boot](sap-srfc-destination-spring-boot/README.md)

Demonstrates how to perform *Synchronous Remote Function Calls* (sRFC) to SAP from Apache Camel.

#### [sap-trfc-destination-spring-boot](sap-trfc-destination-spring-boot/README.md)

Demonstrates how to perform *Transactional Remote Function Calls* (tRFC) to SAP from Apache Camel.

#### [sap-qrfc-destination-spring-boot](sap-qrfc-destination-spring-boot/README.md)

Demonstrates how to perform *Queued Remote Function Calls* (qRFC) to SAP from Apache Camel.

#### [sap-srfc-server-spring-boot](sap-srfc-server-spring-boot/README.md)

Demonstrates how to handle *Synchronous Remote Function Calls* (sRFC) from SAP within Apache Camel.

#### [sap-trfc-server-spring-boot](sap-trfc-server-spring-boot/README.md)

Demonstrates how to handle *Transactional Remote Function Calls* (tRFC) from SAP within Apache Camel.

### Intermediate Document (IDoc) Examples

#### [sap-idoc-destination-spring-boot](sap-idoc-destination-spring-boot/README.md)

Demonstrates how to send an Intermediate Document (IDoc) to SAP from Apache Camel.

#### [sap-idoclist-destination-spring-boot](sap-idoclist-destination-spring-boot/README.md)

Demonstrates how to send a list of Intermediate Documents (IDocs) to SAP from Apache Camel.

#### [sap-qidoc-destination-spring-boot](sap-qidoc-destination-spring-boot/README.md)

Demonstrates how to send an Intermediate Document (IDoc) using the qRFC protocol to SAP from Apache Camel.

#### [sap-qidoclist-destination-spring-boot](sap-qidoclist-destination-spring-boot/README.md)

Demonstrates how to send a list of Intermediate Documents (IDocs) using the qRFC protocol to SAP from Apache Camel.

#### [sap-idoclist-server-spring-boot](sap-idoclist-server-spring-boot/README.md)

Demonstrates how to handle a list of Intermediate Documents (IDocs) from SAP within Apache Camel.   

---

## Additional Resources

For more information see:

* [Red Hat build of Apache Camel SAP Component Reference](https://docs.redhat.com/en/documentation/red_hat_build_of_apache_camel/4.0/html/red_hat_build_of_apache_camel_for_spring_boot_reference/csb-camel-sap-component-starter) - Documentation for the Red Hat build of Apache Camel SAP components
* [Red Hat build of Apache Camel Documentation](https://docs.redhat.com/en/documentation/red_hat_build_of_apache_camel/4.10) - General documentation for using Red Hat build of Apache Camel

## System Requirements

To run these quick starts you will need:

* Maven 3.6.2 or higher
* JDK 11 or higher
* Red Hat build of Apache Camel Spring Boot
* SAP JCo3 and IDoc3 libraries (sapjco3.jar, sapidoc3.jar and JCo native library for your OS platform) installed in your local Maven repository (see installation instructions below)
* SAP instance with [Flight Data Application](http://help.sap.com/saphelp_erp60_sp/helpdata/en/db/7c623cf568896be10000000a11405a/content.htm) setup

## Installing SAP Libraries in Your Local Maven Repository

To install the required SAP libraries in your Maven repository, you will need to run the following commands:

### Install JAR Libraries

```bash
mvn install:install-file -DgroupId=com.sap.conn.jco -DartifactId=sapjco3 -Dversion=3.1.13 -Dpackaging=jar -Dfile=sapjco3.jar

mvn install:install-file -DgroupId=com.sap.conn.idoc -DartifactId=sapidoc3 -Dversion=3.1.4 -Dpackaging=jar -Dfile=sapidoc3.jar
```

### Install Native Library

Installing the JCo native library depends on your operating system and architecture:

#### Linux x86 64-bit
```bash
mvn install:install-file -DgroupId=com.sap.conn.jco -DartifactId=sapjco3 -Dversion=3.1.13 -Dclassifier=linux-x86_64 -Dpackaging=so -Dfile=libsapjco3.so
```

#### macOS 64-bit (Intel)
```bash
mvn install:install-file -DgroupId=com.sap.conn.jco -DartifactId=sapjco3 -Dversion=3.1.13 -Dclassifier=macosx-x86_64 -Dpackaging=dylib -Dfile=libsapjco3.dylib
```

#### macOS ARM 64-bit (Apple Silicon)
```bash
mvn install:install-file -DgroupId=com.sap.conn.jco -DartifactId=sapjco3 -Dversion=3.1.13 -Dclassifier=macosx-aarch_64 -Dpackaging=dylib -Dfile=libsapjco3.dylib
```

#### Windows 64-bit
```bash
mvn install:install-file -DgroupId=com.sap.conn.jco -DartifactId=sapjco3 -Dversion=3.1.13 -Dclassifier=win-x86_64 -Dpackaging=dll -Dfile=sapjco3.dll
```

### Additional Information

* For more architectures, please see the [pom.xml](pom.xml#L376)
* When using different versions, please also change the version in [pom.xml](pom.xml#L46)


