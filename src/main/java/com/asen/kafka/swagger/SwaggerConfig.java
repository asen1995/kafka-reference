package com.asen.kafka.swagger;

import javax.xml.datatype.XMLGregorianCalendar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicates;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket newsApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.directModelSubstitute(XMLGregorianCalendar.class, String.class)
				.apiInfo(apiInfo())
				.select()
				.apis(Predicates.or(
						RequestHandlerSelectors.basePackage("com.asen.kafka.bpcs")))
				.paths(PathSelectors.any())
				.build();
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("Services Swagger for Kafka")
				.description("Swagger for Kafka Services Project")
				.termsOfServiceUrl("<terms_of_service_url>")
				.contact(new Contact("<created_by>", "<contact_url>", "<contact_email>"))
				.license("<license_name>")
				.licenseUrl("<license_url>")
				.version("0.0.1")
				.build();
	}
}
