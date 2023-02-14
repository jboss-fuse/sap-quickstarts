package com.redhat.quickstarts.fuse.sap_idoclist_destination_spring_boot;

import org.apache.camel.builder.RouteBuilder;

import org.springframework.stereotype.Component;

@Component
public class SAPRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("timer://init?repeatCount=1")
				.to("bean:flintstoneIDocList")
				.log("${body}")
				.to("sap-idoclist-destination:quickstartDest:FLCUSTOMER_CREATEFROMDATA01")
				.to("bean:rubbleIDocList")
				.log("${body}")
				.to("sap-idoclist-destination:quickstartDest:FLCUSTOMER_CREATEFROMDATA01");
	}
}
