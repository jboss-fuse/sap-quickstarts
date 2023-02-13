package org.jboss.quickstarts.fuse.sap_srfc_server_spring_boot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Instantiates a processor bean which builds a request to the GetList method of the FlightCustomer BAPI
 * and sets that request in the body of the exchange's message.
 */
@Configuration
public class SAPConfiguration {

	@Bean
	public CreateResponse response() {
		return new CreateResponse();
	}
}
