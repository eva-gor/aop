package evagor.bl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.aspectj.EnableSpringConfigured;
import org.springframework.scheduling.annotation.EnableScheduling;

import jakarta.annotation.*;
import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
public class TestApplication {

	@Autowired
	MyService service;
	
	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}

	@PostConstruct
	void init() {
		service.doSomething(); 
	}

}
