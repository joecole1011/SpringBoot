package com.kimzun.hellospringboot.hello;

import java.math.BigDecimal;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.kimzun.hellospringboot.hello.config.CodeCampConfig;
import com.kimzun.hellospringboot.hello.model.BankAccount;
import com.kimzun.hellospringboot.hello.model.BankAccountRepository;

@SpringBootApplication
@EnableConfigurationProperties(CodeCampConfig.class)
public class HelloApplication {
	@Autowired
	private BankAccountRepository bankRepository;
	
	@Autowired
	private CodeCampConfig config ;
	
	

	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
	}

	@Bean
	public CommandLineRunner CommandLineRunner(ApplicationContext ctx) {
		return args -> {
			
//			System.out.println("Test Test");
//			BankAccount account = new BankAccount("Kim", "Test", new BigDecimal(20000), 0);
//			bankRepository.save(account);
//			
//			Iterable<BankAccount> accs = bankRepository.findAll();
//			for (BankAccount acc : accs ) {
//				System.out.println(acc);				
//			}
			
		};
	}
	
	@Bean
	public CommandLineRunner CommandLineRunner2(ApplicationContext ctx) {
		return args -> {
			
			System.out.println("Test Configuration");
//			CodeCampConfig config   = new CodeCampConfig();
			System.out.println("Language = " + config.getLanguage() );
			System.out.println("Student = " + config.getStudent() );
			
		};
	}	
	
	
	
}

/*
 * @Bean public CommandLineRunner CommandLineRunner(ApplicationContext ctx){
 * return args ->{
 * System.out.println("Let's inspect the beans provided by Spring Boot:");
 * String[]beanNames =ctx.getBeanDefinitionNames(); Arrays.sort(beanNames);
 * for(String beanName : beanNames) { System.out.println(beanName);
 * 
 * } }; }
 */

//@Bean
//public CommandLineRunner CommandLineRunner(ApplicationContext ctx) {
//	return args -> {
//		
//		System.out.println("Let's inspect the beans provided by Spring Boot:");
//		String[] beanNames = ctx.getBeanDefinitionNames();
//		Arrays.sort(beanNames);
//		for (String beanName : beanNames) {
//			System.out.println(beanName);
//
//		}
//	};
//}
