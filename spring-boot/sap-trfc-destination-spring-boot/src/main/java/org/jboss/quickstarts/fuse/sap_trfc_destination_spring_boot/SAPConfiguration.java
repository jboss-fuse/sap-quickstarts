package org.jboss.quickstarts.fuse.sap_trfc_destination_spring_boot;

import org.fusesource.camel.component.sap.CurrentProcessorDefinitionInterceptStrategy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Instantiates processor beans which build requests to the GetList method of the FlightCustomer BAPI
 * and sets those requests in the body of the exchange's message.
 */
@Configuration
public class SAPConfiguration {

	/**
	 * Create interceptor to support tRFC processing.
	 */
	@Bean
	public CurrentProcessorDefinitionInterceptStrategy currentProcessorDefinitionInterceptor() {
		return new CurrentProcessorDefinitionInterceptStrategy();
	}

	@Bean
	public CreateFredRequest fredRequest() {
		return new CreateFredRequest();
	}

	@Bean
	public CreateBarneyRequest barneyRequest() {
		return new CreateBarneyRequest();
	}

	@Bean
	public CreateWilmaRequest wilmaRequest() {
		return new CreateWilmaRequest();
	}

	@Bean
	public CreateBettyRequest bettyRequest() {
		return new CreateBettyRequest();
	}
}
