# SAP Quick Starts

**This directory contains a set of quick start projects to get you started with using the suite of Red Hat build of Apache Camel SAP components in a standalone Camel runtime.**

![SAP Tool Suite](../sap_tool_suite.png "SAP Tool Suite")

## Project Information

| Field | Value |
|-------|-------|
| **Author** | William Collins - Fuse Team |
| **Level** | Beginner to Advanced |
| **Technologies** | SAP, Camel, Spring |
| **Summary** | These quick starts demonstrate how to configure and use the suite of Red Hat build of Apache Camel SAP components to integrate Apache Camel with SAP |
| **Target Product** | Red Hat build of Apache Camel for Spring Boot |
| **Source** | <http://github.com/jboss-fuse/sap-quickstarts/> |  

## Quick Start Projects

It is recommended that you study and run the quick starts in the following order:

### 1. [sap-srfc-destination-standalone](sap-srfc-destination-standalone/README.md)
Demonstrates how to perform *Synchronous Remote Function Calls* (sRFC) to SAP from Apache Camel.

### 2. [sap-trfc-destination-standalone](sap-trfc-destination-standalone/README.md)
Demonstrates how to perform *Transactional Remote Function Calls* (tRFC) to SAP from Apache Camel.

### 3. [sap-qrfc-destination-standalone](sap-qrfc-destination-standalone/README.md)
Demonstrates how to perform *Queued Remote Function Calls* (qRFC) to SAP from Apache Camel.

### 4. [sap-srfc-server-standalone](sap-srfc-server-standalone/README.md)
Demonstrates how to handle *Synchronous Remote Function Calls* (sRFC) from SAP within Apache Camel.

### 5. [sap-trfc-server-standalone](sap-trfc-server-standalone/README.md)
Demonstrates how to handle *Transactional Remote Function Calls* (tRFC) from SAP within Apache Camel.

### 6. [sap-idoc-destination-standalone](sap-idoc-destination-standalone/README.md)
Demonstrates how to send an Intermediate Document (IDoc) to SAP from Apache Camel.

### 7. [sap-idoclist-destination-standalone](sap-idoclist-destination-standalone/README.md)
Demonstrates how to send a list of Intermediate Document (IDoc) to SAP from Apache Camel.

### 8. [sap-qidoc-destination-standalone](sap-qidoc-destination-standalone/README.md)
Demonstrates how to send an Intermediate Document (IDoc) using the qRFC protocol to SAP from Apache Camel.

### 9. [sap-qidoclist-destination-standalone](sap-qidoclist-destination-standalone/README.md)
Demonstrates how to send a list of Intermediate Document (IDoc) using the qRFC protocol to SAP from Apache Camel.

### 10. [sap-idoclist-server-standalone](sap-idoclist-server-standalone/README.md)
Demonstrates how to handle a list of Intermediate Document (IDoc) from SAP within Apache Camel.   

## Additional Resources

For more information see:

* [Red Hat build of Apache Camel SAP Component Reference](https://docs.redhat.com/en/documentation/red_hat_build_of_apache_camel/4.10/html/red_hat_build_of_apache_camel_for_spring_boot_reference/csb-camel-sap-component-starter) - Comprehensive documentation for the Red Hat build of Apache Camel SAP components
* [Red Hat Fuse Product Page](https://access.redhat.com/products/red-hat-fuse) - General information about Red Hat Fuse

## System Requirements

To run these quick starts you will need:

* **Maven** 3.6.2 or higher
* **JDK** 11 or higher
* **Red Hat build of Apache Camel for Spring Boot**
* **SAP Libraries:**
  * SAP JCo3 library (sapjco3.jar)
  * SAP IDoc3 library (sapidoc3.jar)
  * JCo native library for your OS platform
* **SAP System:** SAP instance with [Flight Data Application](http://help.sap.com/saphelp_erp60_sp/helpdata/en/db/7c623cf568896be10000000a11405a/content.htm) configured
