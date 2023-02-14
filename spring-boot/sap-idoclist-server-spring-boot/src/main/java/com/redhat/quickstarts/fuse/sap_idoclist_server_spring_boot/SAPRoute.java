package com.redhat.quickstarts.fuse.sap_idoclist_server_spring_boot;

import org.apache.camel.builder.RouteBuilder;

import org.springframework.stereotype.Component;

@Component
public class SAPRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("sap-idoclist-server:quickstartServer:FLCUSTOMER_CREATEFROMDATA01")
				.convertBodyTo(String.class)
				.log("${body}");
	}
}
