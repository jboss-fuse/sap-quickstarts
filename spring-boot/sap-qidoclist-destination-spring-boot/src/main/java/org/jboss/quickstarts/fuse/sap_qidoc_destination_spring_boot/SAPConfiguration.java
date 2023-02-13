package org.jboss.quickstarts.fuse.sap_qidoc_destination_spring_boot;

import org.fusesource.camel.component.sap.CurrentProcessorDefinitionInterceptStrategy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Instantiates processor beans which build lists of FLCUSTOMER_CREATEFROMDATA01 IDocs
 * and sets those lists in the body of the exchange's message.
 */
@Configuration
public class SAPConfiguration {

	/**
	 * Create interceptor to support tRFC processing
	 */
	@Bean
	public CurrentProcessorDefinitionInterceptStrategy currentProcessorDefinitionInterceptor()  {
		return new CurrentProcessorDefinitionInterceptStrategy();
	}

	@Bean
	public CreateFlintstoneIDocList flintstoneIDocList()  {
		return new CreateFlintstoneIDocList();
	}

	@Bean
	public CreateRubbleIDocList rubbleIDocList()  {
		return new CreateRubbleIDocList();
	}
}
