package org.jboss.quickstarts.fuse.sap_srfc_server_spring_boot;

import org.apache.camel.builder.RouteBuilder;

import org.springframework.stereotype.Component;

/**
 * Here is an example route which builds a request to the GetList method of the FlightCustomer BAPI
 * to retrieve the list of Flight Customers within an SAP System. The request is sent to SAP via a
 * synchronous RFC endpoint to the BAPI method which also receives back a response containing
 * the list of Flight Customers.
 */
@Component
public class SAPRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("sap-srfc-server:quickstartServer:BAPI_FLCUST_GETLIST")
				.log("${body}")
				.to("bean:response")
				.log("${body}");
	}
}
