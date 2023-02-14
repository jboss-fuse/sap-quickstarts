package com.redhat.quickstarts.fuse.sap_idoc_destination_spring_boot;

import org.fusesource.camel.component.sap.CurrentProcessorDefinitionInterceptStrategy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Instantiates processor beans which build a FLCUSTOMER_CREATEFROMDATA01 IDoc
 * and sets that IDoc in the body of the exchange's message.
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
	public CreateFredIDoc fredIDoc() {
		return new CreateFredIDoc();
	}

	@Bean
	public CreateBarneyIDoc barneyIDoc() {
		return new CreateBarneyIDoc();
	}

	@Bean
	public CreateWilmaIDoc wilmaIDoc() {
		return new CreateWilmaIDoc();
	}

	@Bean
	public CreateBettyIDoc bettyIDoc() {
		return new CreateBettyIDoc();
	}
}
