package com.redhat.quickstarts.fuse.sap_trfc_server_spring_boot;

import org.apache.camel.builder.RouteBuilder;

import org.springframework.stereotype.Component;

@Component
public class SAPRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("sap-trfc-server:quickstartServer:BAPI_FLCUST_CREATEFROMDATA")
				.log("${body}");
	}
}
