package com.redhat.quickstarts.fuse.sap_qrfc_destination_spring_boot;

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
				.to("bean:fredRequest")
				.log("${body}")
				.to("sap-qrfc-destination:quickstartDest:QUICKSTARTQUEUE:BAPI_FLCUST_CREATEFROMDATA")
				.to("bean:barneyRequest")
				.log("${body}")
				.to("sap-qrfc-destination:quickstartDest:QUICKSTARTQUEUE:BAPI_FLCUST_CREATEFROMDATA")
				.to("bean:wilmaRequest")
				.log("${body}")
				.to("sap-qrfc-destination:quickstartDest:QUICKSTARTQUEUE:BAPI_FLCUST_CREATEFROMDATA")
				.to("bean:bettyRequest")
				.log("${body}")
				.to("sap-qrfc-destination:quickstartDest:QUICKSTARTQUEUE:BAPI_FLCUST_CREATEFROMDATA");
	}
}
