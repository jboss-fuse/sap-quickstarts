package com.redhat.quickstarts.fuse.sap_qidoc_destination_spring_boot;

import org.apache.camel.builder.RouteBuilder;

import org.springframework.stereotype.Component;

/**
 * Here is an example route which builds and sends a list of FLCUSTOMER_CREATEFROMDATA01 IDocs
 * to add Flight Customers records within an SAP System. The list of IDocs are sent to the inbound
 * queue `QUICKSTARTQUEUE` in SAP via a queued IDoc List endpoints. When this queue is triggered,
 * the document lists are delivered in order to the ALE subsystem.
 */
@Component
public class SAPRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("timer://init?repeatCount=1")
				.to("bean:flintstoneIDocList")
				.log("${body}")
				.to("sap-qidoclist-destination:quickstartDest:QUICKSTARTQUEUE:FLCUSTOMER_CREATEFROMDATA01")
				.to("bean:rubbleIDocList")
				.log("${body}")
				.to("sap-qidoclist-destination:quickstartDest:QUICKSTARTQUEUE:FLCUSTOMER_CREATEFROMDATA01\"");
	}
}
