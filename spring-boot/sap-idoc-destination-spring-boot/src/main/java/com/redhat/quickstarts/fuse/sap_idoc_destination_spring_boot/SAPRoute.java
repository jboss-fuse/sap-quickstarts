package com.redhat.quickstarts.fuse.sap_idoc_destination_spring_boot;

import org.apache.camel.builder.RouteBuilder;

import org.springframework.stereotype.Component;

/**
 * Here is an example route which builds and sends FLCUSTOMER_CREATEFROMDATA01 IDocs
 * to add Flight Customers records within an SAP System. The IDocs are sent to the ALE
 * subsytem in SAP via a transactional IDoc endpoints.
 */
@Component
public class SAPRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("timer://init?repeatCount=1")
				.to("bean:fredIDoc")
				.log("${body}")
				.to("sap-idoc-destination:quickstartDest:FLCUSTOMER_CREATEFROMDATA01")
				.to("bean:barneyIDoc")
				.log("${body}")
				.to("sap-idoc-destination:quickstartDest:FLCUSTOMER_CREATEFROMDATA01")
				.to("bean:wilmaIDoc")
				.log("${body}")
				.to("sap-idoc-destination:quickstartDest:FLCUSTOMER_CREATEFROMDATA01")
				.to("bean:bettyIDoc")
				.log("${body}")
				.to("sap-idoc-destination:quickstartDest:FLCUSTOMER_CREATEFROMDATA01");
	}
}
