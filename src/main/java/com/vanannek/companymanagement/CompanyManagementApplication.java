package com.vanannek.companymanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class CompanyManagementApplication {

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

	@Bean
	public WebClient.Builder getWebClientBuilder() {
		return WebClient.builder();
	}

	public static void main(String[] args) {
		SpringApplication.run(CompanyManagementApplication.class, args);

//		String url = "https://localhost:8081/user";
//
//		WebClient.Builder builder = WebClient.builder();
//
//		String  catFact = "";
//		try {
//			catFact = builder.build()
//					.get()
//					.uri(url)
//					.retrieve()
//					.bodyToMono(String.class)
//					.block();
//		} catch (Exception ex) {
//			ex.printStackTrace();
//		}
//		System.out.println();
//		System.out.println();
//		System.out.println();
//		System.out.println(catFact);
//		System.out.println();
//		System.out.println();
//		System.out.println();
	}

}
